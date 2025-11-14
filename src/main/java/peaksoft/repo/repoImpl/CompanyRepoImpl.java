package peaksoft.repo.repoImpl;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import peaksoft.entity.Company;
import peaksoft.repo.CompanyRepo;

import java.util.List;

@Repository
@RequiredArgsConstructor
@Transactional
public class CompanyRepoImpl implements CompanyRepo {

    @PersistenceContext
    private final EntityManager  entityManager;


    @Override
    public void addCompany(Company company) {
        entityManager.persist(company);
    }

    @Override
    public List<Company> getAlCompanies() {

        return entityManager.createQuery("select c from Company c", Company.class)
                .getResultList();

    }

    @Override
    public void deleteCompany(Long id) {
        Company company =entityManager.find(Company.class, id);
        entityManager.remove(company);
    }
}
