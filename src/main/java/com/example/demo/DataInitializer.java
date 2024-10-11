package com.example.demo;

import com.example.demo.model.Account;
import com.example.demo.model.Transaction;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.TransactionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(AccountRepository accountRepository, TransactionRepository transactionRepository) {
        return args -> {
            accountRepository.save(new Account("imie nazwisko", "PL61109010140000071219812874", 150000, "2021-06-06"));
            accountRepository.save(new Account("AAA", "PL61109010140000071219812875", 250000, "2021-07-07"));
            accountRepository.save(new Account("BBB", "PL61109010140000071219812876", 500000, "2021-08-08"));
            accountRepository.save(new Account("XYZ", "PL61109010140000071219812877", 300000, "2021-09-09"));
            accountRepository.save(new Account("QQQ", "PL61109010140000071219812878", 400000, "2021-10-10"));
            accountRepository.save(new Account("WWW", "PL61109010140000071219812879", 1400000, "2023-04-25"));

            transactionRepository.save(new Transaction("PL61109010140000071219812874", "PL61109010140000071219812877", 10000, "2023-06-01", "przychodząca"));
            transactionRepository.save(new Transaction("PL61109010140000071219812875", "PL61109010140000071219812877", 10000, "2023-06-02", "wychodząca"));
            transactionRepository.save(new Transaction("PL61109010140000071219812876", "PL61109010140000071219812876", 10000, "2023-04-01", "przychodząca"));
            transactionRepository.save(new Transaction("PL61109010140000071219812877", "PL61109010140000071219812876", 10000, "2023-01-07", "wychodząca"));
            transactionRepository.save(new Transaction("PL61109010140000071219812878", "PL61109010140000071219812877", 10000, "2023-01-01", "przychodząca"));
            transactionRepository.save(new Transaction("PL61109010140000071219812879", "PL61109010140000071219812878", 10000, "2023-06-09", "wychodząca"));
        };
    }
}