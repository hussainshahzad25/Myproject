package abcd;

import java.util.Scanner;

public class B {

	// public static void main(String[] args) {
	// Map<String, String> map = new HashMap<String, String>();
	//
	// map.put("Name", "Shahzad");
	// map.put("Age", "24");
	// map.put("Sal", "25000");
	//
	//
	// Iterator it = map.keySet().iterator();
	// while (it.hasNext()) {
	//
	// String key = (String) it.next();// Object key = it.next();
	//
	// String value = map.get(key);
	//
	// System.out.println("Key : " +key+ " \t | \t Value : "+value);
	//
	// }
	// }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row");

		int row = sc.nextInt();
		System.out.println("Enter column");

		int column = sc.nextInt();

		int a1[][] = new int[row][column], a2[][] = new int[row][column], a3[][] = new int[row][column];
		System.out.println("enter element of 1st array");
		for (int c = 0; c < row; c++)
			for (int d = 0; d < column; d++) {
				a1[c][d] = sc.nextInt();
			}
		System.out.println("enetr 2nd array element");
		for (int c = 0; c < row; c++)
			for (int d = 0; d < column; d++) {
				a2[c][d] = sc.nextInt();
			}
		
		System.out.println("Result");
		for(int c = 0; c< row;c++)
			for(int d = 0;d<column; d++)
				
			a3[c][d] =a1[c][d]+a2[c][d];
			
			for(int c=0;c<row;c++){
				for(int d =0;d<column;d++){
					System.out.print(a3[c][d] +" ");
				}
				System.out.println();
			}

	}

}
