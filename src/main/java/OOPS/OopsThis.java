package OOPS;

public class OopsThis{
	String name ;
	int age;
	OopsThis(){
		this("Sai",25);
	}
	OopsThis(String name,int age){
		this.name=name;
		this.age=age;	
		System.out.println("My name is "+this.name+" and I am "+this.age+" old.");

	}
	

	public static void main(String[] args) {
	OopsThis obj1=	new OopsThis();
	OopsThis obj2=	new OopsThis("Venkat",22);
		

	}

}
