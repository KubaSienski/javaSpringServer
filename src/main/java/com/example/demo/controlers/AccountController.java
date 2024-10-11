package com.example.demo.controlers;

import com.example.demo.model.Account;
import com.example.demo.model.Transaction;
import com.example.demo.service.AccountService;
import com.example.demo.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/")
    public String listAccounts(Model model) {
        List<Account> accounts = accountService.findAll();
        model.addAttribute("accounts", accounts);
        return "list";
    }

    @GetMapping("/account")
    public String accountDetails(@RequestParam("id") Long id, Model model) {
        Account account = accountService.findById(id);
        model.addAttribute("account", account);

        // Pobierz transakcje dla danego konta
        List<Transaction> transactions = transactionService.findTransactionsForAccount(account.getIdentyfikatorKonta());
        model.addAttribute("transactions", transactions);

        return "details";
    }
}