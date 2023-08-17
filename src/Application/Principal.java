package Application;

import Entities.Department;
import Entities.Seller;
import Interfaces.DAO.DAOFactory;
import Interfaces.DAO.SellerDAO;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws SQLException {
//        Department department = new Department(1, "Books");
//        System.out.println(department);
//
//        Seller seller = new Seller(1, "Bob, o Bobo", "bob@gmail.com", new Date(), 3000.0, department);
//        System.out.println(seller);
//
        SellerDAO sellerDAO = DAOFactory.createSellerDAO();
//        System.out.println(sellerDAO);

        System.out.println("<==> TESTE 1: Seller findById <==>");
        Seller seller1 = sellerDAO.findById(3);
        System.out.println(seller1);

        System.out.println("<==> TESTE 2: Seller findByDepartment <==>");
        Department department = new Department(2, null);
        List<Seller> sellers = sellerDAO.findByDepartment(department);
        for (Seller obj : sellers) {
            System.out.println(obj);
        }

        System.out.println("<==> TESTE 3: Seller findAll <==>");
        sellers= sellerDAO.findAll();
        for (Seller obj : sellers) {
            System.out.println(obj);
        }

        System.out.println("<==> TESTE 4: Seller Insert <==>");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);

        sellerDAO.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());
    }
}
