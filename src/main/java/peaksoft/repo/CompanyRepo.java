package peaksoft.repo;

import peaksoft.entity.Company;

import java.util.List;

public interface CompanyRepo {


    void addCompany(Company company);
    List<Company> getAlCompanies();
    void deleteCompany(Long id);

}
