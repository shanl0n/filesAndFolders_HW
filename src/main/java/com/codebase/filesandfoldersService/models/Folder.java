package com.codebase.filesandfoldersService.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "folders")
public class Folder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;

	@OneToMany(mappedBy = "folder")
	@JsonIgnoreProperties({"folder"})
	private List<File> files;

	@ManyToOne
	@JoinColumn(name = "person_id")
	@JsonIgnoreProperties({"folders"})
	private Person person;

	public Folder(String name, Person person) {
		this.name = name;
		this.person = person;
		this.files = new ArrayList<>();
	}

	public Folder() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public List<File> getFiles() {
		return files;
	}

	public void setFiles(List<File> files) {
		this.files = files;
	}


}