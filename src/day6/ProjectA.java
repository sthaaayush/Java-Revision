package day6;

import java.util.Random;
import java.util.concurrent.locks.*;

class BankAccount {
	private String accountNumber;
	private double balance;
	private Lock lock = new ReentrantLock();

	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void deposit(double deposit) {
		boolean lockAcquired = false;
		try {
			lockAcquired = lock.tryLock();
			if (lockAcquired) {
				this.balance += deposit;
				System.out.println(Thread.currentThread().getName() + ":" + "Deposited: " + deposit + " in A/C No.:"
						+ this.accountNumber);
				System.out.println(Thread.currentThread().getName() + ":" + "New Balance: " + balance);
			} else {
				System.out.println(Thread.currentThread().getName() + " Lock not acquired, doing other work");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (lockAcquired) {
				lock.unlock();
			}
		}
	}

	public void withdraw(double withdraw) {
		if (lock.tryLock()) { // Attempt to acquire the lock
			try {
				if (this.balance >= withdraw) {
					this.balance -= withdraw;
					System.out.println(
							String.format(Thread.currentThread().getName() + ":" + "Withdrawn: %.2f from A/C No.: %s",
									withdraw, this.accountNumber));
					System.out.println(Thread.currentThread().getName() + ":" + "New Balance: " + balance);
				} else {
					System.out.println(Thread.currentThread().getName() + ":"
							+ "Insufficient balance for withdrawal from A/C No.:" + this.accountNumber);
				}
			} catch (Exception e) {
				e.printStackTrace(); // Print stack trace for debugging
			} finally {
				lock.unlock(); // Ensure the lock is released
			}
		} else {
			System.out.println(Thread.currentThread().getName() + " Lock not acquired, doing other work");
		}
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}
}

class Customer implements Runnable {
	private String customerId; // ID of the customer
	private String name; // Customer's name
	private String email; // Customer's email
	private BankAccount bankAccount; // Associated bank account
	private double withdrawLimit = 100.0;

	public Customer(String customerId, String name, String email, BankAccount bankAccount) {
		this.customerId = customerId;
		this.name = name;
		this.email = email;
		this.bankAccount = bankAccount;
	}

	public String getCustomerId() {
		return customerId;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	@Override
	public void run() {
	    Random random = new Random();
	    for (int i = 1; i <= 5; i++) { // Simulate 5 random transactions
	    	System.out.println("=============== "+this.customerId+" Transaction: "+ i +"===============");
	        boolean isDeposit = random.nextBoolean();
	        double amount = random.nextDouble() * 100; // Random amount between 0 and 100

	        if (isDeposit) {
	            bankAccount.deposit(amount);
	        } else {
	            if (withdrawLimit > 0 && amount <= withdrawLimit) {
	                bankAccount.withdraw(amount);
	                this.withdrawLimit -= amount;
	            } else {
	                System.out.println("Limit reached for withdrawal or invalid amount for " + this.name);
	            }
	        }

	        // Sleep for a short duration to simulate time between transactions
	        try {
	            Thread.sleep(random.nextInt(1000)); // Sleep for up to 500 ms
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }
	    }
	}


	@Override
	public String toString() {
		return String.format("Customer [ID=%s, Name=%s, Email=%s, BankAccount=%s]", customerId, name, email,
				bankAccount.getAccountNumber());
	}
}

public class ProjectA {
	public static void main(String[] args) throws InterruptedException {
		// Create a shared bank account
		BankAccount bankAccount = new BankAccount("A123456", 1000.0);
		BankAccount bankAccount2 = new BankAccount("B123456", 2000.0);

		// Create a number of customer threads
		Customer customer1 = new Customer("C001", "Alice", "alice@example.com", bankAccount);
		Customer customer2 = new Customer("C002", "Bob", "bob@example.com", bankAccount);
		Customer customer3 = new Customer("C003", "Charlie", "charlie@example.com", bankAccount);
		Customer customer4 = new Customer("C004", "Charls", "charls@example.com", bankAccount2);

		Thread t1 = new Thread(customer1, "C1");
		Thread t2 = new Thread(customer2, "C2");
		Thread t3 = new Thread(customer3, "C3");
		Thread t4 = new Thread(customer4, "C4");
		// Start the customer threads
		t1.start();
		t2.start();
		t3.start();
		t4.start();

		// Wait for all threads to finish
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		// Final balance after all transactions
		System.out.println(
				"Final Balance in A/C No. " + bankAccount.getAccountNumber() + ": " + bankAccount.getBalance());

		System.out.println(
				"Final Balance in A/C No. " + bankAccount2.getAccountNumber() + ": " + bankAccount2.getBalance());
	}
}
