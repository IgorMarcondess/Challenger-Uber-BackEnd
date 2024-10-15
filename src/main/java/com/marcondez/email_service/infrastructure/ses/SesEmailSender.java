package com.marcondez.email_service.infrastructure.ses;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.model.*;
import com.marcondez.email_service.adapters.EmailSenderGateway;
import org.springframework.beans.factory.annotation.Autowired;

public class SesEmailSender implements EmailSenderGateway {

    private final AmazonSimpleEmailService amazonSimpleEmailService;

    @Autowired
    public SesEmailSender(AmazonSimpleEmailService amazonSimpleEmailService){
        this.amazonSimpleEmailService = amazonSimpleEmailService;
    }
    @Override
    public void sendEmail(String to, String subject, String body) {
        //Fazendo implementação do envio do e-mail com o software da Amazon

        //Fazendo o request para a Amazon
        SendEmailRequest request = new SendEmailRequest()
                //Quem está enviando o e-mail
                .withSource("igorpmarcondes1@gmail.com")
                //Quem vai receber o e-mail
                .withDestination(new Destination().withToAddresses(to))
                //Qual a mensagem (Assunto e corpo)
                .withMessage(new Message()
                        .withSubject(new Content(subject))
                        .withBody(new Body(new Content(body)))
                );
        try {
           this.amazonSimpleEmailService.sendEmail(request);
        } catch (AmazonServiceException exception){
            throw new EmailServiceException("Erro");
        }
    }
}
