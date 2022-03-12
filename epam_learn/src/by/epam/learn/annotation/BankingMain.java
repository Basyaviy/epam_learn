package by.epam.learn.annotation;

import by.epam.learn.advanced.AccountManager;


/**
 * конфигурирование и запуск
 * @author bas
 *
 */
public class BankingMain {
	public static void main(String[] args) {
		//реализации простейшие, каждый метод просто выводит информацию об операции
		AccountManager manager = SecurityFactory.registerSecurityObject(new AccountManagerImpl());
		//положить 6 на счёт 10128336
		manager.depositInCash(10128336, 6);
		//снять 2 со счёта 64092376
		manager.withdraw(64092376, 2);
		//просто вывод в консоль о конвертировании
		manager.convert(200);
		//перевод 300 на счёт 64092376
		manager.transfer(64092376, 300);
	}
}