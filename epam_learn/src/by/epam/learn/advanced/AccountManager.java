package by.epam.learn.advanced;

public interface AccountManager {
	double depositInCash(int accountId, int amount);

	boolean withdraw(int accountId, int amount);

	boolean convert(double amount);

	boolean transfer(int accountId, double amount);
}