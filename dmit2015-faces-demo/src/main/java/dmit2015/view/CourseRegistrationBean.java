package dmit2015.view;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@ViewScoped
public class CourseRegistrationBean implements Serializable {

    private String studentName;
    private String courseName;
    private boolean onlineDelivery;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public boolean isOnlineDelivery() {
        return onlineDelivery;
    }

    public void setOnlineDelivery(boolean onlineDelivery) {
        this.onlineDelivery = onlineDelivery;
    }

    public void submit() {
        String deliveryMode = onlineDelivery ? "Online" : "In-Person";

        FacesMessage message = new FacesMessage(
                FacesMessage.SEVERITY_INFO,
                "Registration Submitted",
                String.format("%s registered for %s (%s)", studentName, courseName, deliveryMode)
        );

        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
