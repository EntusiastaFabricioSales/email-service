package com.sales.emailservice.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.emailservice.core.EmailSenderUserCase;

import com.sales.emailservice.adapters.EmailSenderGateway;

@Service
public class EmailSenderService implements EmailSenderUserCase {

    private final EmailSenderGateway EmailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway EmailSenderGateway)
    {
        this.EmailSenderGateway = EmailSenderGateway;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {
        this.EmailSenderGateway.sendEmail(to, subject, body);
    }
    
}
