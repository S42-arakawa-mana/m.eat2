package com.example.m.eat2.form;

import com.example.m.eat2.validation.constraints.PasswordEquals;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@PasswordEquals
public class UserForm {

	@NotEmpty
	@Size(max = 100)
	private String name;

	@NotEmpty
	@Email
	private String email;

	@NotEmpty
	@Size(max = 20)
	private String password;

	@NotEmpty
	@Size(max = 20)
	private String passwordConfirmation;

}