package com.jvrskt.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jvrskt.course.entities.User;

@RestController //Anotação para marcar a classe como um recurso web implementado por controlador rest
@RequestMapping(value = "/users") //nome do recurso com o caminho
public class UserResources {

	
	//Metodo para acessar os usuarios do tipo ResponseEntity para retornar respostas de requisições web
	@GetMapping //indica que o metodo responde a requisições HTTP
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"Jean", "jean@gmail.com", "22222222", "112233");
		return ResponseEntity.ok().body(u);
	}
}
