package dmit2015.view;

import dmit2015.model.StudentInfo;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@ViewScoped
public class StudentFormBean implements Serializable {

    @Inject
    private StudentListSession studentListSession;

    private int submissionCount;

    private StudentInfo studentInfo = new StudentInfo();

    public void submit() {
        studentListSession.addStudentInfo(studentInfo);
        submissionCount++;
        FacesMessage message = new FacesMessage(
                FacesMessage.SEVERITY_INFO,
                "Form Submitted",
                String.format("Welcome %s to %s.", studentInfo.getFullName(), studentInfo.getProgram())
        );
        FacesContext.getCurrentInstance()
                .addMessage(null, message);

        // Clear form fields by assigning a new model
        studentInfo = new StudentInfo();
    }

    public int getSubmissionCount() {
        return submissionCount;
    }

    public StudentInfo getStudentInfo() {
        return studentInfo;
    }
}
