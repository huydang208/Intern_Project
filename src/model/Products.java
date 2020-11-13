package model;

public class Products {
	private String product_code;
	private String product_name;
	private String product_scale;
	private String product_vendor;
	private String product_description;
	private int quantity_in_stock;
	private int buy_price;
	private int mrsp;
	
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Products(String product_code, String product_name, String product_scale, String product_vendor,
			String product_description, int quantity_in_stock, int buy_price, int mrsp) {
		super();
		this.product_code = product_code;
		this.product_name = product_name;
		this.product_scale = product_scale;
		this.product_vendor = product_vendor;
		this.product_description = product_description;
		this.quantity_in_stock = quantity_in_stock;
		this.buy_price = buy_price;
		this.mrsp = mrsp;
	}

	public Products(String product_name, String product_scale, String product_vendor, String product_description,
			int quantity_in_stock, int buy_price, int mrsp) {
		super();
		this.product_name = product_name;
		this.product_scale = product_scale;
		this.product_vendor = product_vendor;
		this.product_description = product_description;
		this.quantity_in_stock = quantity_in_stock;
		this.buy_price = buy_price;
		this.mrsp = mrsp;
	}

	public String getProduct_code() {
		return product_code;
	}

	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_scale() {
		return product_scale;
	}

	public void setProduct_scale(String product_scale) {
		this.product_scale = product_scale;
	}

	public String getProduct_vendor() {
		return product_vendor;
	}

	public void setProduct_vendor(String product_vendor) {
		this.product_vendor = product_vendor;
	}

	public String getProduct_description() {
		return product_description;
	}

	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}

	public int getQuantity_in_stock() {
		return quantity_in_stock;
	}

	public void setQuantity_in_stock(int quantity_in_stock) {
		this.quantity_in_stock = quantity_in_stock;
	}

	public int getBuy_price() {
		return buy_price;
	}

	public void setBuy_price(int buy_price) {
		this.buy_price = buy_price;
	}

	public int getMrsp() {
		return mrsp;
	}

	public void setMrsp(int mrsp) {
		this.mrsp = mrsp;
	}
	
}
