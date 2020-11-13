package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CustomersDAO;
import DAO.ImplCustomerDAO;
import model.Customers;




/**
 * ControllerServlet.java This servlet acts as a page controller for the
 * application, handling all requests from the Customer.
 * 
 * @email Ramesh Fadatare
 */

@WebServlet("")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomersDAO customersDAO;

	public void init() {
		customersDAO = new ImplCustomerDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		try {
			switch (action) {
			case "/new":
				showNewForm(request, response);
				break;
			case "/edit":
				showEditForm(request, response);
				break;
			case "/list":
				listCustomer(request, response);
				break;
			case "/details":
				detailCustomers(request, response);
			case "/insert":
				insertCustomer(request, response);
				break;
			case "/delete":
				deleteCustomer(request, response);
				break;
			case "/update":
				updateCustomer(request, response);
				break;
			case "/search":
				searchCustomer(request, response);
			default:
				RequestDispatcher dispatcher = request.getRequestDispatcher("login/login.jsp");
				dispatcher.forward(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}


	private void showNewForm(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException, ServletException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("customers/customers-form.jsp");
		dispatcher.forward(request, response);
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		int idCustomers = Integer.parseInt(request.getParameter("idCustomers"));
		Customers existingCustomers = customersDAO.getById(idCustomers);
		RequestDispatcher dispatcher = request.getRequestDispatcher("customers/customers-form.jsp");
		request.setAttribute("customers", existingCustomers);
		dispatcher.forward(request, response);
	}

	private void detailCustomers(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		int idCustomers = Integer.parseInt(request.getParameter("idCustomers"));
		Customers existingCustomers = customersDAO.getById(idCustomers);
		RequestDispatcher dispatcher = request.getRequestDispatcher("customers/customers-list.jsp");
		request.setAttribute("customers", existingCustomers);
		dispatcher.forward(request, response);
		
	}

	private void listCustomer(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Customers> listCustomer = customersDAO.getAll();
		request.setAttribute("listCustomer", listCustomer);
		RequestDispatcher dispatcher = request.getRequestDispatcher("customers/customers-list.jsp");
		dispatcher.forward(request, response);
	}

	private void insertCustomer(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		
		int customerNumber = Integer.parseInt(request.getParameter("customerNumber"));
		String customerName = request.getParameter("customerName");
		String contactLastName = request.getParameter("contactLastName");
		String contactFirstName = request.getParameter("contactFirstName");
		String phone = request.getParameter("phone");
		String addressLine1 = request.getParameter("addressLine1");
		String addressLine2 = request.getParameter("addressLine2");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String postalCode = request.getParameter("postalCode");
		String country = request.getParameter("country");
		int salesRepEmployeeNumber = Integer.parseInt(request.getParameter("salesRepEmployeeNumber"));
		float creditLimit = Float.parseFloat(request.getParameter("creditLimit"));
		
		boolean insert = Boolean.valueOf(request.getParameter("insert"));
		Customers customers = new Customers(customerNumber, customerName, contactLastName, contactFirstName, phone,
				addressLine1, addressLine2, city, state, postalCode, country, salesRepEmployeeNumber, creditLimit);
		customersDAO.insert(customers);
		response.sendRedirect("list");
	}

	private void updateCustomer(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		int customerNumber = Integer.parseInt(request.getParameter("customerNumber"));
		String customerName = request.getParameter("customerName");
		String contactLastName = request.getParameter("contactLastName");
		String contactFirstName = request.getParameter("contactFirstName");
		String phone = request.getParameter("phone");
		String addressLine1 = request.getParameter("addressLine1");
		String addressLine2 = request.getParameter("addressLine2");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String postalCode = request.getParameter("postalCode");
		String country = request.getParameter("country");
		int salesRepEmployeeNumber = Integer.parseInt(request.getParameter("salesRepEmployeeNumber"));
		float creditLimit = Float.parseFloat(request.getParameter("creditLimit"));
		
		boolean update= Boolean.valueOf(request.getParameter("update"));
		Customers updateCustomers = new Customers(customerNumber, customerName, contactLastName, contactFirstName, phone,
				addressLine1, addressLine2, city, state, postalCode, country, salesRepEmployeeNumber, creditLimit);
		
		customersDAO.update(updateCustomers);
		
		response.sendRedirect("list");
	}

	private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		int idCustomers = Integer.parseInt(request.getParameter("idCustomers"));
		customersDAO.delete(idCustomers);
		response.sendRedirect("list");
	}
	
	private void searchCustomer(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
}
