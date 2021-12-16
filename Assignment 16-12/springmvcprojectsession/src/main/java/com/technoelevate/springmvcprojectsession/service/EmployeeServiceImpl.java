package com.technoelevate.springmvcprojectsession.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technoelevate.springmvcprojectsession.dao.EmployeeDao;
import com.technoelevate.springmvcprojectsession.dto.EmployeeDto;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao dao;

	@Override
	public EmployeeDto authenticate(int eid, String password) {
		if (eid == 0 || password == null) {
			return null;
		} else {
			return dao.authenticate(eid, password);
		}
	}

	@Override
	public EmployeeDto getData(int eid) {
		if (eid <= 0) {
			return null;
		} else {
			return dao.getData(eid);
		}
	}

	@Override
	public boolean insertData(int eid, String position, String ename, String password) {
		if (eid == 0 || ename == null || position == null || password == null) {
			return false;
		} else {
			return dao.insertData(eid, ename, position, password);
		}
	}

	@Override
	public int updateData(int eid, String ename, String password, String position) {
		if (eid < 0 || ename == null || password == null || position == null) {
			return 0;
		} else {
			return dao.updateData(eid, ename, password, position);
		}
	}

	@Override
	public boolean deleteData(int eid) {
		if (eid == 0) {
			return false;
		} else {
			return dao.deleteData(eid);
		}
	}

}