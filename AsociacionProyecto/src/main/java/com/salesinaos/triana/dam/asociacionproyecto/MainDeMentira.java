package com.salesinaos.triana.dam.asociacionproyecto;


import java.time.LocalDate;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.salesinaos.triana.dam.asociacionproyecto.model.Cliente;
import com.salesinaos.triana.dam.asociacionproyecto.model.Venta;
import com.salesinaos.triana.dam.asociacionproyecto.repos.IClienteRepositorio;
import com.salesinaos.triana.dam.asociacionproyecto.repos.IVentaRepositorio;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MainDeMentira {
	
	private final IVentaRepositorio ventaRepos;
	private final IClienteRepositorio clienteRepos;
	
	@PostConstruct
	public void ejecutar() {
		Venta v = new Venta();
		v.setFecha(LocalDate.now());
		
		Venta v2 = new Venta();
		v2.setFecha(LocalDate.now());
		
		Cliente c = new Cliente();
		c.setHermano(true);
		c.setDescuento(23.8);
		
		Cliente c2 = new Cliente();
		c2.setHermano(false);
		c2.setDescuento(0);
		
		v.addToCliente(c);
		v2.addToCliente(c);
		
		
		ventaRepos.save(v);
		ventaRepos.save(v2);
		
		
		List<Cliente> cliente = clienteRepos.findAll();
		
		System.out.println(c);
		for(Venta venta : c.getVenta()) {
			System.out.println(venta);
		}
		
		/* System.out.println(c2);
		for(Venta venta2 : c2.getVenta()) {
			System.out.println(venta2);
		} */
		
	}

}
