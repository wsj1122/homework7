package homework7;

public class exercise11_8 {
	
	public static void main(String[] args) {
		Account a = new Account(1122, 1000, "George");
		a.deposit(1000, "First deposit");
		a.deposit(2000, "Second deposit");
		a.deposit(3000, "Third deposit");
		a.withDraw(1, "First withdraw");
		a.withDraw(2, "Sceond withdraw");
		a.withDraw(3, "Third withdraw");
		System.out.print("name :" + a.getName() + " rate: " + a.getAnnualInterestRate() + " balance: " + a.getBalance() + "\n");
		for (Transaction b : a.transactions) {
			System.out.println("date: " + b.date);
			System.out.println("type: " + b.type);
			System.out.println("amount: " + b.amount);
			System.out.println("new balance: " + b.balance);
			System.out.println("description: " + b.description);
		}
	}
}