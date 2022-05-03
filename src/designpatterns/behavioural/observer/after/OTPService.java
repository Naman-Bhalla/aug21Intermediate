package designpatterns.behavioural.observer.after;

public class OTPService implements SignUpEventSubscriber {
//    OTPService(Flipkart flipkart) {
//        flipkart.registerSignUpEventSubscriber(this);
//    }

    OTPService() {}

    public void sendOTP(String phoneNumber) {
        System.out.println("Sent OTP");
    }

    @Override
    public void listenSignUpEvent(User user) {
        sendOTP(user.phone);
    }
}
