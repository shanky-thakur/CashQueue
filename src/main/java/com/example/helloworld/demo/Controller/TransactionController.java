// package
package com.example.helloworld.demo.Controller;

// boot annotations
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

// entity
import com.example.helloworld.demo.Entity.Transactions;
import com.example.helloworld.demo.Services.TransactionService;
import java.util.List;

import org.bson.types.ObjectId;

// outer router "/Transactions"
@RestController
@RequestMapping("/Transactions")
public class TransactionController {

    @Autowired
    private TransactionService services;

    @GetMapping("/getTransactions")
    public List<Transactions> getAll() {
        return services.get();
    }

    @PostMapping("/newTransaction")
    public Transactions newTransaction(@RequestBody Transactions transaction) {
        services.newTransaction(transaction);
        return transaction;
    }

    @GetMapping("/getTransactionById/{id}")
    public Transactions getTransactionById(@PathVariable ObjectId id) {
        return services.getTransactionById(id).orElse(null);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteTransaction(@PathVariable ObjectId id) {
        services.deleteById(id);
    }

    @GetMapping("/getPurchases/{to}")
    public List<Transactions> getPurchases(@PathVariable String to) {
        return services.getAllPurchasesById(to);
    }

    @GetMapping("/getSales/{from}") 
    public List<Transactions> getSales(@PathVariable String from) {
        return services.getAllSalesById(from);
    }
}
