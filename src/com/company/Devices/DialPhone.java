package com.company.Devices;

import java.util.Scanner;

public class DialPhone extends Phone{
    boolean hasAnswerphone;

    public DialPhone(boolean hasAnswerphone) {
        this.hasAnswerphone = hasAnswerphone;
    }

    void autoAnswer() {
        System.out.println("Оставьте сообщение после сигнала...");
    }

    @Override
    void call() {
        System.out.println("Совершаю вызов...");
        if (hasAnswerphone) {
            System.out.println("Хорошего вам разговора");
        }
        else {
            System.out.println("Хотите оставить сообщение?");
            Scanner sc = new Scanner(System.in);
            String ans = sc.nextLine();
            if (ans.toLowerCase().equals("да")) {
                autoAnswer();
            }
            else if(ans.toLowerCase().equals("нет")) {
                System.out.println("Вызов завершен");
            }
        }
    }
}
