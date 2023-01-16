package model.dao;

import model.Seller;

import java.util.List;

public interface SellerDao {

    void insert(Seller obg);
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();

}
