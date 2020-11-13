package model;

public class Payments {
	private int customer_number;
	private String check_number;
	private String payment_date;
	private float amount;
	
	public Payments() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Payments(int customer_number, String check_number, String payment_date, float amount) {
		super();
		this.customer_number = customer_number;
		this.check_number = check_number;
		this.payment_date = payment_date;
		this.amount = amount;
	}
	
	public Payments(String check_number, String payment_date, float amount) {
		super();
		this.check_number = check_number;
		this.payment_date = payment_date;
		this.amount = amount;
	}
	
	public int getCustomer_number() {
		return customer_number;
	}
	public void setCustomer_number(int customer_number) {
		this.customer_number = customer_number;
	}
	public String getCheck_number() {
		return check_number;
	}
	public void setCheck_number(String check_number) {
		this.check_number = check_number;
	}
	public String getPayment_date() {
		return payment_date;
	}
	public void setPayment_date(String payment_date) {
		this.payment_date = payment_date;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	
}
