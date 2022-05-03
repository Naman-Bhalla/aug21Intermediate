package designpatterns.behavioural.observer.after;

public class NewsletterService implements SignUpEventSubscriber {
//    NewsletterService(Flipkart flipkart) {
//        flipkart.registerSignUpEventSubscriber(this);
//    }

//    NewsletterService() {}

    public void subscribeToNewsletter(String email) {
        System.out.println("Subscribed to newsletter");
    }

    @Override
    public void listenSignUpEvent(User user) {
        subscribeToNewsletter(user.email);
    }
}
