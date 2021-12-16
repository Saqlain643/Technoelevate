package com.technoelevate.springmvcprojectsession.service;

import com.technoelevate.springmvcprojectsession.dto.EmployeeDto;

public interface EmployeeService {

	EmployeeDto authenticate(int eid, String password);

	EmployeeDto getData(int eid);

	boolean insertData(int eid, String position, String ename, String password);

	int updateData(int eid, String ename, String password, String position);

	boolean deleteData(int eid);

}
