package com.hlucario.reports.services;

import java.util.List;

import com.hlucario.reports.models.Part;

public interface PartService {

	public Part getPart(Long id);
	
	public List<Part> getParts();
	
	public Part createPart(Part part);
	
	public Part updatePart(Long partId, Part part);
	
	public void deletePart(Long partId);
}
