package de.voomdoon.finance.budgetbook.model.debug;

import java.util.Currency;

/**
 * DOCME add JavaDoc for
 *
 * @author André Schulz
 *
 * @since 0.1.0
 */
public class BudgetBookModelDebug {

	public static void main(String[] args) {
		Currency currency = Currency.getInstance("EUR");
		System.out.println(currency);
	}
}
