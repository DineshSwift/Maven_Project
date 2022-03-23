package Com.Maven_Project1;

public class Pojo_C {
	
	public static void main(String[]args) {
		
		Pojo_A a = new Pojo_A();
		
		a.setAge(12);
		
		int age = a.getAge();
		
		System.out.println(age);
		
	}

}
