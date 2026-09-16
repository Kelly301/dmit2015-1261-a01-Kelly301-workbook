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
    private String emailAddress;
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public boolean isOnlineDelivery() {
        return onlineDelivery;
    }

    public void setOnlineDelivery(boolean onlineDelivery) {
        this.onlineDelivery = onlineDelivery;
    }

    public void submit() {
        String deliveryMode = onlineDelivery ? "Online" : "In-Person";

        FacesMessage successMessage = new FacesMessage(
                FacesMessage.SEVERITY_INFO,
                "Registration Submitted",
                null
        );

        FacesMessage registrationDetails = new FacesMessage(
                FacesMessage.SEVERITY_INFO,
                String.format("%s registered for %s (%s)", studentName, courseName, deliveryMode),
                null
        );

        FacesMessage deliveryMessage = new FacesMessage(
                FacesMessage.SEVERITY_INFO,
                String.format("Delivery Mode: %s", deliveryMode),
                null
        );

        FacesContext.getCurrentInstance().addMessage(null, successMessage);
        FacesContext.getCurrentInstance().addMessage(null, registrationDetails);
        FacesContext.getCurrentInstance().addMessage("deliveryMessage", deliveryMessage);


    }




}
