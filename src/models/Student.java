package models;

import java.util.Scanner;

public class Student {
	
	private int mStudentCode;
	private String mStudentName;
	private int mStudentAge; 
	private boolean mStudentSex;
	
	public Student() {}

	public Student(int mStudentCode, String mStudentName, int mStudentAge, boolean mStudentSex) {
		super();
		this.mStudentCode = mStudentCode;
		this.mStudentName = mStudentName;
		this.mStudentAge = mStudentAge;
		this.mStudentSex = mStudentSex;
	}

	public int getmStudentCode() {
		return mStudentCode;
	}

	public void setmStudentCode(int mStudentCode) {
		this.mStudentCode = mStudentCode;
	}

	public String getmStudentName() {
		return mStudentName;
	}

	public void setmStudentName(String mStudentName) {
		this.mStudentName = mStudentName;
	}

	public int getmStudentAge() {
		return mStudentAge;
	}

	public void setmStudentAge(int mStudentAge) {
		this.mStudentAge = mStudentAge;
	}

	public boolean ismStudentSex() {
		return mStudentSex;
	}

	public void setmStudentSex(boolean mStudentSex) {
		this.mStudentSex = mStudentSex;
	}
	
	public void outPut() {
		System.out.println("Student Information ");
		System.out.println("FullName "+ mStudentName);
		System.out.println("AGE "+ mStudentAge);
		System.out.println("SEX "+ (this.mStudentSex ? "BOY" : "Girl"));
	}
	
	public void outPut(Student st) {
		System.out.println("Student Information ");
		System.out.println("FullName "+ st.getmStudentName());
		System.out.println("AGE "+ st.getmStudentAge());
		System.out.println("SEX "+  (st.mStudentSex ? "BOY" : "Girl"));
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input for the Information  Student ");
		
		System.out.println("Code ");
		this.mStudentCode = sc.nextInt();
		
		System.out.println("FullName ");
		this.mStudentName = sc.next();
		
		sc.nextLine();
		

		System.out.println("Age ");
		this.mStudentAge = sc.nextInt();
		
		System.out.println("Sex");
		int sex = sc.nextInt();
		if(sex == 1) {
			this.mStudentSex = true;	
		} else {
			this.mStudentSex = false;
		}
	}

}
