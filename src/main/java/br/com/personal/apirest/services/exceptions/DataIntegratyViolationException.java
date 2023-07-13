package br.com.personal.apirest.services.exceptions;

public class DataIntegratyViolationException extends RuntimeException {
    public DataIntegratyViolationException(String message) {
        super(message);
    }
}
