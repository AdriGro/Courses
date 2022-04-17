package com.Lecture8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GenIn {

    public static boolean userConfirmation(String login, String password, String confirmPassword) {

        //Создаем регулярку для логина и пароля
        String patternForLoginAndPassword = "\\w*";
        Pattern loginAndPasswordPattern = Pattern.compile(patternForLoginAndPassword);
        Matcher loginMatcher = loginAndPasswordPattern.matcher(login);
        Matcher passwordMatcher = loginAndPasswordPattern.matcher(password);

        //Создаем логические переменные
        //Отлавливаем жуков
        try{
            boolean loginVerification = loginMatcher.matches() && login.length() <= 20;
            if (!loginVerification) {
                throw new WrongLoginException("Login needs changing");
            }
            boolean passwordVerification = passwordMatcher.matches() && password.length() <= 20
                    && password.equals(confirmPassword);
            if (!passwordVerification) {
                throw new WrongPasswordException("Password needs changing");
            }
        } catch (WrongLoginException | WrongPasswordException ex1){
            System.out.println(ex1.getMessage());
            return false;
        }
        System.out.println("Validated");
        return true;
    }
}


