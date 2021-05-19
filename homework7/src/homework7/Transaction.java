package homework7;

import java.util.Date;

public class Transaction {
	public Date date;
	public char type;
	public double amount;
	public double balance;
	public String description;
	public Transaction(char c, double a, double b, String d) {
		date = new Date();
		type = c;
		amount = a;
		balance = b;
		description = d;
	}
}
