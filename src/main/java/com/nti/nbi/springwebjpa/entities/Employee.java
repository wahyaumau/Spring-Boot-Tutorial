package com.nti.nbi.springwebjpa.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity(name = "employee")
@EqualsAndHashCode(callSuper = true)
public class Employee extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    private int age;
    private boolean married;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @Transient
    @JsonProperty("department_id")
    private int departmentId;
}
