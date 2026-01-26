package service;

import logic.PasswordValidator;
import exception.PasswordException;

public class PasswordService {

    private PasswordValidator validator = new PasswordValidator();

    public void checkPassword(String password) throws PasswordException {
        validator.validate(password);
    }
}
