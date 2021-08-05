import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenorCaminho {

    //List<No> g = new ArrayList<No>();
    Map<Integer,Integer> a = new HashMap<Integer,Integer>();
    Contrato[] contratos;
    double taxa;

    public MenorCaminho(Contrato contratos[], double taxa) {
        this.contratos = contratos;
        this.taxa = taxa;
    }

    /*public List<NO> run(List<NO> list) {

        List<NO> g = new ArrayList<NO>(graph);
		while(g.size()>0) {
			Collections.sort(g);
			NO n = g.remove(0);
			for(Transition t : n.transitions) {
				NO v = t.no;
				v.value = n.value + t.custo;
				v.ant = n.ID;
			}
        }		
        
        Collections.sort(graph);
        
		return graph;
    }*/

   
}
