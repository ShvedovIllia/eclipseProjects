package com.zavada.service;

import java.util.List;

import com.zavada.domain.CategoryDTO;

public interface CategoryService {

	void addCategory(CategoryDTO categoryDTO);
	
	CategoryDTO getCategoryById(Long id);
	
	List<CategoryDTO> getAllCategories();
	
}
