package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nadawca;
    private String odbiorca;
    private int kwota;
    private String dataZlecenia;
    private String typTransakcji; // "przychodząca" lub "wychodząca"

    public Transaction() {
    }

    public Transaction(String nadawca, String odbiorca, int kwota, String dataZlecenia, String typTransakcji) {
        this.nadawca = nadawca;
        this.odbiorca = odbiorca;
        this.kwota = kwota;
        this.dataZlecenia = dataZlecenia;
        this.typTransakcji = typTransakcji;
    }

}