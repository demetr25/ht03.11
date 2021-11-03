package com.company.Interfaces;

public class Main2 {
    public static void main(String[] args) {
        DialPhone2 dp2 = new DialPhone2();
        dp2.call();
        System.out.println("=".repeat(80));

        SmartPhone2 sp2 = new SmartPhone2();
        sp2.sendMail("letter");
        sp2.editMail("letter");
        System.out.println("=".repeat(80));

        Post p1 = new Post();
        p1.sendMail("letter");
        System.out.println("=".repeat(80));

        MailSender[] letters = new MailSender[]{sp2,p1};
        main2(letters);
    }

    public static void main2(MailSender[] args) {
        for (int i = 0; i < args.length; i++) {
            args[i].sendMail("Письмо");
        }
    }
}
