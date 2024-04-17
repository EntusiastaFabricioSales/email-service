package com.sales.emailservice.core;

public interface EmailSenderUserCase {
    void sendEmail(String to, String subject, String body);
}
