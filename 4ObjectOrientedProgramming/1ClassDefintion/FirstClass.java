class FirstClass{
	String name = "";
	int roll = 0;
	float cgpa = 0.0F;

	//FirstClass constructor
	FirstClass(String name, int roll, float cgpa){
		this.roll = roll;
		this.name = name;
		this.cgpa = cgpa;
	}

	public static void main(String[] args){
		FirstClass fc = new FirstClass("class1", 1, 9.7F);
		System.out.println(fc.name + fc.roll + fc.cgpa);

	}

}

	
