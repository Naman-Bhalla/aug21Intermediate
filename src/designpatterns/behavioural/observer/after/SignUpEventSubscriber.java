package designpatterns.behavioural.observer.after;

// *Listener *Observer
public interface SignUpEventSubscriber {
    void listenSignUpEvent(User user);
}

// consumer/ subscriber/ listener/ observer