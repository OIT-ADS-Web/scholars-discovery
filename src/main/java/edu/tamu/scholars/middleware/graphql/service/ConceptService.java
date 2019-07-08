package edu.tamu.scholars.middleware.graphql.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.solr.core.query.result.FacetPage;
import org.springframework.stereotype.Service;

import edu.tamu.scholars.middleware.discovery.argument.Facet;
import edu.tamu.scholars.middleware.discovery.argument.Filter;
import edu.tamu.scholars.middleware.discovery.argument.Index;
import edu.tamu.scholars.middleware.discovery.model.repo.ConceptRepo;
import edu.tamu.scholars.middleware.graphql.model.Concept;
import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLQuery;

@Service
public class ConceptService extends AbstractNestedDocumentService<Concept, edu.tamu.scholars.middleware.discovery.model.Concept, ConceptRepo> {

    // TODO: figure out how to use findById returning Optional
    // TODO: figure out how to use name concepts
    @Override
    @GraphQLQuery(name = "concept")
    public Concept getById(@GraphQLArgument(name = "id") String id) {
        return super.getById(id);
    }

    @Override
    @GraphQLQuery(name = "conceptCount")
    public long count() {
        return super.count();
    }

    @Override
    @GraphQLQuery(name = "conceptCount")
    // @formatter:off
    public long count(
        @GraphQLArgument(name = "query") String query,
        @GraphQLArgument(name = "filters") List<Filter> filters
    ) {
    // @formatter:on
        return super.count(query, filters);
    }

    @Override
    @GraphQLQuery(name = "conceptExists")
    public boolean existsById(String id) {
        return super.existsById(id);
    }

    @Override
    @GraphQLQuery(name = "concepts")
    public Iterable<Concept> findAll() {
        return super.findAll();
    }

    @Override
    @GraphQLQuery(name = "concepts")
    public Iterable<Concept> findAll(@GraphQLArgument(name = "sort") Sort sort) {
        return super.findAll(sort);
    }

    @Override
    @GraphQLQuery(name = "concepts")
    public Page<Concept> findAll(@GraphQLArgument(name = "paging") Pageable pageable) {
        return super.findAll(pageable);
    }

    @GraphQLQuery(name = "concepts")
    // @formatter:off
    public FacetPage<Concept> search(
        @GraphQLArgument(name = "query") String query,
        @GraphQLArgument(name = "paging") Pageable page
    ) {
    // @formatter:on
        return search(query, Optional.empty(), new ArrayList<Facet>(), new ArrayList<Filter>(), page);
    }

    @GraphQLQuery(name = "concepts")
    // @formatter:off
    public FacetPage<Concept> search(
        @GraphQLArgument(name = "query") String query,
        @GraphQLArgument(name = "index") Optional<Index> index,
        @GraphQLArgument(name = "paging") Pageable page
    ) {
    // @formatter:on
        return search(query, index, new ArrayList<Facet>(), new ArrayList<Filter>(), page);
    }

    @GraphQLQuery(name = "concepts")
    // @formatter:off
    public FacetPage<Concept> search(
        @GraphQLArgument(name = "query") String query,
        @GraphQLArgument(name = "filters") List<Filter> filters,
        @GraphQLArgument(name = "paging") Pageable page
    ) {
    // @formatter:on
        return search(query, Optional.empty(), new ArrayList<Facet>(), filters, page);
    }

    @GraphQLQuery(name = "concepts")
    // @formatter:off
    public FacetPage<Concept> search(
        @GraphQLArgument(name = "query") String query,
        @GraphQLArgument(name = "facets") List<Facet> facets,
        @GraphQLArgument(name = "filters") List<Filter> filters,
        @GraphQLArgument(name = "paging") Pageable page
    ) {
    // @formatter:on
        return search(query, Optional.empty(), facets, filters, page);
    }

    @Override
    @GraphQLQuery(name = "concepts")
    // @formatter:off
    public FacetPage<Concept> search(
        @GraphQLArgument(name = "query") String query,
        @GraphQLArgument(name = "index") Optional<Index> index,
        @GraphQLArgument(name = "facets") List<Facet> facets,
        @GraphQLArgument(name = "filters") List<Filter> filters,
        @GraphQLArgument(name = "paging") Pageable page
    ) {
    // @formatter:on
        return super.search(query, index, facets, filters, page);
    }

    @Override
    @GraphQLQuery(name = "concepts")
    public List<Concept> findByType(@GraphQLArgument(name = "type") String type) {
        return super.findByType(type);
    }

    @Override
    @GraphQLQuery(name = "concepts")
    public List<Concept> findMostRecentlyUpdate(@GraphQLArgument(name = "limit") Integer limit) {
        return super.findMostRecentlyUpdate(limit);
    }

    @Override
    protected Class<?> getNestedDocumentType() {
        return Concept.class;
    }

}