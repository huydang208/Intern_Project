package model;

public class Orderdetails {
	private int order_number;
	private String product_code;
	private int quantity_ordered;
	private float price_each;
	private int order_line_number;
	
	public Orderdetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orderdetails(int order_number, String product_code, int quantity_ordered, float price_each,
			int order_line_number) {
		super();
		this.order_number = order_number;
		this.product_code = product_code;
		this.quantity_ordered = quantity_ordered;
		this.price_each = price_each;
		this.order_line_number = order_line_number;
	}

	public Orderdetails(String product_code, int quantity_ordered, float price_each, int order_line_number) {
		super();
		this.product_code = product_code;
		this.quantity_ordered = quantity_ordered;
		this.price_each = price_each;
		this.order_line_number = order_line_number;
	}

	public int getOrder_number() {
		return order_number;
	}

	public void setOrder_number(int order_number) {
		this.order_number = order_number;
	}

	public String getProduct_code() {
		return product_code;
	}

	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}

	public int getQuantity_ordered() {
		return quantity_ordered;
	}

	public void setQuantity_ordered(int quantity_ordered) {
		this.quantity_ordered = quantity_ordered;
	}

	public float getPrice_each() {
		return price_each;
	}

	public void setPrice_each(float price_each) {
		this.price_each = price_each;
	}

	public int getOrder_line_number() {
		return order_line_number;
	}

	public void setOrder_line_number(int order_line_number) {
		this.order_line_number = order_line_number;
	}

	
	
}
