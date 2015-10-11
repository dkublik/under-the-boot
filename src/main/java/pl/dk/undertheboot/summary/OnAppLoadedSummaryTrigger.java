package pl.dk.undertheboot.summary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
class OnAppLoadedSummaryTrigger implements ApplicationListener<ContextRefreshedEvent>{

    @Autowired
    private SummaryMaker summaryMaker;

    public void onApplicationEvent(ContextRefreshedEvent event) {
        String[] beanDefinitionNames = event.getApplicationContext().getBeanDefinitionNames();
        summaryMaker.storeSummary(beanDefinitionNames.length);
    }
}