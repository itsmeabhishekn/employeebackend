package com.example.employee_backend.dao;

import com.example.employee_backend.model.Employees;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employees, Integer > {

@Query(value = "SELECT `empcode`, `designation`, `name`, `password`, `salary`, `username`, `company_name`, `mobile_no` FROM `employees` WHERE `empcode` = :empcode",nativeQuery = true)
    List<Employees> search(@Param("empcode") Integer empcode);

@Modifying
@Transactional
@Query(value = "DELETE FROM `employees` WHERE `empcode` = :empcode",nativeQuery = true)
    void delete(@Param("empcode") Integer empcode);

}
