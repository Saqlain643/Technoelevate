package com.technoelevate.springmvcprojectsession.dao;

import com.technoelevate.springmvcprojectsession.dto.EmployeeDto;

public interface EmployeeDao {

	EmployeeDto authenticate(int eid, String password);

	EmployeeDto getData(int eid);

	boolean insertData(int eid, String ename, String position, String password);

	int updateData(int eid, String ename, String password, String position);

	boolean deleteData(int eid);

}
