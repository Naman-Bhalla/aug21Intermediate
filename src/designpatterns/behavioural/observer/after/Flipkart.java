package designpatterns.behavioural.observer.after;

import oop.polymorphism.whenerror.A;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Flipkart {
    Set<SignUpEventSubscriber> signUpEventSubscribers = new HashSet<>();

    void registerSignUpEventSubscriber(SignUpEventSubscriber signUpEventSubscriber) {
        signUpEventSubscribers.add(signUpEventSubscriber);
    }

    void unregisterSignUpEventSubscriber(SignUpEventSubscriber signUpEventSubscriber) {
        signUpEventSubscribers.remove(signUpEventSubscriber);
    }

    public void signUp(User user) {
        for (SignUpEventSubscriber signUpEventSubscriber: signUpEventSubscribers) {
            signUpEventSubscriber.listenSignUpEvent(user);
        }
    }
}
