package com.company;

public class Companydto {
	
	 

		    @NotBlank(message = "Company name is mandatory")
		    @Size(min = 5, message = "Company name should be at least 5 characters long")
		    private String companyName;

		    @NotBlank(message = "Email is mandatory")
		    @Email(message = "Invalid email address")
		    private String email;

		    @PositiveOrZero(message = "Strength should be a positive number or zero")
		    private Integer strength;

		    private String webSiteURL;

		    // Other fields and methods...

		}


