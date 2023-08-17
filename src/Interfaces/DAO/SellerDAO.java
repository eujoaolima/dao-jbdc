package Interfaces.DAO;


import Entities.Department;
import Entities.Seller;

import java.sql.SQLException;
import java.util.List;

public interface SellerDAO {
    void insert(Seller obj) throws SQLException;
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment (Department department);
}
