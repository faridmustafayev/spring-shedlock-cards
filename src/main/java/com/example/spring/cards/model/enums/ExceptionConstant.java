package com.example.spring.cards.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ExceptionConstant {
    METHOD_NOT_ALLOWED("METHOD_NOT_ALLOWED", "405 Method not allowed"),
    CARD_NOT_FOUND("CARD_NOT_FOUND", "Card not found"),
    UNEXPECTED_EXCEPTION("UNEXPECTED_EXCEPTION", "Unexpected exception occurred");
    private String code;
    private String message;
}
