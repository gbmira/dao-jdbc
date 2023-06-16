package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;

public class Program02 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		/*
		System.out.println("teste 1 = insert: ");
		Department dp = new Department(null, "Roupas");
		departmentDao.insert(dp);
		System.out.println("Inserted! New id: " + dp.getId());
		
		
		System.out.println("teste 2 = update: ");
		departmentDao.update(new Department(6, "Limpeza"));
		System.out.println("Update completed!");
		*/
		
		System.out.println("teste 3 = delete: ");
		departmentDao.deleteById(8);
	}

}
