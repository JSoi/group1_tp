package team01.week04;

import java.util.Scanner;

public class Calculator {
	String[] raw_type;
	int grade, time, line;
	public int money(){
		if(grade==1){//gold
		
		}
		else if(grade==2){//silver
			
		}
		return 0;
	}
	
	public String result(){
		if(money()==0)
			return "�߸��� ���� �Է��ϼ̽��ϴ�.";
		else
			return "�ݾ��� $"+money()+" �Դϴ�.";
	}
	public static void main(String[] args){
		Calculator cal = new Calculator();
		Scanner gradesc = new Scanner(System.in);
		Scanner timesc = new Scanner(System.in);
		System.out.print("����� �Է��ϼ��� : Gold(1), Silver(2) : ");
		cal.grade = gradesc.nextInt();
		System.out.print("��ȭ �ð��� �����ּ���(��) : ");
		cal.time = timesc.nextInt();
		System.out.print("��ȭ �ð��� �����ּ���(��) : ");
		cal.time = timesc.nextInt();
		cal.timesc = next. 
	}
}
