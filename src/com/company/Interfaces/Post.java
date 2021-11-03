package com.company.Interfaces;

import com.company.Interfaces.MailSender;

import java.util.Scanner;

public class Post implements MailSender {
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
}
