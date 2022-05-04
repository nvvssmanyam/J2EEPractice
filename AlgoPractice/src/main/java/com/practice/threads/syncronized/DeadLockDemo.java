package com.practice.threads.syncronized;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Account {
	private int balance = 10000;

	public void withdraw(int amount) {
		balance -= amount;
	}

	public void deposit(int amount) {
		balance += amount;
	}

	public static void transfer(Account fromAcc, Account toAcc, int amount) {
		fromAcc.withdraw(amount);
		toAcc.deposit(amount);
	}

	public int getBalance() {
		return balance;
	}
}

/*
 *  Always get locks in same order to avoid dead lock
 *  tryLock - Acquires the lock only if it is free at the time of invocation otherwise return false
 */
class Process2 {

	private Account acc1 = new Account();
	private Account acc2 = new Account();

	private Lock lock1 = new ReentrantLock();
	private Lock lock2 = new ReentrantLock();

	private void acquireLocks(Lock firstLock, Lock secondLock) throws InterruptedException {

		boolean gotFirstLock = false;
		boolean gotSecondLock = false;

		while (true) {

			try {
				gotFirstLock = firstLock.tryLock();
				gotSecondLock = secondLock.tryLock();
			} finally {
				if (gotFirstLock && gotSecondLock) {
					return;
				}
				if (gotFirstLock) {
					firstLock.unlock();
				}
				if (gotSecondLock) {
					secondLock.lock();
				}
			}

			Thread.sleep(1);
		}
	}

	public void firstThread() throws InterruptedException {
		Random random = new Random();

		for (int i = 0; i < 10000; i++) {
			try {
				acquireLocks(lock1, lock2);
				Account.transfer(acc1, acc2, random.nextInt(100));
			} finally {
				lock1.unlock();
				lock2.unlock();
			}
		}
	}

	public void secondThread() throws InterruptedException {
		Random random = new Random();

		for (int i = 0; i < 10000; i++) {
			try {
				acquireLocks(lock2, lock1);
				Account.transfer(acc2, acc1, random.nextInt(100));
			} finally {
				lock1.unlock();
				lock2.unlock();
			}
		}
	}

	public void finished() {
		System.out.println("Account1 balance :: " + acc1.getBalance());
		System.out.println("Account2 balance :: " + acc2.getBalance());
		System.out.println("Total balance :: " + (acc1.getBalance() + acc2.getBalance()));
	}

}

public class DeadLockDemo {

	public static void main(String[] args) throws InterruptedException {
		Process2 proc = new Process2();

		Thread t1 = new Thread(() -> {
			try {
				proc.firstThread();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		Thread t2 = new Thread(() -> {
			try {
				proc.secondThread();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		proc.finished();

	}

}
