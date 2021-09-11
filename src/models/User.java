package models;

public class User {
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInormation() {
        return this.toString();
    }

    public boolean sendEmail(String subject, String content) {
        System.out.println("\n########################################");
        System.out.println("Email has been sent successfully!\nto: " + this.email +
                "\nsubject: " + subject +
                "\ncontent: " + content);
        System.out.println("########################################\n");

        return true;
    }

    @Override
    public String toString() {
        return "User -> {" +
                "name = " + name +
                ", email = " + email +
                "}";
    }
}
