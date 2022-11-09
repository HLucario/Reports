package com.hlucario.reports.servicesimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hlucario.reports.models.Part;
import com.hlucario.reports.repositories.PartsRepository;
import com.hlucario.reports.services.PartService;

@Service
public class PartServiceImpl implements PartService{

	@Autowired
	PartsRepository partsRepository;
	
	@Override
	public Part getPart(Long id) {
		Optional<Part> partOptional = partsRepository.findById(id);
		Part part = partOptional.get();
		return part;
	}

	@Override
	public List<Part> getParts() {
		List<Part> parts = partsRepository.findAll();
		return parts;
	}

	@Override
	public Part createPart(Part part) {
		Part partR = partsRepository.save(part);
		return partR;
	}

	@Override
	public Part updatePart(Long partId, Part part) {
		Part partR = partsRepository.findById(partId).get();
		partR.setName(part.getName());
		partR.setDescription(part.getDescription());
		partR.setPartNumber(part.getPartNumber());
		partR.setUnitPrice(part.getUnitPrice());
		return partsRepository.save(partR);
	}

	@Override
	public void deletePart(Long partId) {
		partsRepository.deleteById(partId);
	}

	
}
