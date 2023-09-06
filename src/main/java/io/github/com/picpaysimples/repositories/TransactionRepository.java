package io.github.com.picpaysimples.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.com.picpaysimples.domain.transaction.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
