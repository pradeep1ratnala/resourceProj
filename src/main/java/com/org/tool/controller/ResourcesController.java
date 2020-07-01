package com.org.tool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.tool.dao.ResourcesDao;
import com.org.tool.model.Resources;

@RestController
@RequestMapping("/resource")
public class ResourcesController {
	
	@Autowired
	private ResourcesDao repository;
	
	@GetMapping("/fetchResource")
	public List<Resources> fetchResources() {
		System.out.println("entering to method...");
		return (List<Resources>) repository.findAll();
	}
	
	@PostMapping("/saveResource")
	public String saveResources(@RequestBody Resources resources) {
		repository.save(resources);
		return "Resources Inserted : " + ((List<Resources>) resources).size();
	}
}
