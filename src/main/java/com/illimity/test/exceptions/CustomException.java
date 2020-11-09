package com.illimity.test.exceptions;

import org.springframework.http.HttpStatus;
import com.illimity.test.enums.ErrorCode;
import com.illimity.rts.commonconfiglib.types.fe.exception.AbstractErrorException;

public class CustomException extends AbstractErrorException {
    private static final HttpStatus DEFAULT_HTTP_STATUS = HttpStatus.INTERNAL_SERVER_ERROR;
    private static final ErrorCode DEFAULT_ERROR_CODE = ErrorCode.ERREXAMPLE001;

    public CustomException(String message) {
        super(message, DEFAULT_HTTP_STATUS, DEFAULT_ERROR_CODE);
    }

    public CustomException(String message, HttpStatus httpStatus, ErrorCode errorCode) {
        super(message, httpStatus, errorCode);
    }
}
