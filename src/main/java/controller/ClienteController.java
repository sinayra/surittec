package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import model.dao.ClienteDAO;
import model.entity.Cliente;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

	private ClienteDAO dao;
	

	@RequestMapping("/")
	public String ClienteList(Model map) throws Exception {
		dao = ClienteDAO.getInstance();
		List<Cliente> clientes;
		
		try {
			clientes = dao.read();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new Exception(e);
		}
		
		map.addAttribute("clientes", clientes);
		
		return "jsonTemplate";
	}
	
}
