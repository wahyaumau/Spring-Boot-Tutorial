package com.nti.nbi.springwebjpa.controllers;

import com.nti.nbi.springwebjpa.entities.Employee;
import com.nti.nbi.springwebjpa.repositories.EmployeeRepository;
import com.nti.nbi.springwebjpa.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    EmployeeService service;

    @Autowired
    EmployeeRepository repository;


    @GetMapping
    public List<Employee> findAll(@RequestParam(required = false) String name){
        System.out.println(repository.findByAgeGreaterThan(20));
        System.out.println(repository.findByFirstNameInIgnoreCase(Arrays.asList("WAHYU", "RIFQI")));
        System.out.println(repository.findByAgeLessThanEqualAndMarried(23, true));
        if(name != null){
            return service.findByName(name);
        }
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Employee findById(@PathVariable int id){
        return service.findById(id);
    }

    @PostMapping
    public ResponseEntity<Employee> save(@RequestBody Employee employee){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(employee));
    }

    @PutMapping("/{id}")
    public Employee update(@PathVariable int id, @RequestBody Employee employee){
        return service.update(id, employee);
    }

    @DeleteMapping("/{id}")
    public Employee delete(@PathVariable int id){
        return service.delete(id);
    }
}
