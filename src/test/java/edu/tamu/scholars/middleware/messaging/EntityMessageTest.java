package edu.tamu.scholars.middleware.messaging;

import static edu.tamu.scholars.middleware.messaging.EntityAction.CREATE;
import static edu.tamu.scholars.middleware.messaging.EntityAction.DELETE;
import static edu.tamu.scholars.middleware.messaging.EntityAction.UPDATE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import edu.tamu.scholars.middleware.theme.model.Theme;

@RunWith(SpringRunner.class)
public class EntityMessageTest {

    @Test
    public void testCreateEntityMessage() {
        CreateEntityMessage<Theme> createThemeMessage = new CreateEntityMessage<Theme>(new Theme("Test", "Testing Unlimited"));
        assertNotNull(createThemeMessage);
        assertEquals("Test", createThemeMessage.getEntity().getName());
        assertEquals("Testing Unlimited", createThemeMessage.getEntity().getOrganization());
        assertEquals(CREATE, createThemeMessage.getAction());
    }

    @Test
    public void testUpdateEntityMessage() {
        UpdateEntityMessage<Theme> updateThemeMessage = new UpdateEntityMessage<Theme>(new Theme("Test", "Testing Unlimited"));
        assertNotNull(updateThemeMessage);
        assertEquals("Test", updateThemeMessage.getEntity().getName());
        assertEquals("Testing Unlimited", updateThemeMessage.getEntity().getOrganization());
        assertEquals(UPDATE, updateThemeMessage.getAction());
    }

    @Test
    public void testDeleteMessage() {
        DeleteEntityMessage<String> deleteThemeMessage = new DeleteEntityMessage<String>("Test");
        assertNotNull(deleteThemeMessage);
        assertEquals("Test", deleteThemeMessage.getIdentifier());
        assertEquals(DELETE, deleteThemeMessage.getAction());
    }

}
