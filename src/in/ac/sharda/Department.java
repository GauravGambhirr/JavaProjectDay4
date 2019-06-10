package in.ac.sharda;
import java.util.ArrayList;
import java.util.List;

public class Department implements Comparable<Department> , IResultArrivedListener {
	private final int id;
	public Department(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	public boolean equals (Object o) {
		if(o instanceof Department) {
			return ((Department)o)
					.getId()== id;}
		return false;
			
	}

	private List<Student> students= new ArrayList<>();
	public void addstudent(Student student) {
		this.students.add(student);
	}
	public void printStudents() {
		//students.parallelStream()
		//.forEach(
			//	s -> System.out.println(s.getRollNumber()));
	     for(Student s:students) {
	    	 System.out.println(s.getRollNumber());
	     }
	}
	//@override
	public int compareTo(Department o) {// compare is used when we need to compare 2 methods
		return o.getId() -id;//if the difference is equal to zero then they are equal
	
	}

	@Override
	public void resultArrived() {
		//this will use only 1 cpu core
		//for (Department d : departments) {
			//d.resultArrived();
		students.parallelStream()
		.forEach(s -> s.resultArrived());
		}
		
		
	}
 

