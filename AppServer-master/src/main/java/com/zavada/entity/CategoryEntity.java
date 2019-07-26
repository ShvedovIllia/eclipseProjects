package com.zavada.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="category")
@Getter
@Setter

public class CategoryEntity extends BaseEntity {
	
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	
	@ManyToMany
	@JoinTable(name = "categories_books", joinColumns = @JoinColumn(name = "category_id"), 
				inverseJoinColumns = @JoinColumn(name = "book_id"))
	private List<BookEntity> books;

}
