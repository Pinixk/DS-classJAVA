package _09_thread;

public class _08_Thread_synchronized {
	public static void main(String[] args) {
		Customer c = new Customer();
		new Thread(c).start();
		new Thread(c).start();
	}
}

class Account {
	private int balance = 1000;

	public int getBalance() {
		return balance;
	}

	synchronized public void withdraw(int money) {
		if (balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			balance -= money;
		}
	}
}

class Customer implements Runnable {
	Account acc = new Account();

	@Override
	public void run() {
		while (acc.getBalance() > 0) {
			int money = (int) (Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("잔액:" + acc.getBalance() + acc);
		}
	}
}
