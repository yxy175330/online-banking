package com.bms.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bms.domain.SavingsTransaction;

public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();
}

