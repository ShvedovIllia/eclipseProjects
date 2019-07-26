package com.zavada.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zavada.domain.CategoryDTO;
import com.zavada.service.CategoryService;

@RestController
@RequestMapping("categories")

public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@PostMapping("/add")
	public ResponseEntity<Void> addCategory(@RequestBody CategoryDTO categoryDTO){
		categoryService.addCategory(categoryDTO);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<CategoryDTO> getCategory(@PathVariable ("id") Long id){
		categoryService.getCategoryById(id);
		return new ResponseEntity<CategoryDTO>(HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<CategoryDTO>> getAllCategories(){
		return new ResponseEntity<List<CategoryDTO>>(categoryService.getAllCategories(), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<Void> deleteCategory(@PathVariable ("id") Long id){
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
