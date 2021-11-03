package com.company.Interfaces;

import com.company.Interfaces.Caller;
import com.company.Interfaces.EmailSender;

import java.util.Scanner;

public class SmartPhone2 implements Caller, EmailSender {

    @Override
    public void call() {
        System.out.println("Делаю звонок...");
    }

    @Override
    public String createMail(String letter) {
        System.out.println("Введите письмо");
        Scanner sc1 = new Scanner(System.in);
        String anew = sc1.nextLine();
        return anew;
    }

    @Override
    public void sendMail(String letter) {
        System.out.println("Письмо "+"'"+createMail(letter)+"'"+ " было отправлено");
    }

    @Override
    public String editMail(String letter) {
        System.out.println("Введите старую версию письма");
        Scanner sc3 = new Scanner(System.in);
        String anOld = sc3.nextLine();
        System.out.println("Введите новую версию письма");
        Scanner sc2 = new Scanner(System.in);
        String anew = sc2.nextLine();
        System.out.println("Письмо "+"'"+anOld+"'"+" было изменено на "+"'"+anew+"'");
        return anew;
    }
}
