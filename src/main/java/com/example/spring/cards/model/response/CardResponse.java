package com.example.spring.cards.model.response;

import com.example.spring.cards.model.enums.CardStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class CardResponse {
    private Long id;
    private String cardNumber;
    private String cardholderName;
    private LocalDate expiryDate;
    private String cvv;
    private String cardType;
    private LocalDate issueDate;
    private BigDecimal balance;
    private CardStatus status;
    private LocalDateTime updatedAt;
    private LocalDateTime createdAt;
}
