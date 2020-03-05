package code401challenges.graph;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void test_Add () {
        Graph<String> graph = new Graph<>();
        Vertex<String> v1 = graph.addVertex("Rarity");
        Vertex<String> v2 = graph.addVertex("FlutterShy");
        assertEquals(
                "testAddVertex_EvenAdded should return",
                "Rarity: []\n" +
                        "FlutterShy: []\n",
                graph.toString()
        );
    }


    @Test
    public void test_AddEdge () {
        Graph<String> graph = new Graph<>();
        Vertex<String> v1 = graph.addVertex("PinkiePie");
        Vertex<String> v2 = graph.addVertex("AppleJacks");
        Edge<String> e1 = graph.addEdge(v1, v2, 0);

        ArrayList<Edge<String>> expected = new ArrayList<>();
        expected.add(e1);

        assertEquals(expected, graph.getNeighbors(v1));
    }


    @Test
    public void test_GetNeighbors () {
        Graph<String> graph = new Graph<>();
        Vertex<String> v1 = graph.addVertex("ScootALoo");
        Vertex<String> v2 = graph.addVertex("AppleBloom");
        Edge<String> e1 = graph.addEdge(v1, v2, 0);

        ArrayList<Edge<String>> expected = new ArrayList<>();
        expected.add(e1);

        assertEquals(expected, graph.getNeighbors(v1));
    }

    @Test
    public void test_Size () {
        Graph<String> graph = new Graph<>();
        graph.addVertex("BigMcIntosh");
        graph.addVertex("Spike");

        assertEquals("testSize_OneAdded should return", 2, graph.size());
    }

    @Test
    public void test_empty () {
        Graph<String> graph = new Graph<>();

        assertEquals("testSize_NoneAdded should return", 0, graph.size());
    }


}

//Worked with Annie we got help from Nich and we used https://www.baeldung.com/java-graphs too