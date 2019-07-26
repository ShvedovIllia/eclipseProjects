package com.zavada.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zavada.domain.CategoryDTO;
import com.zavada.entity.CategoryEntity;
import com.zavada.repository.CategoryRepository;
import com.zavada.service.CategoryService;
import com.zavada.service.utils.ObjectMapperUtils;

@Service

public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ObjectMapperUtils modelMapper;
	
	@Override
	public void addCategory(CategoryDTO categoryDTO) {
		categoryRepository.save(modelMapper.map(categoryDTO, CategoryEntity.class));
		
	}

	@Override
	public CategoryDTO getCategoryById(Long id) {
		return modelMapper.map(categoryRepository.findById(id), CategoryDTO.class);
	}

	@Override
	public List<CategoryDTO> getAllCategories() {
		return modelMapper.mapAll(categoryRepository.findAll(), CategoryDTO.class);
	}

}
