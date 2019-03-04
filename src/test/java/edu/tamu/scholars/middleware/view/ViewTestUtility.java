package edu.tamu.scholars.middleware.view;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.query.parser.Part.Type;
import org.springframework.data.solr.core.query.FacetOptions.FacetSort;

import edu.tamu.scholars.middleware.view.model.DirectoryView;
import edu.tamu.scholars.middleware.view.model.DiscoveryView;
import edu.tamu.scholars.middleware.view.model.Facet;
import edu.tamu.scholars.middleware.view.model.Filter;
import edu.tamu.scholars.middleware.view.model.Index;
import edu.tamu.scholars.middleware.view.model.Layout;
import edu.tamu.scholars.middleware.view.model.ResultView;

public class ViewTestUtility {

    public static DirectoryView getMockDirectoryView() {
        DirectoryView directoryView = new DirectoryView();

        directoryView.setName("People");
        directoryView.setCollection("persons");
        directoryView.setLayout(Layout.LIST);

        ResultView resultView = new ResultView();

        resultView.setName("People");
        resultView.setTemplate("<h1>Person template from WSYWIG</h1>");

        directoryView.setResultView(resultView);

        List<Facet> facets = new ArrayList<Facet>();

        Facet facet = new Facet();

        facet.setName("Name");
        facet.setField("name");
        facet.setLimit(20);
        facet.setSort(FacetSort.INDEX);

        facets.add(facet);

        directoryView.setFacets(facets);

        List<Filter> filters = new ArrayList<Filter>();

        Filter filter = new Filter();

        filter.setField("type");
        filter.setValue("FacultyMember");

        filters.add(filter);

        directoryView.setFilters(filters);

        Index index = new Index();

        index.setField("name");
        index.setType(Type.ENDING_WITH);

        directoryView.setIndex(index);

        return directoryView;
    }

    public static DiscoveryView getMockDiscoveryView() {
        DiscoveryView discoveryView = new DiscoveryView();

        discoveryView.setName("People");
        discoveryView.setCollection("persons");
        discoveryView.setLayout(Layout.GRID);

        ResultView resultView = new ResultView();

        resultView.setName("People");
        resultView.setTemplate("<h1>Person template from WSYWIG</h1>");

        discoveryView.setResultView(resultView);

        List<Facet> facets = new ArrayList<Facet>();

        Facet facet = new Facet();

        facet.setName("Name");
        facet.setField("name");
        facet.setLimit(20);
        facet.setSort(FacetSort.INDEX);

        facets.add(facet);

        discoveryView.setFacets(facets);

        List<Filter> filters = new ArrayList<Filter>();

        Filter filter = new Filter();

        filter.setField("type");
        filter.setValue("FacultyMember");

        filters.add(filter);

        discoveryView.setFilters(filters);

        return discoveryView;
    }

    public static ResultView getMockResultView() {
        ResultView resultView = new ResultView();

        resultView.setName("People");
        resultView.setTemplate("<h1>Person template from WSYWIG</h1>");

        return resultView;
    }

}
