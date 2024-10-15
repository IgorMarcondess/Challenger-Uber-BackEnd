package com.marcondez.email_service.adapters;

public interface EmailSenderGateway {
    /*AQUI CRIAMOS A INTERFACE PARA ADPTAR OS SOFTWARES OU FRAMEWORKS EXTERNOS PARA
    * NOSSA APLICAÇÃO */

    void sendEmail(String to, String subject, String body);
}
