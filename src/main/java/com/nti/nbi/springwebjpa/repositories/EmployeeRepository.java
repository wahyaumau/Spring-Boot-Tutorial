package com.nti.nbi.springwebjpa.repositories;

import com.nti.nbi.springwebjpa.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findByFirstNameIgnoreCaseOrLastNameIgnoreCase(String firstName, String lastName);
    List<Employee> findByFirstNameInIgnoreCase(List<String> listFirstName);
    List<Employee> findByAgeGreaterThan(int age);
    List<Employee> findByAgeLessThanEqualAndMarried(int age, boolean isMarried);
}
