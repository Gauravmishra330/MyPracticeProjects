package com.company;



@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public CompanyDTO getCompanyById(Long companyId) {
        Company company = companyRepository.findById(companyId).orElse(null);
        if (company != null) {
            return convertToDTO(company);
        } else {
            return null;
        }
    }

    private CompanyDTO convertToDTO(Company company) {
        
        CompanyDTO companyDTO = new CompanyDTO();
        
        return companyDTO;
    }

    

}
