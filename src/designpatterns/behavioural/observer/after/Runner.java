package designpatterns.behavioural.observer.after;

public class Runner {

    public static void main(String[] args) {
//        Flipkart flipkart = new Flipkart();
//        NewsletterService newsletterService = new NewsletterService(flipkart);
//        OTPService otpService = new OTPService(flipkart);
//        ValidatorService validatorService = new ValidatorService(flipkart);

        Flipkart flipkart = new Flipkart();
        NewsletterService newsletterService = new NewsletterService();
        ValidatorService validatorService = new ValidatorService();

        flipkart.registerSignUpEventSubscriber(newsletterService);
        flipkart.registerSignUpEventSubscriber(validatorService);

        flipkart.signUp(new User());
    }
}
