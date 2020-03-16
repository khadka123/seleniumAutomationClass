package MyArraypackage;

public class LearningArray {

	public static void main(String[] args) {
		
		NumberArray();
		LearningArray();
		LearningTryCatch();
	}
		
			
		public static void NumberArray() {
			
			int []intArray =new int[] {0,1,2,3,4,5,6,7,8,9};
			for (int i=0; i<intArray.length; i++)
			 System.out.println(intArray[i]);
			
		}
		
		
		
		public static void LearningArray() {
		
		String [] Countries = new String [] {"Nepal", "Bhutan", "USA", "Italy", "Brazil", "Canada", "India", "China", "panama","peru"};
		
		//printing the first value of Array
		System.out.println(Countries[0]);
		
		//Replacing the first value of Array
		Countries [0] ="German";
		
			
		//  printing the array using for loop
		for (int i=0; i<Countries.length; i++) {System.out.println(Countries[i]);

	}
		
		}
		
		public static void LearningTryCatch() {
			
			try {
				int []myNumbers={6,7,5,3,1,2};
				System.out.println(myNumbers[10]);
			} catch (Exception e) {
				
				System.out.println("Oops something went wrong");
			}
			
		}
		
		}

