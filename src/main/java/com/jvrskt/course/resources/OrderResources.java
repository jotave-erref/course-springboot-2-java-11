package com.jvrskt.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jvrskt.course.entities.Order;
import com.jvrskt.course.services.OrderService;

@RestController //Anotação para marcar a classe como um recurso web implementado por controlador rest
@RequestMapping(value = "/orders") //nome do recurso com o caminho
public class OrderResources {

	@Autowired
	private OrderService service;
	
	//Metodo para acessar os usuarios do tipo ResponseEntity para retornar respostas de requisições web
	@GetMapping //indica que o metodo responde a requisições HTTP
	public ResponseEntity<List<Order>> findAll(){
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
