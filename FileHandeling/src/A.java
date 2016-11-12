
public class A {

	public static void main(String[] args) {
//		String s1 = "select p.sno,p.name as Name,p.age as Age,count(id) as Number of Skills from person p,skills s where p.sno=s.sno grounnnnnnp by p.sno,s.sno;bnbnbnbnbnnbnbnbnbbbbbbbbbbbbbbbbbbbbbbbbbbbbbhjdhsjdhjsdhjsdhjshdjsdhjshdsdhsjdhnnnnnnnnnnnnnnnnnnnnnnnnppppppppo00";
		String s1 = "select p.sno,p.name as Name,p.age as Age,count(id) as 'Number of Skills' from person p,skills s where p.sno=s.sno group by p.sno,s.sno;bnbnbnbnbnnbnbnbnbbbbbbbbbbbbbbbbbbbbbbbbbbbbb";
		String[] s2 = s1.split(" ");
		
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			System.out.print(c);
			count++;
		}
		System.out.println();
		System.out.println("Total Character count = " + count);

		int count1 = 0;
		for (int j = 0; j < s2.length; j++) {
			count1++;

		}
		System.out.println("Total Words  = " + count1);

	}

}
