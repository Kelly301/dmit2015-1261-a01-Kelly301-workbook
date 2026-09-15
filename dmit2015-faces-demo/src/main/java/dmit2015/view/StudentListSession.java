package dmit2015.view;

import dmit2015.model.StudentInfo;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class StudentListSession implements Serializable {

    private List<StudentInfo> studentInfos = new ArrayList<>(); // getter

    public List<StudentInfo> getStudentInfos() {
        return studentInfos;
    }

    public void addStudentInfo(StudentInfo newStudentInfo) {
        studentInfos.add(newStudentInfo);
    }

    public void removeStudentInfo(StudentInfo selectedStudentInfo) {
        studentInfos.remove(selectedStudentInfo);
    }
}
