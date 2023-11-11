import java.io.InputStream;
import java.util.*;

public class DijkstrasAlgorithm {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("What file do you want to read? ");
        String filename = scan.nextLine();
        processFile(filename);
    }

    public static void dijkstra(Graph g, String start, String finish)
    {
        //Map<String, Integer> dist = [you pick HashMap or TreeMap]
        //Map<String, String> prev = [you pick HashMap or TreeMap]
        PriQueue<String, Integer> pq = new PriQueue<String, Integer>(true);

        // Your Dijkstra's algorithm code here.
    }

    /**
     * Read the file specified to add proper items to the word frequencies.
     */
    private static void processFile(String filename)
    {
        InputStream is = DijkstrasAlgorithm.class.getResourceAsStream(filename);
        if (is == null) {
            System.err.println("Bad filename: " + filename);
            System.exit(1);
        }
        Scanner scan = new Scanner(is);

        // Make a blank graph.
        Graph g = new Graph();

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] words = line.split(" ");

            // Add your code here.
            // Follow the examples from past projects that had code that
            // processed a file.  The "dijkstra" line will always be the
            // last line in the file, and you can call the dijkstra() function
            // directly from here.
        }
        scan.close();
    }

}
