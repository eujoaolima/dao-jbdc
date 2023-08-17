package Interfaces.DAO;

import Interfaces.Implementation.SellerDAOJDBC;
import db.DB;

public class DAOFactory {
    public static SellerDAO createSellerDAO() {
        return new SellerDAOJDBC(DB.getConnection());
    }
}
