package Application;

import Entities.Department;
import Entities.Seller;
import Interfaces.DAO.DAOFactory;
import Interfaces.DAO.SellerDAO;

import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        Department department = new Department(1, "Books");
        System.out.println(department);

        Seller seller = new Seller(1, "Bob, o Bobo", "bob@gmail.com", new Date(), 3000.0, department);
        System.out.println(seller);

        SellerDAO sellerDAO = DAOFactory.createSellerDAO();
        System.out.println(sellerDAO);
    }
}
