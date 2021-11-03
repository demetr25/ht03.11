package com.company.Interfaces;

import com.company.Interfaces.MailSender;

public interface EmailSender extends MailSender {
    String editMail(String letter);
}
