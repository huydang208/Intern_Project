package DAO;

import java.sql.SQLException;
import java.util.List;

import model.Customers;

public interface CustomersDAO {
    void insert(Customers customers) throws SQLException;

	Customers getById(int idCustomers);

	List<Customers> getAll();

	boolean delete(int idCustomers) throws SQLException;

	boolean update(Customers customers) throws SQLException;
	
	List<Customers> search(String search);
}
