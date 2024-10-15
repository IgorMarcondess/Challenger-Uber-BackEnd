package com.marcondez.email_service.application;

import com.marcondez.email_service.adapters.EmailSenderGateway;
import com.marcondez.email_service.core.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;

public class EmailSenderService implements EmailSenderUseCase {
    /*CLASSE CRIADA PARA IMPLEMENTAR O CASO DE USO DO CORE (REGRA DE NEGÓCIO)
    * IMPLEMENTANDO A INTERFACE*/

    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailGateway){
        this.emailSenderGateway = emailGateway;
    }
    @Override
    public void sendEmail(String to, String subject, String body) {
        // Usando o método q veio através da injeção de dependência

        this.emailSenderGateway.sendEmail(to,subject,body);
    }

}
