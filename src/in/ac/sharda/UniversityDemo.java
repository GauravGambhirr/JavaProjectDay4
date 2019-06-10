package in.ac.sharda;

public class UniversityDemo {

	public static void main(String[] args) {
		University u =new University();
		for (int i=0;i<20;i++) {
			Department d =new Department(i);
			
			//boolean added = u.addDepartment(new Department(i));
			boolean added =u.addDepartment(d);
			if(added) {
				System.out.println("Department added");
				for (int j = 1; j < 21; j++) {
					d.addstudent(new Student(i,"Name "+i));
					
				}
			}else {
				System.out.println("Not added");
			}
			//u.addDepartment(new Department(i));
		}
		u.printDepartment();
		u.resultDeclared();
	}

}
