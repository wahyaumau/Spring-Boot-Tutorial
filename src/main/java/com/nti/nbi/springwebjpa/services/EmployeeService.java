package com.nti.nbi.springwebjpa.services;

import com.nti.nbi.springwebjpa.entities.Employee;
import com.nti.nbi.springwebjpa.exceptions.ResourceNotFoundException;
import com.nti.nbi.springwebjpa.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository repository;

    public List<Employee> findAll(){
        return repository.findAll();
    }

    public Employee findById(int id){
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("employee with id " + id + " not found"));
    }

    public Employee save(Employee employee){
        return repository.save(employee);
    }

    public Employee update(int id, Employee employee){
        Employee empFromDb = findById(id);
        employee.setId(empFromDb.getId());
        return repository.save(employee);
    }

    public Employee delete(int id){
        Employee empFromDb = findById(id);
        repository.deleteById(id);
        return empFromDb;
    }

    public List<Employee> findByName(String name){
        return repository.findByFirstNameIgnoreCaseOrLastNameIgnoreCase(name, name);
    }
}
