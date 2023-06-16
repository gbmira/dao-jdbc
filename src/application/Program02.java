package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;

public class Program02 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		/*
		System.out.println();
		System.out.println("teste 1 = insert: ");
		Department dp = new Department(null, "Roupas");
		departmentDao.insert(dp);
		System.out.println("Inserted! New id: " + dp.getId());
		
		System.out.println();
		System.out.println("teste 4 = findById: ");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		
		System.out.println();
		System.out.println("teste 3 = delete: ");
		departmentDao.deleteById(8);
		*/
		
		System.out.println();
		System.out.println("teste 2 = update: ");
		Department dpToUpdate = departmentDao.findById(6);
		dpToUpdate.setName("Segurança");
		departmentDao.update(dpToUpdate);
		System.out.println("Update completed!");
		
		
		
	}

}
