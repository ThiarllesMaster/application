package application.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import application.domain.Cliente;
import application.repository.ClienteRepository;

@RestController
public class HelloWorld {

	@Autowired
	ClienteRepository clientRepository;
	
	@GetMapping(value = "/hello")
	public String hello() {
		return "Hello";
	}
	
	@PostMapping(value = "/cliente")
	public void saveCliente(@RequestBody Cliente cliente) {
		clientRepository.save(cliente);
	}
	
}
