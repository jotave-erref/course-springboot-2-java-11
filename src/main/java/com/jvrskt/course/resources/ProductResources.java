package com.jvrskt.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jvrskt.course.entities.Product;
import com.jvrskt.course.services.ProductService;

@RestController //Anotação para marcar a classe como um recurso web implementado por controlador rest
@RequestMapping(value = "/products") //nome do recurso com o caminho
public class ProductResources {

	@Autowired
	private ProductService service;
	
	//Metodo para acessar os usuarios do tipo ResponseEntity para retornar respostas de requisições web
	@GetMapping //indica que o metodo responde a requisições HTTP
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
