package co.com.sofka.bank;

import static co.com.sofka.bank.Amount.amountOf;
import static co.com.sofka.bank.DateCreate.date;

class MainApp {

	public static void main(String[] args) {
		Account account = new Account(new Statement());

		account.deposit(amountOf(1000), date("10/01/2021"));
		account.deposit(amountOf(2000), date("13/01/2021"));
		account.withdrawal(amountOf(500), date("14/01/2021"));

		account.printStatement(System.out);
	}

}

