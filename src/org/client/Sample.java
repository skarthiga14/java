package org.client;

public class Sample {
	private void session() {
		// TODO Auto-generated method stub
		byte age = 127;
		
		short empId = 32767;
		int rollNum = 123456789;
		long phNo = 9894740209l;
		float salary = 40000.58696f;
		double preSalary = 20000.12397452;
		char gender = 'f';
		String name = "greens@123";
		boolean empStatus = true;
		System.out.println("age");
		System.out.println(age+"\n"+empId);
		System.out.println(empId);
		System.out.println(rollNum);
		System.out.println(phNo);
		System.out.println(salary);
		System.out.println(preSalary);
		System.out.println(gender);
		System.out.println(name);
		System.out.println(empStatus);
		System.out.println(age+30);
		System.out.println("The Emp Id is"+empId);
		
		
	}
public static void main(String[] args) {
	Sample s = new Sample();
	s.session();
}

}




