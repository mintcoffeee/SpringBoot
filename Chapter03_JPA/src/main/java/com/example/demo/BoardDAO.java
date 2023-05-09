package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//public interface BoardDAO extends JpaRepository<BoardDTO, String>{
public interface BoardDAO extends JpaRepository<BoardDTO, Integer>{

}


/*
JpaRepository<T, ID>
T: entity class 작성 
ID: primary key type(자료형) 작성   

*/