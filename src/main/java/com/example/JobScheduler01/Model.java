package com.example.JobScheduler01;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Model {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;
}
