package com.bms.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bms.domain.Recipient;

public interface RecipientDao extends CrudRepository<Recipient, Long> {
    
    List<Recipient> findAll();

    Recipient findByName(String recipientName);

    void deleteByName(String recipientName);
}
