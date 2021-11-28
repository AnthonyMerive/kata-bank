package co.com.sofka.bank;

import java.io.PrintStream;
import java.util.Date;

import static co.com.sofka.bank.Amount.amountOf;

public class Account {

    private final Statement statement;

    private Amount balance = amountOf(0);

    public Account(Statement statement) {
        this.statement = statement;
    }

    public void deposit(Amount value, Date date) {
        recordTransaction(value, date);
    }

    public void withdrawal(Amount value, Date date) {
        recordTransaction(value.negative(), date);
    }

    public void printStatement(PrintStream printer) {
        statement.printTo(printer);
    }

    private void recordTransaction(Amount value, Date date) {
        Transaction transaction = new Transaction(value, date);
        Amount balanceAfterTransaction = transaction.balanceAfterTransaction(balance);
        balance = balanceAfterTransaction;
        statement.addLineContaining(transaction, balanceAfterTransaction);
    }

}


