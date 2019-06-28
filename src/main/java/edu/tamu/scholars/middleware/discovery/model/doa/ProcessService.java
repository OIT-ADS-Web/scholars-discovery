package edu.tamu.scholars.middleware.discovery.model.doa;

import org.springframework.stereotype.Service;

import edu.tamu.scholars.middleware.discovery.model.Process;
import edu.tamu.scholars.middleware.discovery.model.repo.ProcessRepo;

@Service
public class ProcessService extends AbstractNestedDocumentService<edu.tamu.scholars.middleware.discovery.model.generated.Process, Process, ProcessRepo> {

    @Override
    protected Class<?> getNestedDocumentType() {
        return edu.tamu.scholars.middleware.discovery.model.generated.Process.class;
    }

}
