package com.Lecture8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        //Вводим строки в консоль и присваиваем логину, паролю
        System.out.println("Please, create a login");
        Scanner sc = new Scanner(System.in);
        String login = sc.nextLine();
        System.out.println("Please, create a password");
        Scanner sc1 = new Scanner(System.in);
        String password = sc1.nextLine();

        //Вводим повторно пароль
        System.out.println("Please, confirm the password");
        Scanner sc2 = new Scanner(System.in);
        String confirmPassword = sc2.nextLine();

        GenIn.userConfirmation(login, password, confirmPassword);





    }
}
