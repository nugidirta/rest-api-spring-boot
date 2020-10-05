package net.javaguides.springboot.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "salesout")
public class Salesout {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "transaction_number")
	private String transactionNumber;

	@Column(name = "transaction_date")
	private Timestamp transactionDate;
	
	@Column(name = "transaction_cust_code")
	private String transactionCustCode;
	
	public Salesout() {
		
	}
	
	public Salesout(String transactionNumber, Timestamp transactionDate, String transactionCustCode) {
		super();
		this.transactionNumber = transactionNumber;
		this.transactionDate = transactionDate;
		this.transactionCustCode = transactionCustCode;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTransactionNumber() {
		return transactionNumber;
	}
	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}
	public Timestamp getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Timestamp transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getTransactionCustCode() {
		return transactionCustCode;
	}
	public void setTransactionCustCode(String transactionCustCode) {
		this.transactionCustCode = transactionCustCode;
	}
}
