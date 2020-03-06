import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Student;

public class RunMain {
	
	private static List<Student> mList = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Please value n students ");
		int n = sc.nextInt();
		Student out = new Student();
		
		for(int i = 0; i <n ;i++) {
			Student st = new Student();
			st.input();
			mList.add(st);
		}
		
//		for(int i = 0 ; i< mList.size() ; i++) {
//			out.outPut(mList.get(i));
//		}
		
		for (Student st : mList) {
			out.outPut(st);
		}
	}

}
