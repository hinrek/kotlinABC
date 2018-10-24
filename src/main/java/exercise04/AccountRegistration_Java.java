package exercise04;

public class AccountRegistration_Java {

    public class RegistrationForm {
        final String firstName;
        final String lastName;
        final Integer age;

        RegistrationForm(String firstName, String lastName, Integer age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        @Override
        public String toString() {
            return "RegistrationForm(" +
                    "firstName=" + firstName +
                    ", lastName=" + lastName +
                    ", age=" + age +
                    ')';
        }
    }

    public RegistrationForm registerAccount(String firstName, String lastName, Integer age) {
        return new RegistrationForm(firstName, lastName, age);
    }
    public RegistrationForm registerAccount(String firstName, String lastName) {
        return registerAccount(firstName, lastName, 35);
    }
    public RegistrationForm registerAccount(String firstName, Integer age) {
        return registerAccount(firstName, "Parker", age);
    }
    public RegistrationForm registerAccount(String firstName) {
        return registerAccount(firstName, 35);
    }
}
