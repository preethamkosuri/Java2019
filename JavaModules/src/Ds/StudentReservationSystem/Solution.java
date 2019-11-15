package Ds.StudentReservationSystem;

import java.util.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

class Student implements Comparable<Student> {
	String name;
	String dob;
	int sub1;
	int sub2;
	int sub3;
	int marks;
	String category;
	boolean flag;
	SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");

	public Student(String name, String dob, int sub1, int sub2, int sub3, int marks, String category) {
		this.name = name;
		this.dob = dob;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.marks = marks;
		this.category = category;
	}

	public int compareTo(Student s) {
		if (this.marks == s.marks) {
			if (this.sub3 == s.sub3) {
				if (this.sub2 == s.sub2) {
					if (this.sub1 == s.sub1) {
						Date d1,d2;
						try {
							//System.out.println(this.dob);
							d1 = date.parse(this.dob);
							d2 = date.parse(s.dob);
							return d2.compareTo(d1);
						} catch (ParseException e) {
							return 0;
						}
					}
					else
						return s.sub1 - this.sub1;
				}
				else
					return s.sub2 - this.sub2;
			} 
			else
				return s.sub3 - this.sub3;
		}
		else
			return s.marks-this.marks;
    }

	@Override
	public String toString() {
		return "Student name=" + name + " category "+ category;
	}
	
}

class Selection{
	Student[] list;
	int vacancies;
	int open;
	int bcReserved;
	int scReserved;
	int stReserved;
	Selection(int no_of_Students, int no_of_positions,int open, int bcReserved, int scReserved, int stReserved) {
		list = new Student[no_of_Students];
		vacancies = no_of_positions;
		this.open = open;
		this.bcReserved = bcReserved;
		this.scReserved = scReserved;
		this.stReserved = stReserved;
	}
	public Student[] getSelectedList(){
		Arrays.sort(list);
		int bc=0,sc=0,st=0;
		for(int i=0;i<list.length;i++){
			//System.out.println(i+" "+list[i]);
			if(list[i].category.equals("BC")){
				bc++;
			}
			else if(list[i].category.equals("SC")){
				sc++;
			}
			else if(list[i].category.equals("ST")){
				st++;
			}
		}
		System.out.println("-------------------------------");
		Student[] fin=new Student[vacancies];
		int index=0,j=open;
		for(int i=0;i<open;i++,vacancies--){
			fin[index++]=list[i];
			if(list[i].category.equals("BC")){
				bc--;
			}
			else if(list[i].category.equals("SC")){
				sc--;
			}
			else if(list[i].category.equals("ST")){
				st--;
			}
			//System.out.println(fin[index-1]);
		}
		for(int i=j;i<list.length && vacancies>0;i++){
			if(list[i].category.equals("BC") && bcReserved>0){
				fin[index++]=list[i];
				vacancies--;
				bcReserved--;
				bc--;
				//System.out.println("1"+fin[index-1]);
			}
			else if(list[i].category.equals("SC") && scReserved>0){
				fin[index++] = list[i];
				vacancies--;
				scReserved--;
				sc--;
				//System.out.println("2"+fin[index-1]);
			}
			else if(list[i].category.equals("ST") && stReserved>0){
				fin[index++]=list[i];
				vacancies--;
				stReserved--;
				st--;
				//System.out.println("3"+fin[index-1]);
			}
			else if(bcReserved>0 && bc<=0){
				fin[index++]=list[i];
				bc--;
				bcReserved--;
				vacancies--;
				//System.out.println("4"+fin[index-1]);
			}
			else if(scReserved>0 && sc<=0){
				fin[index++]=list[i];
				sc--;
				scReserved--;
				vacancies--;
				//System.out.println("5"+fin[index-1]);
			}
			else if(stReserved>0 && st<=0){
				fin[index++]=list[i];
				st--;
				stReserved--;
				vacancies--;
				//System.out.println("6"+fin[index-1]);
			}
		}
		Arrays.sort(fin);
		return fin;
	}
}

public class Solution {
	public static void main(String[] args) throws Exception {
		int no_of_testcases = 5;
		int i = 0;
		while(i < no_of_testcases){
			String inputFile = "D:\\Java2019\\JavaModules\\src\\Ds\\StudentReservationSystem\\testcases\\input00"+i+".txt";
			String outputFile = "D:\\Java2019\\JavaModules\\src\\Ds\\StudentReservationSystem\\testcases\\output00"+i+".txt";
			ReadInput(inputFile,outputFile);
			i++;
		}	
	}
	public static void ReadInput(String inputFile, String outputFile) throws Exception{
		Scanner sc = new Scanner(new File(inputFile));
		int no_of_Students = Integer.parseInt(sc.nextLine());
		int no_of_positions = Integer.parseInt(sc.nextLine());
		int open = Integer.parseInt(sc.nextLine());
		int BC_count = Integer.parseInt(sc.nextLine());
		int SC_count = Integer.parseInt(sc.nextLine());
		int ST_count = Integer.parseInt(sc.nextLine());
		Selection sel_obj = new Selection(no_of_Students, no_of_positions, open, BC_count,SC_count,ST_count);
		for(int i = 0; i < no_of_Students; i++){
			String[] Student_info = sc.nextLine().split(",");
			Student stu_obj = new Student(Student_info[0],Student_info[1], Integer.parseInt(Student_info[2]),Integer.parseInt(Student_info[3]),Integer.parseInt(Student_info[4]),Integer.parseInt(Student_info[5]), Student_info[6]);
			sel_obj.list[i] = stu_obj;
		}
		Student[] finallist = sel_obj.getSelectedList();
		checkOutput(finallist, no_of_positions,outputFile);
	}
	public static void checkOutput(Student[] arr, int no_of_positions, String outputFile) throws Exception{
		Scanner sc = new Scanner(new File(outputFile));
		for(int i = 0; i < no_of_positions; i++){
			//System.out.println(arr[i].name);
			if(!sc.nextLine().equals(arr[i].name)){
				System.out.println("Your output is not matching with output in file "+ outputFile);
				return;
			}
		}
		System.out.println("your output with file "+ outputFile +" Matched. This Test case passed");
		
	}

}