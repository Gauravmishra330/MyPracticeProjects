package com.company;

import java.util.Date;

@Entity
@Table(name = "company")

public class CompanyEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "company_name", nullable = false)
    @NotBlank(message = "Company name is mandatory")
    @Size(min = 5, message = "Company name should be at least 5 characters long")
    private String companyName;

    @Column(nullable = false, unique = true)
    @NotBlank(message = "Email is mandatory")
    @Email(message = "Invalid email address")
    private String email;

    @Column
    @PositiveOrZero(message = "Strength should be a positive number or zero")
    private Integer strength;

    @Column(name = "web_site_url")
    private String webSiteURL;

    @Column(name = "company_code", unique = true)
    @Pattern(
        regexp = "^[A-Za-z]{2}\\d{2}[ENen]$",
        message = "Invalid company code format. Should be: AA99E or AA99N"
    )
    private String companyCode;

    @Column(nullable = false, unique = true)
    @NotBlank(message = "Email is mandatory")
    @Email(message = "Invalid email address")
    private String email;

    @Column
    @PositiveOrZero(message = "Strength should be a positive number or zero")
    private Integer strength;

    @Column(name = "web_site_url")
    private String webSiteURL;

    

}




