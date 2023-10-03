package com.codebase.filesandfoldersService.controllers;

import com.codebase.filesandfoldersService.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FolderController {
	@Autowired
	FolderRepository folderRepository;

}
