package task10;

public class Account {
	
	    private double balance;

	    public  Account() {
	        balance = 0.0;
	    }

	    public  Account(double initialBalance) {
	        if (initialBalance >= 0) {
	            balance = initialBalance;
	        } else {
	            System.out.println("Initial balance cannot be negative. Setting balance to 0.0.");
	            balance = 0.0;
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount <= 0) {
	            System.out.println("Withdrawal amount must be greater than zero.");
	        } else if (amount > balance) {
	            System.out.println("Insufficient funds. Cannot withdraw.");
	        } else {
	            balance -= amount;
	            System.out.println("Withdrawal successful. Current balance: " + balance);
	        }
	    }

	    public void deposit(double amount) {
	        if (amount <= 0) {
	            System.out.println("Deposit amount must be greater than zero.");
	        } else {
	            balance += amount;
	            System.out.println("Deposit successful. Current balance: " + balance);
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public static void main(String[] args) {
	    	
	    	public class Account {
	    		
	    	    private double balance;

	    	    public Account() {
	    	        balance = 0.0;
	    	    }

	    	    public void Account(double initialBalance) {
	    	        if (initialBalance >= 0) {
	    	            balance = initialBalance;
	    	        } else {
	    	            System.out.println("Initial balance cannot be negative. Setting balance to 0.0.");
	    	            balance = 0.0;
	    	        }
	    	    }

	    	    public void withdraw(double amount) {
	    	        if (amount <= 0) {
	    	            System.out.println("Withdrawal amount must be greater than zero.");
	    	        } else if (amount > balance) {
	    	            System.out.println("Insufficient funds. Cannot withdraw.");
	    	        } else {
	    	            balance -= amount;
	    	            System.out.println("Withdrawal successful. Current balance: " + balance);
	    	        }
	    	    }

	    	    public void deposit(double amount) {
	    	        if (amount <= 0) {
	    	            System.out.println("Deposit amount must be greater than zero.");
	    	        } else {
	    	            balance += amount;
	    	            System.out.println("Deposit successful. Current balance: " + balance);
	    	        }
	    	    }

	    	    public double getBalance() {
	    	        return balance;
	    	    }

	    	    public static void main(String[] args) {
	
	    	        Account myAccount = new Account();

	    	        myAccount.deposit(500.0);

	    	        myAccount.withdraw(200.0);

	    	        double currentBalance = myAccount.getBalance();
	    	        System.out.println("Current balance: " + currentBalance);
	    	    }
	    	}

	        Account myAccount = new Account();

	        myAccount.deposit(500.0);

	        myAccount.withdraw(200.0);

	        double currentBalance = myAccount.getBalance();
	        System.out.println("Current balance: " + currentBalance);
	    }
	}

	