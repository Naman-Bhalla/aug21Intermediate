package designpatterns.behavioural.strategy;

public class SimpleEncodePasswordBehaviour
implements EncodePasswordBehaviour {

    @Override
    public String encode(String password) {
        String encodedPassword = password + "encoded";
        encodedPassword += "something";

        return encodedPassword;
    }
}
