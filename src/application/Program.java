package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
		System.out.println("=== TEST 2: - seller findByDepartament ====");
		for(Seller sel: sellers) {
			System.out.println(sel);
		}

	}

}
