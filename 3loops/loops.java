
class loops{
	public static void main(String[] args){
		//for loop in java
		for(int i = 0; i < 5; i++){
			for(int j = 0 ; j < i; j++){
				System.out.printf(" * ");
			
			}
			System.out.println();
		}

		//while loop in java
		int count = 1;
		while(count <= 10){
			System.out.println("13 x "+count+" = "+(13*count));
			count = count + 1;
		}
	}	
}

