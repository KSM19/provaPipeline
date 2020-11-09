package com.illimity.test.enums;

import com.illimity.rts.commonconfiglib.types.fe.IErrorCode;

public enum ErrorCode implements IErrorCode {
    ERREXAMPLE001("Unable to generate module"),
    ERREXAMPLE002("Unable to retrieve address");

    private String description;

    ErrorCode(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}