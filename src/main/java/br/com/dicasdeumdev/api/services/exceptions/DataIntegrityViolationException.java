package br.com.dicasdeumdev.api.services.exceptions;

public class DataIntegrityViolationException extends RuntimeException{

    public DataIntegrityViolationException(String message) {

        super(message);
    }
}
