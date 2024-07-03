// package
package com.example.helloworld.demo.Services;

// annotations
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// entity
import com.example.helloworld.demo.Entity.Transactions;
import com.example.helloworld.demo.Repository.TransactionRepo;
import java.util.Optional;
import org.bson.types.ObjectId;

// data structures
import java.util.List;

@Component
public class TransactionService {

    @Autowired
    private TransactionRepo transactions;

    public void newTransaction(Transactions newTransaction) {
        transactions.save(newTransaction);
    }

    public List<Transactions> get() {
        return transactions.findAll();
    }

    public Optional<Transactions> getTransactionById(ObjectId id) {
        return transactions.findById(id);
    }

    public void deleteById(ObjectId id) {
        transactions.deleteById(id);
    }

    public List<Transactions> getAllPurchasesById(String id) {
        List<Transactions> items = transactions.findAll();
        List<Transactions> result = transactions.findAll();
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            if (!String.valueOf(items.get(i).getTo()).equals(id)) {
                result.remove(i - count);
                count++;
            }
            System.out.println(String.valueOf(items.get(i).getTo()).equals(id));
        }
        return result;
    }

    public List<Transactions> getAllSalesById(String id) {
        List<Transactions> items = transactions.findAll();
        List<Transactions> result = transactions.findAll();
        int count = 0;
        for(int i = 0; i < items.size(); i++) {
            if(!String.valueOf(items.get(i).getFrom()).equals(id)) {
                result.remove(i - count);
                count++;
            }
            System.out.println(String.valueOf(items.get(i).getFrom()).equals(id));
        }
        return result;
    }
}
