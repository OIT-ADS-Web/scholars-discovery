package edu.tamu.scholars.middleware.discovery.model.repo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;

import edu.tamu.scholars.middleware.discovery.model.Process;

public class ProcessRepoTest extends AbstractSolrDocumentRepoTest<Process, ProcessRepo> {

    @Value("classpath:mock/discovery/process")
    private Resource mocksDirectory;

    @Override
    protected Resource getMocksDirectory() {
        return mocksDirectory;
    }

    @Override
    protected Class<?> getType() {
        return Process.class;
    }

}
