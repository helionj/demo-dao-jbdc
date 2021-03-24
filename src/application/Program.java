package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Department department = new Department(1, "Eletronics");
		
		Seller seller = new Seller(1, "Paul Pereira", "pp@email.com", sdf.parse("25/06/1985"), 2500.00, department);
		
		System.out.println(seller);

	}

}
