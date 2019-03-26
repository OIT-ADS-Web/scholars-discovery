package edu.tamu.scholars.middleware.view.model;

import static edu.tamu.scholars.middleware.view.ViewTestUtility.getMockDirectoryView;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.data.domain.Sort;
import org.springframework.data.solr.core.query.Criteria.OperationKey;
import org.springframework.data.solr.core.query.FacetOptions;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class DirectoryViewTest {

    @Test
    public void testDefaultConstructor() {
        DirectoryView directoryView = new DirectoryView();
        assertNotNull(directoryView);
        assertNotNull(directoryView.getFacets());
        assertNotNull(directoryView.getFilters());
        assertTrue(directoryView.getFacets().isEmpty());
        assertTrue(directoryView.getFilters().isEmpty());
    }

    @Test
    public void testGettersAndSetters() {
        DirectoryView directoryView = getMockDirectoryView();
        directoryView.setId(1L);

        assertEquals(1L, directoryView.getId(), 1);
        assertEquals("People", directoryView.getName());
        assertEquals("persons", directoryView.getCollection());
        assertEquals(Layout.LIST, directoryView.getLayout());

        assertTrue(directoryView.getTemplates().containsKey("default"));
        assertEquals("<h1>Person template from WSYWIG</h1>", directoryView.getTemplates().get("default"));

        assertEquals(1, directoryView.getStyles().size());
        assertEquals("color: maroon;", directoryView.getStyles().get(0));

        assertEquals(1, directoryView.getFacets().size());
        assertEquals("Name", directoryView.getFacets().get(0).getName());
        assertEquals("name", directoryView.getFacets().get(0).getField());
        assertEquals(20, directoryView.getFacets().get(0).getLimit());
        assertEquals(FacetOptions.FacetSort.COUNT, directoryView.getFacets().get(0).getSort());
        assertEquals(Sort.Direction.DESC, directoryView.getFacets().get(0).getDirection());

        assertEquals(1, directoryView.getFilters().size());
        assertEquals("type", directoryView.getFilters().get(0).getField());
        assertEquals("FacultyMember", directoryView.getFilters().get(0).getValue());

        assertNotNull(directoryView.getIndex());
        assertEquals("name", directoryView.getIndex().getField());
        assertEquals(OperationKey.ENDS_WITH, directoryView.getIndex().getOperationKey());
    }

}
