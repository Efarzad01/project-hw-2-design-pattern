package creational.builder.design.pattern;

/*
  Builder Design Pattern is a category of Creational pattern and it
  is a way to construct complex object.

  Below is the User class that have some private fields/attributes.

  Please implement Builder Design Pattern.

  To design this pattern, whatever number of classes needed, please feel free to
  implement those.
 */
public class User {
    private String userName;
    private String userEmail;
    private String userSSN;
    private int userAge;

    public User(UserBuilder userBuilder){
        this.userName = userBuilder.userName;
        this.userEmail = userBuilder.userEmail;
        this.userSSN = userBuilder.userSSN;
        this.userAge = userBuilder.userAge;

    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserSSN() {
        return userSSN;
    }

    public int getUserAge() {
        return userAge;
    }


    public static class UserBuilder {

        private String userName;
        private String userEmail;
        private String userSSN;
        private int userAge;


        public UserBuilder(String userName, String userSSN, int age){
            this.userName = userName;
            this.userSSN = userSSN;
            this.userAge = age;
        }

        public UserBuilder withEmail(String email){
             this.userEmail = email;
             return this;
        }


        public User build(){
            return new User(this);
        }

    }




}
