package com.java.plus.ionic.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.plus.ionic.project.service.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
