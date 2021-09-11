package Controller;

import models.User;

public class Email {

    private User userMail;

    public boolean login(User userMail) {
        this.userMail = userMail;
        return true;
    }

    public boolean send(String subject, String content) {
        System.out.println("\n########################################");
        System.out.println("Email has been sent successfully!\nto: " + userMail.getEmail() +
                "\nsubject: " + subject +
                "\ncontent: " + content);
        System.out.println("########################################\n");

        return true;
    }

}
