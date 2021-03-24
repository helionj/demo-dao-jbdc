package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program1 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		Department department = departmentDao.findById(3);
		System.out.println("=== TEST 1: - department findById ====");
		System.out.println(department);
		
		System.out.println("\n=== TEST 2: - department findAll ====");
		
		List<Department> departments = departmentDao.findAll();
		
		for(Department dep: departments) {
			System.out.println(dep);
		}
		
		System.out.println("\n=== TEST 3: - department insert ====");
		
		department = new Department(null, "Toys");
		departmentDao.insert(department);
		System.out.println(department);
		
		System.out.println("\n=== TEST 4: - department update ====");
		department = departmentDao.findById(4);
		department.setName("Books & News");
		departmentDao.update(department);
		
		System.out.println("\n=== TEST 5: - department delete ====");
		departmentDao.deleteById(6);
	
		

	}

}
