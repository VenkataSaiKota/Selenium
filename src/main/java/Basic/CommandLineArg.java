package Basic;

public class CommandLineArg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==0) {
			System.out.print("No command-line args");
		}
		else {
			System.out.println("Commond-line args");
			for(int i=0;i<args.length;i++) {
				System.out.println("Arg "+(i+1)+": "+args[i]);
			}
			
		}

	}

}
