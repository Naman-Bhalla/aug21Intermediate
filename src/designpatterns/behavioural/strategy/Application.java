package designpatterns.behavioural.strategy;

import designpatterns.behavioural.observer.after.User;

public class Application {

    public static void main(String[] args) {
        UserService userService =
                new UserService(
                        new SimpleEncodePasswordBehaviour()
                );
    }
}
