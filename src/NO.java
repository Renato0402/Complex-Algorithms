import java.util.ArrayList;
import java.util.List;

public class NO implements java.lang.Comparable<NO> {
	protected final String ID;
	protected String ant = "";
	protected double value = Integer.MAX_VALUE;
	
	protected final List<Transition> transitions = new ArrayList<Transition>();
	
	public NO(String id) {
		ID = id;
	}
	public void addTransition(NO n, int custo) {
		transitions.add(new Transition(n, custo));
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof NO) {
			NO n = (NO) obj;
			return this.ID.equals(n.ID);
		}
		return false;
	}
	@Override
	public int hashCode() {
		return this.ID.hashCode();
	}
	@Override
	public String toString() {
		return "ant="+this.ant+", ID="+this.ID+", value="+this.value+"]";//[A,B,0]
	}
	@Override
	public int compareTo(NO no) {
		if(this.value < no.value)
			return -1;
		if(this.value > no.value)
			return 1;
		return this.ID.hashCode() < no.ID.hashCode()?-1:1;
	}
}
