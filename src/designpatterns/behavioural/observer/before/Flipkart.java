package designpatterns.behavioural.observer.before;

public class Flipkart {
    NewsletterService newsletterService = new NewsletterService();
    OTPService otpService = new OTPService();
    ValidatorService validatorService = new ValidatorService();

    public void signUp() {
        newsletterService.subscribeToNewsletter("email");
        otpService.sendOTP("phone");
        validatorService.validateUser("email", "address");
    }
}
