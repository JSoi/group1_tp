package team01.week04;

import static org.junit.Assert.*;
import org.junit.Test;
import team01.week04.Calculator;

public class Testing {

	@Test
	public void testMoneyGold(){
		Calculator cal6 = new Calculator();//assertEquals(a,b)
		cal6.grade = 1;
		cal6.line = 1;
		cal6.time = 999;
		assertTrue(cal6.money() == 49.95);
	}
	
	@Test
	public void testMoneySilver(){
		Calculator cal6 = new Calculator();//assertEquals(a,b)
		cal6.grade = 2;
		cal6.line = 1;
		cal6.time = 499;
		assertTrue(cal6.money() == 29.95);
	}
	
	@Test
	public void testMoneyOthers(){
		Calculator cal6 = new Calculator();//assertEquals(a,b)
		cal6.grade = 3;
		cal6.line = 1;
		cal6.time = 878;
		assertTrue(cal6.money() == 0);
	}
	
	@Test
	public void testaddline(){
		Calculator cal1 = new Calculator(); //assertEquals(a,b)
		cal1.line = 5;
		assertEquals(cal1.addline(),2);
	}

	@Test
	public void testcalline(){ // 회선으로만 추가되는 요금 test
		Calculator cal2 = new Calculator();//assertEquals(a,b)
		cal2.grade = 1;
		cal2.line = 4;
		assertTrue(cal2.calline()==34);
	}
	@Test
	public void testonelinegoldcalline(){
		Calculator cal1 = new Calculator(); //assertEquals(a,b)
		cal1.grade = 1;
		cal1.line = 1;
		assertTrue(cal1.calline()==0.0);	
	}
	@Test
	public void testcalminutegoldnoaddline(){
		Calculator cal = new Calculator();//assertEquals(a,b)
		cal.grade = 1;
		cal.time = 878;
		assertTrue((cal.calminute()-49.95)<0.1&&(cal.calminute()-49.95)>=0);
	}
	@Test
	public void testcalminutegoldexistaddline(){
		Calculator cal = new Calculator();//assertEquals(a,b)
		cal.grade = 1;
		cal.time = 1127;
		assertTrue((cal.calminute()-107.1)<0.1&&(cal.calminute()-107.1)>=0);
	}
	@Test
	public void testcalminutesilvernoaddline(){
		Calculator cal = new Calculator();//assertEquals(a,b)
		cal.grade = 2;
		cal.time = 300;
		assertTrue((cal.calminute()-29.95)<0.1&&(cal.calminute()-29.95)>=0);
	}
	@Test
	public void testcalminutesilverexistaddline(){
		Calculator cal = new Calculator();//assertEquals(a,b)
		cal.grade = 2;
		cal.time = 1200;
		assertTrue((cal.calminute()-407.95)<0.1&&(cal.calminute()-407.95)>=0);
	}
	@Test
	public void testcalminuteerror(){
		Calculator cal = new Calculator();//assertEquals(a,b)
		cal.grade = 3;
		cal.time = 1200;
		assertTrue((cal.calminute()+1)>=-0.1&&(cal.calminute()+1)<0.1);
	}

	@Test
	public void testmoney(){		
		Calculator cal4 = new Calculator();//assertEquals(a,b)
		cal4.grade = 2;
		cal4.line = 2;
		cal4.time = 523;
		int temp = (int)cal4.money();
		assertTrue(temp==63);
	}
}
