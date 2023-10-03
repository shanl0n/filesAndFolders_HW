package com.codebase.filesandfoldersService;

import com.codebase.filesandfoldersService.models.File;
import com.codebase.filesandfoldersService.models.Folder;
import com.codebase.filesandfoldersService.models.Person;
import com.codebase.filesandfoldersService.repositories.FileRepository;
import com.codebase.filesandfoldersService.repositories.FolderRepository;
import com.codebase.filesandfoldersService.repositories.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class FilesAndFoldersServiceApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	PersonRepository personRepository;


	@Test
	void contextLoads() {
	}

}
