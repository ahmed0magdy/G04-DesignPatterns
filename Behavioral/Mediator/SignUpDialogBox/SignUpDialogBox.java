package Behavioral.Mediator.SignUpDialogBox;

public class SignUpDialogBox { // acts as both an observer and a mediator
    private TextBox usernameBox = new TextBox();
    private TextBox passwordBox = new TextBox();
    private CheckBox termsCheckBox = new CheckBox();
    private Button signUpButton = new Button();

    public SignUpDialogBox() {
        // loose coupling
        usernameBox.attach(this::formChanged);
        passwordBox.attach(this::formChanged);
        termsCheckBox.attach(this::formChanged);
    }

    private void formChanged() {
        signUpButton.setEnabled(isFormValid());
    }

    private boolean isFormValid() {
        return !usernameBox.isEmpty() && !passwordBox.isEmpty() && termsCheckBox.isChecked();
    }

    public void stimulateUserInteraction() {
        // Initially the button should be disabled
        System.out.println("Sign Up Button: " + signUpButton.isEnabled());

        // The user enters their username, the button is still disabled
        usernameBox.setContent("username");
        System.out.println("After setting the username: " + signUpButton.isEnabled());

        // The user enters their password, the button is still disabled
        passwordBox.setContent("password");
        System.out.println("After setting the password: " + signUpButton.isEnabled());

        // The agrees to the terms, the button becomes enabled
        termsCheckBox.setChecked(true);
        System.out.println("After agreeing to terms: " + signUpButton.isEnabled());

        // The user removes the password, the button becomes disabled
        passwordBox.setContent("");
        System.out.println("After removing the password: " + signUpButton.isEnabled());

        // The user enters the password again, the button becomes enabled
        passwordBox.setContent("password");
        System.out.println("After re-setting the password: " + signUpButton.isEnabled());
    }
}
