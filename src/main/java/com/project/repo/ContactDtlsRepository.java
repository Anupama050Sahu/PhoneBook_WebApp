package com.project.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.ContactEntity;
//Integer defines the primary key colm data type
//here we are passing parameter as entity cls and the primary key data type 

public interface ContactDtlsRepository extends JpaRepository<ContactEntity, Integer>{

}
