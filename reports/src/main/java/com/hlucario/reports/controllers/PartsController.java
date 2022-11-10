package com.hlucario.reports.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hlucario.reports.models.Part;
import com.hlucario.reports.repositories.PartsRepository;
import com.hlucario.reports.services.PartService;

@RestController
@RequestMapping("/parts")
public class PartsController {

	@Autowired
	PartService partService;
	
	public PartsController(PartService partService) {
		this.partService = partService;
	}
	
	@GetMapping(path="/{partId}")
	public ResponseEntity<String> get(@PathVariable(value = "partId") Long partId) {
		Part partAux = partService.getPart(partId);
		if(partAux != null)
			return ResponseEntity.ok(partAux);
		return ResponseEntity.badRequest().body("That Part doesn't exist");
	}
	
	@PostMapping("")
	public Part post(@RequestBody Part part) {
		return partService.createPart(part);
	}
	
	@GetMapping("")
	public List<Part> getAll() {
		return partService.getParts();
	}
	
	@PutMapping(path="/{partId}")
	public Part put(@PathVariable(value = "partId") Long partId, @RequestBody Part part) {
		return partService.updatePart(partId, part);
	}
	
	@DeleteMapping(path="/{partId}")
	public void put(@PathVariable(value = "partId") Long partId) {
		partService.deletePart(partId);
	}
	
	
}
