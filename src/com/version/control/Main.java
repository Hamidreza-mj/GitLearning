package com.version.control;

import models.User;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        user.setName("ali");
        user.setEmail("info@email.com");

        user.sendEmail("hello", "this is content of email");
    }

}
