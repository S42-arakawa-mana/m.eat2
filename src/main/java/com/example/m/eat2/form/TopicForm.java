package com.example.m.eat2.form;

import org.springframework.web.multipart.MultipartFile;

import com.example.m.eat2.validation.constraints.ImageByte;
import com.example.m.eat2.validation.constraints.ImageNotEmpty;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class TopicForm {

	private Long id;

	private Long userId;

	@ImageNotEmpty
	@ImageByte(max = 2000000)
	private MultipartFile image;

	private String imageData;

	private String path;

	@NotEmpty
	@Size(max = 1000)
	private String description;

	private UserForm user;

}