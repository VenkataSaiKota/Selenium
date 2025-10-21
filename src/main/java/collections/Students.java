package collections;

public  class Students implements Comparable<Students> {
	
	String name;
	int id;
	char sec;
	
	public Students(String name, int id, char sec ) {
		this.name = name;
		this.id = id;
		this.sec = sec;
	}
	
	public int compareTo(Students s) {
		return Character.compare(this.sec,s.sec);
		
	}


	@Override
	public String toString() {
		return "Students [name=" + name + ", id=" + id + ", sec=" + sec + "]";
	}



	

	

	

}
