package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("teste 1 = findById:");
		Seller seller = sellerDao.findById(5);
		
		System.out.println(seller);
		
		
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		System.out.println();
		System.out.println("teste 2 = findByDepartment: ");
		for (Seller obj : list) {
			System.out.println(obj);	
		}
		
		list = sellerDao.findAll();
		System.out.println();
		System.out.println("teste 3 = findAll: ");
		for (Seller obj : list) {
			System.out.println(obj);	
		}
		
		System.out.println();
		System.out.println("teste 3 = findAll: ");
		Seller newSeller = new Seller(null, "Gabriel Mira", "gbiel3mira@gmail.com", new Date(), 4000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id: " + newSeller.getId());
	}

}
