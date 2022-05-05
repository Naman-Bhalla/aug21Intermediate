package designpatterns.behavioural.strategy;

public class UserService {
    EncodePasswordBehaviour encodePasswordBehaviour;

//    SimpleEncodePasswordBehaviour encodePasswordBehaviour = new SimpleEncodePasswordBehaviour();
    UserService(EncodePasswordBehaviour encodePasswordBehaviour) {
        this.encodePasswordBehaviour = encodePasswordBehaviour;
    }

    void registerUser(String email,
                      String password,
                      String username) {

        String encodedPassword = encodePasswordBehaviour.encode(password);
    }
}

// Registry == Factory + Singleton