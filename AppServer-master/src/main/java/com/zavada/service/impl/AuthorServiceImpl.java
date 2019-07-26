package com.zavada.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.zavada.domain.AuthorDTO;
import com.zavada.entity.AuthorEntity;
import com.zavada.repository.AuthorRepositroy;
import com.zavada.service.AuthorService;
import com.zavada.service.cloudinary.CloudinaryService;
import com.zavada.service.utils.ObjectMapperUtils;
import com.zavada.service.utils.StringUtils;

@Service
public class AuthorServiceImpl implements AuthorService {

	@Autowired
	private AuthorRepositroy authorRepository;

	@Autowired
	private ObjectMapperUtils objectMapper;

	@Autowired
	private StringUtils stringUtils;
	
	@Autowired
	private CloudinaryService cloudinaryService;

	@Override
	public void create(AuthorDTO author) {
		String authorId = stringUtils.generate();
		if (!authorRepository.existsByAuthorId(authorId)) {
			author.setAuthorId(authorId);
			AuthorEntity authorEntity = objectMapper.map(author, AuthorEntity.class);

			authorRepository.save(authorEntity);
		} else {
			// exception
		}
	}

	@Override
	public AuthorDTO get(String authorId) {
		AuthorEntity authorEntity = authorRepository.findByAuthorId(authorId);
		// if == null -> exception
		return objectMapper.map(authorEntity, AuthorDTO.class);
	}

	@Override
	public List<AuthorDTO> getAll() {
		List<AuthorEntity> authors = authorRepository.findAll();
		return objectMapper.mapAll(authors, AuthorDTO.class);
	}

	@Override
	public void update(AuthorDTO author) {

	}

	@Override
	public boolean existsByEmail(String email) {
		return authorRepository.existsByEmail(email);
	}

	@Override
	public void uploadImage(MultipartFile file, String authorId) {
		String imageUrl = cloudinaryService.uploadFile(file, "authors");
		
		AuthorEntity authorEntity = authorRepository.findByAuthorId(authorId);
		if(authorEntity == null) {
			System.out.println("Author not found");
		}
		
		authorEntity.setImageUrl(imageUrl);
		authorRepository.save(authorEntity);
	}

}
