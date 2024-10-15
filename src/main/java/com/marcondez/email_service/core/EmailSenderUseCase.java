package com.marcondez.email_service.core;

public interface EmailSenderUseCase {
    /*INTERFACE CRIADA PARA CASO DE USO (REGRA DE NEGÓCIO), ONDE SERÁ IMPLEMTENTADA
    * FUTURAMENTE*/

    void sendEmail (String to, String subject, String body);
}
