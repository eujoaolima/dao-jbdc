package Application;

import Entities.Department;
import Entities.Seller;
import Interfaces.DAO.DAOFactory;
import Interfaces.DAO.SellerDAO;

import java.util.Date;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
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
    }
}
