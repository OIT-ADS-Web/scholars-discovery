package edu.tamu.scholars.middleware.discovery.service.index;

public interface SolrIndexService {

    public void index();

    public void index(String subject);

    public Class<?> type();

    public String name();

}