package com.patrimonio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patrimonio.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
