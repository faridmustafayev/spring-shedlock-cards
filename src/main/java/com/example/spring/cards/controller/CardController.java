package com.example.spring.cards.controller;

import com.example.spring.cards.model.request.CreateCardRequest;
import com.example.spring.cards.model.response.CardResponse;
import com.example.spring.cards.service.abstraction.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;

@RestController
@RequestMapping("v1/cards")
@RequiredArgsConstructor
public class CardController {
    private final CardService cardService;

    @PostMapping
    @ResponseStatus(CREATED)
    public void createCard(@RequestBody CreateCardRequest request){
        cardService.createCard(request);
    }

    @GetMapping("/{cardId}")
    public CardResponse getCard(@PathVariable Long cardId){
        return cardService.getCard(cardId);
    }

    @GetMapping
    public List<CardResponse> getCards(){
        return cardService.getCards();
    }

    @DeleteMapping("/{cardId}")
    @ResponseStatus(NO_CONTENT)
    public void deleteCard(@PathVariable Long cardId){
        cardService.deleteCard(cardId);
    }

    @PutMapping("/{cardId}")
    @ResponseStatus(NO_CONTENT)
    public void updateCard(@PathVariable Long cardId,
                           CreateCardRequest request){
        cardService.updateCard(cardId, request);
    }

}
