/**
 * UNIT TWO (2) FINAL ASSESSMENT
 * back-end of music streaming app: user account settings
 * group project with James Wong and Michael Zhou
 * doc: https://docs.google.com/document/d/16QeONBDjzw7YelEpWf7fzxyFRauphnHRwBJ4ydkLy88/edit#
 *
 * this is the user account settings.
 *
 * Course: ICS4U1
 * Date: April 29 2022
 * @author Jessica Lu
 */

public class AccountSettings {
    /* attributes */

    /** account username */
    private String username;
    /** account password */
    private String password;
    /** account email */
    private String email;
    /** account display name */
    private String displayName;
    /** user date of birth */
    private String dateOfBirth;
    /** whether explicit content is allowed to play or not */
    private boolean isExplicitOn;
    /** whether autoplay is on or not */
    private boolean isAutoplayOn;
    /** whether private listening is on or not */
    private boolean isPrivateListeningOn;

    /* constructors */
    /**
     * Name: AccountSettings
     * Description: a user's settings in a music streaming app. data read in from a text file, not passed as parameters
     * @param username account username
     * @param password account password
     * @param email account connected email
     * @param displayName account display name
     * @param dateOfBirth user date of birth
     */
    public AccountSettings(String username, String password, String email, String displayName, String dateOfBirth) {
            this.username = username;
            this.password = password;
            this.email = email;
            this.displayName = displayName;
            this.dateOfBirth = dateOfBirth;

            // default settings
            this.isExplicitOn = true;
            this.isAutoplayOn = true;
            this.isPrivateListeningOn = false;
    }

    /* accessors */
    /**
     Name: getUsername
     Description: return the account username
     @return account username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     Name: getPassword
     Description: return the account password
     @return account password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     Name: getEmail
     Description: return the account's email
     @return account email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     Name: getDisplayName
     Description: return the account's display name
     @return account display name
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     Name: getDateOfBirth
     Description: return the user's date of birth
     @return user date of birth
     */
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    /**
     Name: getIsExplicitOn
     Description: return whether explicit content can be played or not
     @return whether explicit content can be played or not
     */
    public boolean getIsExplicitOn() {
        return this.isExplicitOn;
    }

    /**
     Name: getIsAutoplayOn
     Description: return whether autoplay is on or not
     @return whether autoplay is ont or not
     */
    public boolean getIsAutoplayOn() {
        return this.isAutoplayOn;
    }

    /**
     Name: getIsPrivateListeningOn
     Description: return whether private listening is on or not
     @return whether private listening is on or not
     */
    public boolean getIsPrivateListeningOn() {
        return this.isPrivateListeningOn;
    }

    /* mutators */
    /**
     * Name: setDisplayName
     * Description: set a new account display name
     * @param newDisplayName new possible display name
     */
    public void setDisplayName(String newDisplayName) {
        // new display name must have between 1 and 30 (inclusive) characters
        if (newDisplayName.length() >= 1  && newDisplayName.length() <= 30) {
            this.displayName = newDisplayName;
        }
    }

    /**
     * Name: setDateOfBirth
     * Description: set a new user date of birth
     * @param newDateOfBirth new possible date of birth
     */
    public void setDateOfBirth(String newDateOfBirth) {
        // assumes that the input will be valid (in mmddyyyy form) because if users
        // were to actually change their DOB it would be from a scroll that denies invalid input
        this.dateOfBirth = newDateOfBirth;
    }

    /**
     * Name: setIsExplicitOn
     * Description: turn on/off the explicit content setting
     * @param newIsExplicitOn new explicit content setting, if it can play or not
     */
    public void setIsExplicitOn(boolean newIsExplicitOn) {
        this.isExplicitOn = newIsExplicitOn;
    }

    /**
     * Name: setIsAutoplayOn
     * Description: turn on/off autoplay
     * @param newIsAutoplayOn new autoplay setting, if it is on or not
     */
    public void setIsAutoplayOn(boolean newIsAutoplayOn) {
        this.isAutoplayOn = newIsAutoplayOn;
    }

    /**
     * Name: setIsPrivateListeningOn
     * Description: turn on/off private listening
     * @param newIsPrivateListeningOn new private listening setting, if it is on or not
     */
    public void setIsPrivateListeningOn(boolean newIsPrivateListeningOn) {
        this.isPrivateListeningOn = newIsPrivateListeningOn;
    }

    /* other methods */

    // STILL HAVE TO DO THIS:
    // changePassword()

    /**
     * Name: changePassword
     * Description: changes password if given valid input
     * - types in correct old password
     * - new password is between 8-20 characters
     * - has at least one uppercase letter
     * - has at least one lowercase letter
     * - has at least one digit
     * @param oldPassword oldPassword
     * @param newPassword new possible password
     * @param newPasswordAgain new possible password again
     */
    public void changePassword(String oldPassword, String newPassword, String newPasswordAgain) {
        // requires user to type in the old password and the new password twice.
        // password is between 8-20 chars
        // password has at least one uppercase letter, one lowercase letter, and one digit

        boolean hasDigit = false;
        boolean hasLowercase = false;
        boolean hasUppercase = false;

        if (oldPassword.equals(this.password)) { // if entered old password is the same as what the old password actually is
            if (newPassword.length() >= 8 && newPassword.length() <= 20) { // if new password is between 8-20 characters

                // searches each character in the string for digit, uppercase, lowercase
                for (int i = 0; i < newPassword.length(); i++) {
                    char ch = newPassword.charAt(i);
                    if (Character.isDigit(ch)) { // true if character is a digit
                        hasDigit = true;
                    } else if (Character.isUpperCase(ch)) { // true if character is an uppercase letter
                        hasUppercase = true;
                    } else if (Character.isLowerCase(ch)) { // true if character is a lowercase letter
                        hasLowercase = true;
                    }
                }

                // changing password + output
                if (hasDigit && hasLowercase && hasUppercase) { // if newPassword input is valid
                    if (newPassword.equals(newPasswordAgain)) { // if both new password input is the same
                        this.password = newPassword;
                        System.out.println("Your password has been changed.");
                    } else {
                        System.out.println("Your new passwords do not match. \nYour password has not been changed.");
                    }
                } else {
                    System.out.println("Your new password does not meet the password requirements. \nMust include at least: 1 lowercase letter, 1 uppercase letter, 1 digit.\nYour password has not been changed.");
                }
            } else {
                System.out.println("Your new password must be between 8-20 characters. \nYour password has not been changed.");
            }
        } else { // output that old passwords don't match
            System.out.println("Your old passwords do not match. \nYour password has not been changed.");
        }

    }

    /**
     * Name: changeEmail
     * Description: changes account email if the email is valid
     * - email must end in "@gmail.com"
     * - email username is 6 to 30 characters
     * - only has letters, digits, periods
     * - cannot start or end with a period, cannot have 2 periods in a row
     * @param newEmail new possible email
     */
    public void changeEmail(String newEmail) {
        // change email

        String emailUsername;

        boolean validInput;

        if (newEmail.equals(this.email)) { // input email is the same as current email, cannot change it
            System.out.println("This is your current email.");
        } else if (newEmail.endsWith("@gmail.com")) { // input email ends with "@gmail.com"
            emailUsername = newEmail.replace("@gmail.com", ""); // variable stores only the email username
            if (emailUsername.length() >= 6 && emailUsername.length() <= 30) { // if email username is 6 - 30 characters long

                // goes through the entire string to check if it is made up of fully letters / digits / periods
                validInput = true;
                for (int i = 0; i < emailUsername.length(); i++) {
                    char ch = emailUsername.charAt(i);
                    if (!(Character.isLetterOrDigit(ch) || ch == '.')) { // if the letter is not a letter/digit/period then validChars = false
                        validInput = false;
                    }
                }

                if (validInput) { // has valid characters
                    // checks for periods (cannot start / end with period, cannot have 2 periods in a row)
                    if (emailUsername.charAt(0) == '.' || emailUsername.charAt(emailUsername.length() - 1) == '.') { // if email starts or ends with a period
                        System.out.println("Your email username cannot start or end with a period.");
                    } else { // either valid input or there are consecutive periods

                        emailUsername = emailUsername + " ";
                        for (int i = 0; i < emailUsername.length(); i++) {
                            if (emailUsername.charAt(i) == '.' && emailUsername.charAt(i) == emailUsername.charAt(i+1)) { // if there are 2 consecutive periods
                                validInput = false;
                            }
                        }

                        if (validInput) { // valid input, email is changed
                            this.email = newEmail;
                            System.out.println("Your email has been changed to " + newEmail + ".");
                        } else { // invalid input, consecutive periods
                            System.out.println("Your email username cannot have consecutive periods.");
                        }
                    }
                } else { // has invalid characters
                    System.out.println("Your email username may only have letters, digits, and periods.");
                }
            } else { // email username is not in 8-30 character range
                System.out.println("Your email username (everything before \"@gmail.com\" must be between 6 and 30 characters long.)");
            }
        } else { // input email does not end with "@gmail.com"
            System.out.println("At this current time, only gmail emails are accepted.");
        }
    }

    /**
     * Name: toString
     * Description: returns all user attributes
     * @return all user data + settings
     */
    public String toString() {
        String lines;
        lines = "Username: " + this.username + "\nPassword: " + this.password + "\nEmail: " + this.email + "\nDisplay Name: " + this.displayName + "\nDate Of Birth: " + this.dateOfBirth + "\n\nAllow Explicit Content: " + this.isExplicitOn + "\nAutoplay On: " + this.isAutoplayOn + "\nPrivate Listening On: " + this.isPrivateListeningOn;
        return lines;
    }

    // testing every method
    public static void main(String[] args) {
        // constructor (creating an account)
        AccountSettings account = new AccountSettings("MYUSERNAME", "myCoolPW1", "mycoolemail@gmail.com", "luvr", "10192004");

        // accessors
        System.out.println("ACCESSORS");
        System.out.println("Username: " + account.getUsername());
        System.out.println("Password: " + account.getPassword());
        System.out.println("Email: " + account.getEmail());
        System.out.println("Display Name: " + account.getDisplayName());
        System.out.println("Date Of Birth (mmddyyyy): " + account.getDateOfBirth());
        System.out.println("Explicit Content On: " + account.getIsExplicitOn());
        System.out.println("Autoplay On: " + account.getIsAutoplayOn());
        System.out.println("Private Listening On: " + account.getIsPrivateListeningOn());

        System.out.println();
        System.out.println("-----------");
        System.out.println();

        // mutators
        System.out.println("MUTATORS");
        System.out.println();

        System.out.println("Setting displayName:");
        account.setDisplayName(""); // invalid (too short)
        System.out.println(account.getDisplayName()); // note that display name doesn't change
        account.setDisplayName("jessica!!"); // valid
        System.out.println(account.getDisplayName()); // display name now changes, from luvr to jessica!!
        System.out.println();

        System.out.println("Setting dateOfBirth:");
        account.setDateOfBirth("01012000"); // setting dob to january 1st, 2000
        System.out.println(account.getDateOfBirth());
        System.out.println();

        System.out.println("Setting isExplicitOn:");
        account.setIsExplicitOn(false);
        System.out.println(account.getIsExplicitOn());
        System.out.println();

        System.out.println("Setting isAutoplayOn:");
        account.setIsAutoplayOn(true);
        System.out.println(account.getIsAutoplayOn());
        System.out.println();

        System.out.println("Setting isPrivateListeningOn:");
        account.setIsPrivateListeningOn(true);
        System.out.println(account.getIsPrivateListeningOn());
        System.out.println();

        System.out.println();
        System.out.println("-----------");
        System.out.println();

        // other methods
        System.out.println("OTHER METHODS:");

        System.out.println("Demonstrating changePassword()");

        account.changePassword("not right pw", "1", ""); // old passwords do not match
        System.out.println();
        account.changePassword("myCoolPW1!", "aBcDe1234", "edCba4321"); // new passwords do not match
        System.out.println();
        account.changePassword("myCoolPW1!", "abcdefg", "abcdefg"); // pw does not meet character requirements
        System.out.println();
        account.changePassword("myCoolPW1!", "aa", "aa"); // pw does not meet character length requirements (8-20 characters)
        System.out.println();
        account.changePassword("myCoolPW1!", "aBetterPW1", "aBetterPW1"); // valid new password, password is changed
        System.out.println();

        System.out.println("Demonstrating changeEmail()");
        account.changeEmail("coolemail@yahoo.com"); // invalid, only takes "@gmail.com" emails
        account.changeEmail(".abcdefgh@gmail.com"); // invalid, cannot start or end email username with a period (.)
        account.changeEmail("woo@gmail.com"); // invalid, email username must be between 6 and 30 characters long
        account.changeEmail("lets..go@gmail.com"); // invalid, cannot have consecutive periods
        account.changeEmail("letsgo!!@gmail.com"); // invalid, cannot have characters that are not letters, digits, or periods
        account.changeEmail("valid.email@gmail.com"); // valid email!! account email is changed to this
        System.out.println();

        System.out.println("Demonstrating toString()");
        System.out.println(account.toString());
    }
}
