package common;

import engine.Graph;
import factory.GraphFactory;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Optional;

public class FileManagerTest {

    @Test
    public void testTestGetResources() {
        try {
            var resources = FileManager.getResources();
            Assert.assertTrue(resources.exists());
            Assert.assertTrue(resources.list().length > 0);
            for (String fileName : resources.list()) {
                System.out.println(fileName);
            }
        } catch (FileNotFoundException e) {
            Assert.fail();
        }
    }

    @Test
    public void testSaveGraph() throws IOException {
        var graph = GraphFactory.build(7,3);
        FileManager.save(graph, "testGraph.dgs");
    }
}