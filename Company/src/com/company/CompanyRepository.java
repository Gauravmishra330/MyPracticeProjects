package com.company;



@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
	Company findByCompanyCodeIgnoreCase(String companyCode);
}


