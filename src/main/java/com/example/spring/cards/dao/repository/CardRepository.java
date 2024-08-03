package com.example.spring.cards.dao.repository;

import com.example.spring.cards.dao.entity.CardEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CardRepository extends CrudRepository<CardEntity, Long> {
    @Override
    List<CardEntity> findAll();
}
