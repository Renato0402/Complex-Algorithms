import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SSSP {
    /*
     * Menor Caminho
     */
    public List<NO> run(List<NO> graph) {
        List<NO> g = new ArrayList<NO>(graph);

        while (g.size() > 0) {
            Collections.sort(g);
            NO n = g.remove(0);

            for (Transition t : n.transitions) {
                NO v = t.no;
                //v.value = n.value + t.custo;
                v.ant = n.ID;
            }

            Collections.sort(g);
            g.remove(0);
        }

        Collections.sort(graph);
        return graph;
    }
}
