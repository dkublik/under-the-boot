package pl.dk.undertheboot.summary;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
class SummaryRepository {

    @PersistenceContext
    private EntityManager entityManager;

    void storeSummary(LoadedContextSummary summary) {
       entityManager.persist(summary);
    }
}
