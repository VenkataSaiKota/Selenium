package OOPS;

public class Constructor {

	 int a;

	Constructor(){
		System.out.println("This is  a constructor with no parameters");
	}
	Constructor(int a){
		System.out.println("This is a constructor with single parameter");
		this.a=a;
			
	}
	
	public void display() {
		System.out.print("The value of a is :"+this.a);
	}

	public static void main(String[] args) {
		Constructor obj1=new Constructor();
		Constructor obj2=new Constructor(5);
		obj2.display();
	   

	}

}
