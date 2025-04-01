package testclass;

import java.util.logging.Logger;
import java.util.logging.Level;

public class LoginTest {
    private static final Logger logger = Logger.getLogger(LoginTest.class.getName());

    public static void main(String[] args) {
        String name = "Mayank";
        logger.log(Level.INFO, name);
    }
}