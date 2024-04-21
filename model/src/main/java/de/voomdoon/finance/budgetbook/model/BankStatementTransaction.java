package de.voomdoon.finance.budgetbook.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

/**
 * DOCME add JavaDoc for
 *
 * @author André Schulz
 *
 * @since 0.1.0
 */
@Getter
@Setter
public class BankStatementTransaction {

	private Account account;

	private Long amount;

	private LocalDate bookingDate;

	/**
	 * 'IBAN/BIC'
	 */
	private String otherAccount;

	private Reference reference;

	/**
	 * 'Vorgang'
	 */
	private String type;

	private LocalDate valuta;

	/**
	 * 'Buchungstext'
	 */
	private String what;

	/**
	 * 'Auftraggeber/Empfänger'
	 */
	private String where;

	/**
	 * @since 0.1.0
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BankStatementTransaction(account: ");
		builder.append(account);
		builder.append(", amount: ");
		builder.append(amount);
		builder.append(", bookingDate: ");
		builder.append(bookingDate);
		builder.append(", otherAccount: ");
		builder.append(otherAccount);
		builder.append(", reference: ");
		builder.append(reference);
		builder.append(", type: ");
		builder.append(type);
		builder.append(", valuta: ");
		builder.append(valuta);
		builder.append(", what: ");
		builder.append(what);
		builder.append(", where: ");
		builder.append(where);
		builder.append(")");
		return builder.toString();
	}
}
