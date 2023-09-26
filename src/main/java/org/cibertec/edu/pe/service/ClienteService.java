package org.cibertec.edu.pe.service;

import java.util.List;

import org.cibertec.edu.pe.entity.Cliente;
import org.cibertec.edu.pe.interfaces.ICliente;
import org.cibertec.edu.pe.interfacesService.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements IClienteService {
	
	@Autowired
	private ICliente data;


	@Override
	public List<Cliente> Listado() {
		
		return (List<Cliente>)data.findAll();
	}

	@Override
	public int Grabar(Cliente ObjC) {
		int rpta=0;
		Cliente c = data.save(ObjC);
		if(!c.equals(null))rpta= 1;
		return rpta;
	}

}
