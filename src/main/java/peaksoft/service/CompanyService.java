package peaksoft.service;

import peaksoft.entity.Company;

import java.util.List;

public interface CompanyService {
    void addCompany(Company company);
    List<Company> getAllCompanies();
    void deleteCompany(Long id);

}
