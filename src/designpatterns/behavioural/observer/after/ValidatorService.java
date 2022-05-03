package designpatterns.behavioural.observer.after;

public class ValidatorService implements SignUpEventSubscriber {

//    ValidatorService(Flipkart flipkart) {
//        flipkart.registerSignUpEventSubscriber(this);
//    }

    ValidatorService() {}

    public boolean validateUser(String email, String address) {
        System.out.println("Validated User");
        return false;
    }

    @Override
    public void listenSignUpEvent(User user) {
        validateUser(user.email, user.address);
    }
}
