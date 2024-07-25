package com.example.spring.cards.scheduler;

import com.example.spring.cards.service.abstraction.CardService;
import lombok.RequiredArgsConstructor;
import net.javacrumbs.shedlock.core.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CardScheduler {
    private final CardService cardService;

    @Scheduled(fixedDelayString = "PT1M")
    @SchedulerLock(name = "increaseCardBalances", lockAtLeastForString = "PT1M", lockAtMostForString = "PT3M")
    public void increaseCardBalances() {
        cardService.increaseCardBalances();
    }
}
