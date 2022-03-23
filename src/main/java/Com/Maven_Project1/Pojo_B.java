package Com.Maven_Project1;

public class Pojo_B {
	
	public static void main(String[]args) {
		
		Pojo_A a = new Pojo_A();
		
		int age = a.getAge();
		
		System.out.println("age: " +age );
		
		a.setAge(12);
		
		System.out.println("After setters");
		
		int age_1 = a.getAge();
		
		System.out.println(age_1);
		
	}
		
	
	

}
