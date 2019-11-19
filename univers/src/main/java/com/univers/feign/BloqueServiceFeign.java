package com.univers.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.univers.model.Bloque;
import com.univers.model.Facultad;

@FeignClient(name = "universidad", url = "localhost:8080")
public interface BloqueServiceFeign {
	
	@PostMapping("/este")
	public Bloque agregar(@RequestBody Bloque b);
	
	@GetMapping("/estem")
	public List<Bloque>listar();
	
	@PostMapping("/facul")
	public Facultad agregar(@RequestBody Facultad f);
	
	@GetMapping("/faculm")
	public List<Facultad>listar1();

}
