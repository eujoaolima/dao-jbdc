package Interfaces.DAO;

import Interfaces.Implementation.SellerDAOJDBC;

public class DAOFactory {
    public static SellerDAO createSellerDAO() {
        return new SellerDAOJDBC();
    }
}
