package edu.tamu.scholars.middleware.graphql.service;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import edu.tamu.scholars.middleware.discovery.argument.BoostArg;
import edu.tamu.scholars.middleware.discovery.argument.FacetArg;
import edu.tamu.scholars.middleware.discovery.argument.FilterArg;
import edu.tamu.scholars.middleware.discovery.model.repo.CollectionRepo;
import edu.tamu.scholars.middleware.discovery.response.DiscoveryFacetPage;
import edu.tamu.scholars.middleware.discovery.response.DiscoveryPage;
import edu.tamu.scholars.middleware.graphql.model.Collection;
import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLQuery;

@Service
public class CollectionService extends AbstractNestedDocumentService<Collection, edu.tamu.scholars.middleware.discovery.model.Collection, CollectionRepo> {

    @Override
    @GraphQLQuery(name = "collectionExistsById")
    public boolean existsById(@GraphQLArgument(name = "id") String id) {
        return super.existsById(id);
    }

    @Override
    @GraphQLQuery(name = "collectionById")
    public Collection getById(@GraphQLArgument(name = "id") String id) {
        return super.getById(id);
    }

    @Override
    @GraphQLQuery(name = "collectionsCount")
    public long count() {
        return super.count();
    }

    @Override
    @GraphQLQuery(name = "collectionsCount")
    // @formatter:off
    public long count(
        @GraphQLArgument(name = "query") String query,
        @GraphQLArgument(name = "filters") List<FilterArg> filters
    ) {
    // @formatter:on
        return super.count(query, filters);
    }

    @Override
    @GraphQLQuery(name = "collectionsSorted")
    public Iterable<Collection> findAll(@GraphQLArgument(name = "sort") Sort sort) {
        return super.findAll(sort);
    }

    @Override
    @GraphQLQuery(name = "collectionsPaged")
    public DiscoveryPage<Collection> findAllPaged(@GraphQLArgument(name = "paging") Pageable page) {
        return super.findAllPaged(page);
    }

    @Override
    @GraphQLQuery(name = "collectionsSearch")
    // @formatter:off
    public DiscoveryFacetPage<Collection> search(
        @GraphQLArgument(name = "query") String query,
        @GraphQLArgument(name = "paging") Pageable page
    ) {
    // @formatter:on
        return super.search(query, page);
    }

    @Override
    @GraphQLQuery(name = "collectionsSearch")
    // @formatter:off
    public DiscoveryFacetPage<Collection> search(
        @GraphQLArgument(name = "query") String query,
        @GraphQLArgument(name = "boosts") List<BoostArg> boosts,
        @GraphQLArgument(name = "paging") Pageable page
    ) {
    // @formatter:on
        return super.search(query, boosts, page);
    }

    @Override
    @GraphQLQuery(name = "collectionsFilterSearch")
    // @formatter:off
    public DiscoveryFacetPage<Collection> filterSearch(
        @GraphQLArgument(name = "query") String query,
        @GraphQLArgument(name = "filters") List<FilterArg> filters,
        @GraphQLArgument(name = "paging") Pageable page
    ) {
    // @formatter:on
        return super.filterSearch(query, filters, page);
    }

    @Override
    @GraphQLQuery(name = "collectionsFilterSearch")
    // @formatter:off
    public DiscoveryFacetPage<Collection> filterSearch(
        @GraphQLArgument(name = "query") String query,
        @GraphQLArgument(name = "filters") List<FilterArg> filters,
        @GraphQLArgument(name = "boosts") List<BoostArg> boosts,
        @GraphQLArgument(name = "paging") Pageable page
    ) {
    // @formatter:on
        return super.filterSearch(query, filters, boosts, page);
    }

    @Override
    @GraphQLQuery(name = "collectionsFacetedSearch")
    // @formatter:off
    public DiscoveryFacetPage<Collection> facetedSearch(
        @GraphQLArgument(name = "query") String query,
        @GraphQLArgument(name = "facets") List<FacetArg> facets,
        @GraphQLArgument(name = "paging") Pageable page
    ) {
    // @formatter:on
        return super.facetedSearch(query, facets, page);
    }

    @Override
    @GraphQLQuery(name = "collectionsFacetedSearch")
    // @formatter:off
    public DiscoveryFacetPage<Collection> facetedSearch(
        @GraphQLArgument(name = "query") String query,
        @GraphQLArgument(name = "facets") List<FacetArg> facets,
        @GraphQLArgument(name = "filters") List<FilterArg> filters,
        @GraphQLArgument(name = "paging") Pageable page
    ) {
    // @formatter:on
        return super.facetedSearch(query, facets, filters, page);
    }

    @Override
    @GraphQLQuery(name = "collectionsFacetedSearch")
    // @formatter:off
    public DiscoveryFacetPage<Collection> facetedSearch(
        @GraphQLArgument(name = "query") String query,
        @GraphQLArgument(name = "facets") List<FacetArg> facets,
        @GraphQLArgument(name = "filters") List<FilterArg> filters,
        @GraphQLArgument(name = "boosts") List<BoostArg> boosts,
        @GraphQLArgument(name = "paging") Pageable page
    ) {
    // @formatter:on
        return super.facetedSearch(query, facets, filters, boosts, page);
    }

    @Override
    @GraphQLQuery(name = "collectionsByType")
    public List<Collection> findByType(@GraphQLArgument(name = "type") String type) {
        return super.findByType(type);
    }

    @Override
    @GraphQLQuery(name = "collectionsByIds")
    public List<Collection> findByIdIn(@GraphQLArgument(name = "ids") List<String> ids) {
        return super.findByIdIn(ids);
    }

    @Override
    @GraphQLQuery(name = "collectionsMostRecentlyUpdate")
    public List<Collection> findMostRecentlyUpdate(@GraphQLArgument(name = "limit") Integer limit) {
        return super.findMostRecentlyUpdate(limit);
    }

    @Override
    public Class<Collection> type() {
        return Collection.class;
    }

    @Override
    protected Class<?> getOriginDocumentType() {
        return edu.tamu.scholars.middleware.discovery.model.Collection.class;
    }

}
