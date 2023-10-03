package com.codebase.filesandfoldersService.components;


import com.codebase.filesandfoldersService.models.File;
import com.codebase.filesandfoldersService.models.Folder;
import com.codebase.filesandfoldersService.models.Person;
import com.codebase.filesandfoldersService.repositories.FileRepository;
import com.codebase.filesandfoldersService.repositories.FolderRepository;
import com.codebase.filesandfoldersService.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
//@Component
public class DataLoader implements ApplicationRunner {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	PersonRepository personRepository;

	public DataLoader() {

	}

	public void run(ApplicationArguments args) {

		Person sean = new Person("Sean");
		personRepository.save(sean);

		Folder folder1 = new Folder("CV bits", sean);
		folderRepository.save(folder1);

		Folder folder2 = new Folder("Games", sean);
		folderRepository.save(folder2);

		Folder folder3 = new Folder("CodeClan Work", sean);
		folderRepository.save(folder3);

		File file1 = new File("CodeClan CV", "txt", 100, folder1);
		fileRepository.save(file1);

		File file2 = new File("Steam", "exe", 1024, folder2);
		fileRepository.save(file2);

		File file3 = new File("LinkedIn Profile", "jpeg", 3000, folder1);
		fileRepository.save(file3);

		File file4 = new File("TeaBiscuitForm", "jsx", 5428, folder3);
		fileRepository.save(file4);
	}
}
