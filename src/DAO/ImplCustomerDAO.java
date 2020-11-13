package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Customers;
import utils.ConnectDB;

public class ImplCustomerDAO implements CustomersDAO {
	
	public static final String INSERT = "call insert_customers(?,?,?,?,?,?,?,?,?,?,?,?)";
	public static final String SELECT_BY_ID = "call get_customers_by_id(?);";
	public static final String SELECT_ALL = "call get_all_customers()";
	public static final String UPDATE = "call update_customers(?,?,?,?,?,?,?,?,?,?,?,?)";
	public static final String DELETE = "call delete_customers(?)";
	public static final String SEARCH = "call search_customers(?)";

	@Override
	public void insert(Customers customers) throws SQLException {
		System.out.print(INSERT);
		try  (Connection connection = ConnectDB.getConnection();
			 PreparedStatement preparedStatement = connection.prepareStatement(INSERT)) {
			
			preparedStatement.setString(1, customers.getCustomerName());
			preparedStatement.setString(2, customers.getContactLastName());
			preparedStatement.setString(3, customers.getContactFirstName());
			preparedStatement.setString(4, customers.getPhone());
			preparedStatement.setString(5, customers.getAddressLine1());
			preparedStatement.setString(6, customers.getAddressLine2());
			preparedStatement.setString(7, customers.getCity());
			preparedStatement.setString(8, customers.getState());
			preparedStatement.setString(9, customers.getPostalCode());
			preparedStatement.setString(10, customers.getCountry());
			preparedStatement.setInt(11, customers.getSalesRepEmployeeNumber());
			preparedStatement.setFloat(12, customers.getCreditLimit());
			System.out.print(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			ConnectDB.printSQLException(e);
		}
		
	}

	@Override
	public Customers getById(int idCustomers) {
		Customers customers = null;
		try (Connection connection = ConnectDB.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID);) {
			preparedStatement.setLong(1, idCustomers);
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				int customerNumber = rs.getInt("customerNumber");
				String customerName = rs.getString("customerName");
				String contactLastName = rs.getString("contactLastName");
				String contactFirstName = rs.getString("contactFirstName");
				String phone = rs.getString("phone");
				String addressLine1 = rs.getString("addressLine1");
				String addressLine2 = rs.getString("addressLine2");
				String city = rs.getString("city");
				String state = rs.getString("state");
				String postalCode = rs.getString("postalCode");
				String country = rs.getString("country");
				int salesRepEmployeeNumber = rs.getInt("salesRepEmployeeNumber");
				float creditLimit = rs.getFloat("creditLimit");
				
				customers = new Customers(customerNumber, customerName, contactLastName, contactFirstName, phone,
						addressLine1, addressLine2, city, state, postalCode, country, salesRepEmployeeNumber, creditLimit);
			}
		} catch (SQLException exception) {
			ConnectDB.printSQLException(exception);
		}
		return customers;
	}

	@Override
	public List<Customers> getAll() {
		List<Customers> customers = new ArrayList<>();

		try (Connection connection = ConnectDB.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);) {
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			
			while (rs.next()) {
				int customerNumber = rs.getInt("customerNumber");
				String customerName = rs.getString("customerName");
				String contactLastName = rs.getString("contactLastName");
				String contactFirstName = rs.getString("contactFirstName");
				String phone = rs.getString("phone");
				String addressLine1 = rs.getString("addressLine1");
				String addressLine2 = rs.getString("addressLine2");
				String city = rs.getString("city");
				String state = rs.getString("state");
				String postalCode = rs.getString("postalCode");
				String country = rs.getString("country");
				int salesRepEmployeeNumber = rs.getInt("salesRepEmployeeNumber");
				float creditLimit = rs.getFloat("creditLimit");
				
				customers.add(new Customers(customerNumber, customerName, contactLastName, contactFirstName, phone,
						addressLine1, addressLine2, city, state, postalCode, country, salesRepEmployeeNumber, creditLimit));
			}
		}catch (SQLException exception) {
			ConnectDB.printSQLException(exception);
		}
		return null;
	}

	@Override
	public boolean delete(int idCustomers) throws SQLException {
		boolean rowDeleted;
		try (Connection connection = ConnectDB.getConnection();
				PreparedStatement statement = connection.prepareStatement(DELETE);) {
			statement.setInt(1, idCustomers);
			rowDeleted = statement.executeUpdate() > 0;
		}
		return rowDeleted;
	}

	@Override
	public boolean update(Customers customers) throws SQLException {
		boolean rowUpdated;
		try (Connection connection = ConnectDB.getConnection();
			PreparedStatement statement = connection.prepareStatement(UPDATE);) {
			statement.setString(1, customers.getCustomerName());
			statement.setString(2, customers.getContactLastName());
			statement.setString(3, customers.getContactFirstName());
			statement.setString(4, customers.getPhone());
			statement.setString(5, customers.getAddressLine1());
			statement.setString(6, customers.getAddressLine2());
			statement.setString(7, customers.getCity());
			statement.setString(8, customers.getState());
			statement.setString(9, customers.getPostalCode());
			statement.setString(10, customers.getCountry());
			statement.setInt(11, customers.getSalesRepEmployeeNumber());
			statement.setFloat(12, customers.getCreditLimit());
			rowUpdated = statement.executeUpdate() > 0;
		}
		return rowUpdated;
	}

	@Override
	public List<Customers> search(String search) {
		// TODO Auto-generated method stub
		return null;
	}

}
