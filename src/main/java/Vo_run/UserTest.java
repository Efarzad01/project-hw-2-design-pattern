package Vo_run;

import creational.builder.design.pattern.User;

public class UserTest {

    public static void main(String[] args) {
        User user = new User.UserBuilder("Farzad", "009-20-9202", 25)
                .withEmail("test@gmail.com")
                .build();
        System.out.println("User Name : "+ user.getUserName() + "\nUser SSN : "+ user.getUserSSN()+ "\nUser email : "+ user.getUserEmail());
    }
}
