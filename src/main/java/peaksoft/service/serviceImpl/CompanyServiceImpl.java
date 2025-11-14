package peaksoft.service.serviceImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.entity.Company;
import peaksoft.repo.CompanyRepo;
import peaksoft.service.CompanyService;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {

   private final CompanyRepo companyRepo;

    @Override
    public void addCompany(Company company) {
        companyRepo.addCompany(company);
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepo.getAlCompanies();
    }

    @Override
    public void deleteCompany(Long id) {
        companyRepo.deleteCompany(id);
    }

}
