package logic;

import java.util.ArrayList;
import java.util.List;

public class PasswordValidator {
    private List<PasswordRule> rules;

    public PasswordValidator(List<PasswordRule> rules) {
        this.rules = rules;
    }

    public static PasswordValidator defaultRules() {
        List<PasswordRule> defaultRules = new ArrayList<>();
        defaultRules.add(new MinLengthRule(8));
        defaultRules.add(new NumberRule());
        defaultRules.add(new UppercaseRule());
        return new PasswordValidator(defaultRules);
    }

    public List<String> validate(String password) {
        List<String> errors = new ArrayList<>();

        for (PasswordRule rule : rules) {
            if (!rule.isValid(password)) {
                errors.add(rule.getErrorMessage());
            }
        }

        return errors;
    }

    public boolean isValid(String password) {
        return validate(password).isEmpty();
    }

    public List<PasswordRule> getRules() {
        return rules;
    }
}
