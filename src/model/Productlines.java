package model;

public class Productlines {
	private String product_line;
	private String text_description;
	private String html_description;
	private String image;
	
	public Productlines() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Productlines(String product_line, String text_description, String html_description, String image) {
		super();
		this.product_line = product_line;
		this.text_description = text_description;
		this.html_description = html_description;
		this.image = image;
	}
	
	public Productlines(String text_description, String html_description, String image) {
		super();
		this.text_description = text_description;
		this.html_description = html_description;
		this.image = image;
	}
	
	public String getProduct_line() {
		return product_line;
	}
	public void setProduct_line(String product_line) {
		this.product_line = product_line;
	}
	public String getText_description() {
		return text_description;
	}
	public void setText_description(String text_description) {
		this.text_description = text_description;
	}
	public String getHtml_description() {
		return html_description;
	}
	public void setHtml_description(String html_description) {
		this.html_description = html_description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
}
