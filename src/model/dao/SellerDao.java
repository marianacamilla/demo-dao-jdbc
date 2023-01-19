package model.dao;

import model.Department;
import model.Seller;

import java.util.List;

public interface SellerDao {

    void insert(Seller obg);
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);

}
