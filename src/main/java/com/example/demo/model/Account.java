package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nazwa;
    private String identyfikatorKonta;
    private int biezaceSaldo;
    private String dataUtworzenia;

    public Account() {
    }

    public Account(String nazwa, String identyfikatorKonta, int biezaceSaldo, String dataUtworzenia) {
        this.nazwa = nazwa;
        this.identyfikatorKonta = identyfikatorKonta;
        this.biezaceSaldo = biezaceSaldo;
        this.dataUtworzenia = dataUtworzenia;
    }
}