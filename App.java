package assign;

import java.util.*;
public class App {

	public static void main(String[] args) {
		int select = 0;
		int i =0;
		Scanner src = new Scanner(System.in);
		Student fir = new Student();
		
		HashMap<Integer,String> std = new HashMap<Integer,String>();
		while(select<3) {
		System.out.println("Menu");
		System.out.println("1.Add Students\n2.Show Students\n3.Exit");
		select = src.nextInt();
		switch(select) {
		case 1:
			System.out.println("Do you want to Add Student? 1(yes)/2(No)");
			int choice = src.nextInt();
			
			while(true) {
					if(choice == 1) {
						System.out.print("Enter ID od Student: ");
						int id = src.nextInt();
						System.out.print("Enter Name of Student: ");
						String name1=src.next();
						fir.stdId.add(id);	fir.stdName.add(name1);
						i++;
						src.nextLine();
						System.out.println("Do you want to Add Student? 1(yes)/2(No)");
						choice = src.nextInt();	
					}else if(choice == 2){
						System.out.println("insertion Ended");
						break;
					}
					
					
			}
			Integer[] ids = fir.stdId.toArray(new Integer[fir.stdId.size()]);
			int j=0;
			while(j<i) {
				std.put(ids[j],fir.stdName.get(j) );
				j++;
			}
			break;
		case 2:
			System.out.println("========Students========");
			System.out.println(std);
			break;
		case 3:
			System.out.println("Program Ended.");
			break;
			
		}
		
		}
		/*Set<Integer> stdId = new HashSet<Integer>();
		stdId.add(30);
		stdId.add(38);
		stdId.add(46);
		stdId.add(62);
		Integer[] id = stdId.toArray(new Integer[stdId.size()]);
		
		LinkedList<String> stdName = new LinkedList<String>();
		stdName.add("Ahmad");
		stdName.add("Shehryar");
		stdName.add("Ahmad Mazhar");
		stdName.add("Shozi");
		HashMap<Integer,String> std = new HashMap<Integer,String>();
		
		std.put(id[0], stdName.get(0));
		std.put(id[1], stdName.get(1));
		std.put(id[2], stdName.get(2));
		std.put(id[3], stdName.get(3));
		
		
		System.out.println(std);
		*/
		

	}

}
