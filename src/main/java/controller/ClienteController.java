package controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import model.dao.ClienteDAO;
import model.entity.Cliente;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

	private ClienteDAO dao;
	

	@GetMapping("/")
	public String ClienteList(Model map) {
		dao = ClienteDAO.getInstance();
		List<Cliente> clientes = null;
		
		try {
			clientes = dao.read();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		
		map.addAttribute("clientes", clientes);
		
		return "jsonTemplate";
	}
	
	@PostMapping(value = "/addcliente", consumes = "application/json")
	public ResponseEntity<String> AddCliente(@RequestBody Cliente cliente){
		dao = ClienteDAO.getInstance();
		
		try {
			dao.create(cliente);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return new ResponseEntity<String>("cliente nao adicionado", HttpStatus.INTERNAL_SERVER_ERROR);
		}
				
		return new ResponseEntity<String>("cliente adicionado", HttpStatus.OK);
	}
	
}
