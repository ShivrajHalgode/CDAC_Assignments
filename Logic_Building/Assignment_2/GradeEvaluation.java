class GradeEvaluation{
		public static void main(String args[]){
		
                int Maths =80;
		int Science=60;
		int History=70;
		
                int Average=(Maths+Science+History)/3;
			System.out.println("Average Marks:"+Average);
 			if (Average>=90){
				System.out.println("Grade A");
		}
				else if (Average>=70){
				System.out.println("Grade B");
		}
				else if (Average>=50){
				System.out.println("Grade C");
		}
				else if (Average>=30){
				System.out.println("Grade D");
		}
			else{
                                System.out.println("Fail");
				}
		     }	
}