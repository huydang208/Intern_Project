package model;

public class Orders {
	private int order_number;
	private String order_date;
	private String required_date;
	private String shipped_date;
	private String status;
	private String comments;
	private int customer_number;
	
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orders(int order_number, String order_date, String required_date, String shipped_date, String status,
			String comments, int customer_number) {
		super();
		this.order_number = order_number;
		this.order_date = order_date;
		this.required_date = required_date;
		this.shipped_date = shipped_date;
		this.status = status;
		this.comments = comments;
		this.customer_number = customer_number;
	}

	public Orders(String order_date, String required_date, String shipped_date, String status, String comments,
			int customer_number) {
		super();
		this.order_date = order_date;
		this.required_date = required_date;
		this.shipped_date = shipped_date;
		this.status = status;
		this.comments = comments;
		this.customer_number = customer_number;
	}

	public int getOrder_number() {
		return order_number;
	}

	public void setOrder_number(int order_number) {
		this.order_number = order_number;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public String getRequired_date() {
		return required_date;
	}

	public void setRequired_date(String required_date) {
		this.required_date = required_date;
	}

	public String getShipped_date() {
		return shipped_date;
	}

	public void setShipped_date(String shipped_date) {
		this.shipped_date = shipped_date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public int getCustomer_number() {
		return customer_number;
	}

	public void setCustomer_number(int customer_number) {
		this.customer_number = customer_number;
	}
	
	
}
