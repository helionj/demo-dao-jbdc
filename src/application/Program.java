package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		System.out.println("=== TEST 1: - seller findById ====");
		System.out.println(seller);
		Department department = new Department(2, null);
		List<Seller> sellers = sellerDao.findByDepartament(department);
		System.out.println();
		System.out.println("\n=== TEST 2: - seller findByDepartament ====");
		for(Seller sel: sellers) {
			System.out.println(sel);
		}
		sellers = sellerDao.findAll();
		System.out.println("\n=== TEST 3: - seller findAll ====");
		for(Seller sel: sellers) {
			System.out.println(sel);
		}
		
		System.out.println("\n=== TEST 4: - seller insert ====");
		Seller newSeller = new Seller(null,"Paulo Santos", "paulosantos@email.com", new Date(), 4000.0, department );
		sellerDao.insert(newSeller);
		System.out.println(newSeller);
		
		System.out.println("\n=== TEST 5: - seller update ====");
		
		seller = sellerDao.findById(1);
		seller.setName("Marta Stuart");
		sellerDao.update(seller);
		
		System.out.println("Update completed");

	}

}
