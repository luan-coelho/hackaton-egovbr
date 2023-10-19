package br.unitins.hackaton.egovbr.handle.exceptionhandle;

import br.unitins.hackaton.egovbr.exception.ErrorResponse;

public interface ExceptionHandler {

    void handleException(Exception exception, ErrorResponse errorResponse);

    Class<? extends Exception> getExceptionType();

    String getTitle();

    int getStatus();
}
