package application;

import model.Department;
import model.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

    }
}