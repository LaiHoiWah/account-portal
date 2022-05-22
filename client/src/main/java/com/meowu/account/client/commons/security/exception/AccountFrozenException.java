package com.meowu.account.client.commons.security.exception;

import com.meowu.commons.security.exception.MeowuException;

import java.text.MessageFormat;

public class AccountFrozenException extends MeowuException{

    public AccountFrozenException(){
    }

    public AccountFrozenException(String message){
        super(message);
    }

    public AccountFrozenException(Throwable cause){
        super(cause);
    }

    public AccountFrozenException(String message, Throwable cause){
        super(message, cause);
    }

    public AccountFrozenException(String message, Object... args){
        super(MessageFormat.format(message, args));
    }

    public AccountFrozenException(Throwable cause, String message, Object... args){
        super(MessageFormat.format(message, args), cause);
    }
}
