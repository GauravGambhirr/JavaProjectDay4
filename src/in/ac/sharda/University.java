package in.ac.sharda;
import java.util.Set;
import java.util.TreeSet;

public class University {
	private Set<Department> departments
	                        = new TreeSet<>();
	
    public boolean addDepartment(Department d) {
    	return departments.add(d);
    	
    }
    public void printDepartment() {
    	departments.parallelStream()
    	.forEach(
    			d -> System.out.println(d.getId()));
    }
    public void resultDeclared() {
    	//this will use only 1 cpu core
		//for (Department d : departments) {
			//d.resultArrived();
    	//this will use all cpu core
    	departments.parallelStream()
    	.forEach(departments -> departments.resultArrived());}
}	
