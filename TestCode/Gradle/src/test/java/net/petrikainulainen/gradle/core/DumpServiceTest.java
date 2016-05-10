package net.petrikainulainen.gradle.core;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Petri Kainulainen
 */
public class DumpServiceTest {

    private DumpService dumpService;

    @Before
    public void setUp() {
        dumpService = new DumpService();
    }

    @Test
    public void getMessage_ShouldReturnMessage() {
        assertEquals("Hello World!", dumpService.getMessage());
    }

}
