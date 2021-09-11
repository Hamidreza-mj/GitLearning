package com.version.control;

import Controller.Email;
import models.User;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        user.setName("ali");
        user.setEmail("info@email.com");

        Email email = new Email();
        boolean loginSuccess = email.login(user);

        if (loginSuccess) {
            boolean result = email.send("Salam", "Content of email placed here!!");

            if (result) {
                System.out.println("**************************************************\n*OK*  " +
                        user.getInormation() +
                        "\n**************************************************");
            }
        }

    }

}
