package com.technoelevate.springmvcprojectsession.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.technoelevate.springmvcprojectsession.dto.EmployeeDto;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public EmployeeDto authenticate(int eid, String password) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		try {
			factory = Persistence.createEntityManagerFactory("hibernate");
			manager = factory.createEntityManager();
			EmployeeDto dto = manager.find(EmployeeDto.class, eid);
			if (dto.getPassword().equals(password)) {
				return dto;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (factory != null) {
				factory.close();
			}
			if (manager != null) {
				manager.close();
			}
		}
		return null;
	}

	@Override
	public EmployeeDto getData(int eid) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;

		try {
			factory = Persistence.createEntityManagerFactory("hibernate");
			manager = factory.createEntityManager();
			EmployeeDto employeeDto = manager.find(EmployeeDto.class, eid);
			return employeeDto;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (factory != null) {
				factory.close();
			}
			if (manager != null) {
				manager.close();
			}
		}
		return null;
	}

	@Override
	public boolean insertData(int eid, String ename, String position, String password) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			factory = Persistence.createEntityManagerFactory("hibernate");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			EmployeeDto dto = new EmployeeDto();
			dto.setEid(eid);
			dto.setEname(ename);
			dto.setPosition(position);
			dto.setPassword(password);
			manager.persist(dto);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			if (factory != null) {
				factory.close();
			}
			if (manager != null) {
				manager.close();
			}
		}
		return false;
	}

	@Override
	public int updateData(int eid, String ename, String password, String position) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction=null;
		try {
			factory = Persistence.createEntityManagerFactory("hibernate");
			manager = factory.createEntityManager();
			transaction=manager.getTransaction();
			transaction.begin();
			EmployeeDto dto = manager.find(EmployeeDto.class, eid);
			dto.setEname(ename);
			dto.setPassword(password);
			dto.setPosition(position);
			manager.persist(dto);
			transaction.commit();
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			if (factory != null) {
				factory.close();
			}
			if (manager != null) {
				manager.close();
			}
		}
		return 0;
	}

	@Override
	public boolean deleteData(int eid) {
		EntityManagerFactory factory=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			factory=Persistence.createEntityManagerFactory("hibernate");
			manager=factory.createEntityManager();
			transaction=manager.getTransaction();
			transaction.begin();
			EmployeeDto find = manager.find(EmployeeDto.class, eid);
			manager.remove(find);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (factory != null) {
				factory.close();
			}
			if (manager != null) {
				manager.close();
			}
		}
		return false;
	}
}
