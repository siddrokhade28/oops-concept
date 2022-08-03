package org.lambdaexpression;

@FunctionalInterface
public interface IValidator {
    boolean validator(String Regex, String userInput);
}
