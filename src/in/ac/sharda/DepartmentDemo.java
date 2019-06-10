package in.ac.sharda;

public class DepartmentDemo {

	public static void main(String[] args) {
		Department d = new Department(1);
		for(int i=1;i<26;i++) {
		d.addstudent(new Student(1,"gaurav"+i));}//there is flow in this
		d.printStudents();
	}

}
