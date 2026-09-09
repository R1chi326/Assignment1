public class EmailDirector {
    public void makeWelcomeEmail(EmailBuilder builder, String userEmail) {
        builder.setTo(userEmail)
               .setSubject("Welcome to Our Service!")
               .setBody("Thank you for registering with us. We are happy to have you!");
    }

    public void makePasswordResetEmail(EmailBuilder builder, String userEmail) {
        builder.setTo(userEmail)
               .setSubject("Password Reset Request")
               .setBody("Click the link below to reset your password. If you didn't request this, ignore this email.");
    }
}