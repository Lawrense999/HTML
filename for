
public class repeatFor {

	public repeatFor() {
		// TODO Auto-generated constructor stub
		forTwo();
	}

	public void forOne() {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < 5; i++) 
			sum += i; // sum = sum + i  
			System.out.print(sum);
		//10
	}

	public void forTwo() {
		int sum = 0;
		for (int i = 0; i < 5; i++) { 
			sum += i; // sum = sum + i  // 013610  
			System.out.print(sum);
		//010974
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new repeatFor();
	}

}
