package com.version.control;

import models.User;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        user.setName("ali");
        user.setEmail("info@email.com");

        boolean result = user.sendEmail("Salam", "Content of email placed here!!");
        if (result)
            System.out.println("OK");
    }

}
