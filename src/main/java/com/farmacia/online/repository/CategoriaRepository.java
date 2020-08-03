package com.farmacia.online.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.farmacia.online.model.Categoria;

public interface CategoriaRepository extends JpaRepository <Categoria, Long> {

}
