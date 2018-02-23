package com.patrimonio.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patrimonio.model.Item;
import com.patrimonio.repository.ItemRepository;

@RestController
public class ItemResource {
	
	@Autowired
	private ItemRepository repository;
	
	@GetMapping("/itens")
	public List<Item> listar(){
		return repository.findAll();
	}
}
