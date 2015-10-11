package pl.dk.undertheboot.summary;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
class SummaryMaker {

    @Autowired
    private SummaryRepository summaryRepository;

    @Transactional
    public void storeSummary(Integer beansProcessed) {
        summaryRepository.storeSummary(
                new LoadedContextSummary(beansProcessed)
        );
    }
    
}
