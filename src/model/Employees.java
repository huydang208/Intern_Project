package model;

public class Employees {
	private int employee_number;
	private String last_name;
	private String first_name;
	private String extension;
	private String email;
	private String office_code;
	private int report_to;
	private String job_title;
	
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employees(int employee_number, String last_name, String first_name, String extension, String email,
			String office_code, int report_to, String job_title) {
		super();
		this.employee_number = employee_number;
		this.last_name = last_name;
		this.first_name = first_name;
		this.extension = extension;
		this.email = email;
		this.office_code = office_code;
		this.report_to = report_to;
		this.job_title = job_title;
	}

	public Employees(String last_name, String first_name, String extension, String email, String office_code,
			int report_to, String job_title) {
		super();
		this.last_name = last_name;
		this.first_name = first_name;
		this.extension = extension;
		this.email = email;
		this.office_code = office_code;
		this.report_to = report_to;
		this.job_title = job_title;
	}

	public int getEmployee_number() {
		return employee_number;
	}

	public void setEmployee_number(int employee_number) {
		this.employee_number = employee_number;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOffice_code() {
		return office_code;
	}

	public void setOffice_code(String office_code) {
		this.office_code = office_code;
	}

	public int getReport_to() {
		return report_to;
	}

	public void setReport_to(int report_to) {
		this.report_to = report_to;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	
	
}
