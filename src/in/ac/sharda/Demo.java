package in.ac.sharda;

public class Demo {

	public static void main(String[] args) {
		Student s= new Student(1,"Gaurav");
		Student s2= new Student(2,"Gaurav","ggambhir432@gmail.com");
		System.out.println(s.getRollNumber());
		System.out.println(s.getName());
		s2.setEmail("abc");
		System.out.println(s2.getEmail());
		System.out.println(s.equals(s2));// we are checking roll no. is same or not
		

	}

}
