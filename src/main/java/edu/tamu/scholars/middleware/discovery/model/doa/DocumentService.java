package edu.tamu.scholars.middleware.discovery.model.doa;

import org.springframework.stereotype.Service;

import edu.tamu.scholars.middleware.discovery.model.Document;
import edu.tamu.scholars.middleware.discovery.model.repo.DocumentRepo;

@Service
public class DocumentService extends AbstractNestedDocumentService<edu.tamu.scholars.middleware.discovery.model.generated.Document, Document, DocumentRepo> {

    @Override
    protected Class<?> getNestedDocumentType() {
        return edu.tamu.scholars.middleware.discovery.model.generated.Document.class;
    }

}
