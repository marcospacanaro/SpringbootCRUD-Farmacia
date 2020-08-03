package com.farmacia.online.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.farmacia.online.model.Produto;

public interface ProdutoRepository extends JpaRepository <Produto, Long> {

}
