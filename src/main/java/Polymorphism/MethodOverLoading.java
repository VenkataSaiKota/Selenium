package Polymorphism;


class StudentRegisteration{
	public void register(int id) {
		System.out.println("Student registered with id "+id);
	}
	public void register(int id,String name) {
		System.out.println("Student registered with id "+ id+" and name "+name);
	}
	public void register(int id, String name,String branch) {
		System.out.println("Student registered with id "+ id+" and name "+name+" and selected branch "+branch);
	}
}

public class MethodOverLoading {
	

	public static void main(String[] args) {
		StudentRegisteration r=new StudentRegisteration();
		r.register(23);
		r.register(12,"Riyan");
		r.register(33,"Hardik","civil");


	}

}
