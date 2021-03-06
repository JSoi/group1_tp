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
		assertEquals(cal6.money(), 49.95, 0.02);
	}
	
	@Test
	public void testMoneySilver(){
		Calculator cal6 = new Calculator();//assertEquals(a,b)
		cal6.grade = 2;
		cal6.line = 1;
		cal6.time = 499;
		assertEquals(cal6.money(), 29.95, 0.02);
	}
	
	@Test
	public void testMoneyOthers(){
		Calculator cal6 = new Calculator();//assertEquals(a,b)
		cal6.grade = 3;
		cal6.line = 1;
		cal6.time = 878;
		assertEquals(cal6.money(), 0.0, 0.02);
	}

	@Test
	public void testaddline(){
		Calculator cal1 = new Calculator(); //assertEquals(a,b)
		cal1.line = 5;
		assertEquals(cal1.addline(),2);
	}

	@Test
	public void testcalLineGold(){ 
		Calculator cal2 = new Calculator();//assertEquals(a,b)
		cal2.grade = 1;
		cal2.line = 4;
		assertEquals(cal2.calline(), 34.0, 0.02);
	}
	
	@Test
	public void testAddLineSilver(){
		Calculator cal1 = new  Calculator();
		cal1.grade = 2;
		cal1.line =4;
		assertEquals(cal1.calline(), 48.0, 0.02);
		
	}
	
	@Test
	public void testNoAddLineGold(){
		Calculator cal1 = new Calculator();
		cal1.grade = 1;
		cal1.line=2;
		assertEquals(cal1.calline(), 14.5, 0.02);
	}
	
	@Test
	public void testNoAddLineSilver(){
		Calculator cal1 = new Calculator();
		cal1.grade = 2;
		cal1.line=2;
		assertEquals(cal1.calline(), 21.5, 0.02);
	}
	
	
	
	@Test
	public void testonelinegoldcalline(){
		Calculator cal1 = new Calculator(); //assertEquals(a,b)
		cal1.grade = 1;
		cal1.line = 1;
		assertEquals(cal1.calline(), 0.0, 0.02);
	}
	
	
	/* Addminute */
	@Test
	public void testaddminutegoldnoaddminute(){
		Calculator cal = new Calculator();//assertEquals(a,b)
		cal.grade = 1;
		cal.time = 800;
		assertEquals(cal.addminute(),-1);
	}
	@Test
	public void testaddminutegoldexistaddminute(){
		Calculator cal = new Calculator();//assertEquals(a,b)
		cal.grade = 1;
		cal.time = 1800;
		assertEquals(cal.addminute(),800);
	}
	@Test
	public void testaddminutesilvernoaddminute(){
		Calculator cal = new Calculator();//assertEquals(a,b)
		cal.grade = 2;
		cal.time = 100;
		assertEquals(cal.addminute(),-1);
	}
	@Test
	public void testaddminutesilverexistaddminute(){
		Calculator cal = new Calculator();//assertEquals(a,b)
		cal.grade = 2;
		cal.time = 700;
		assertEquals(cal.addminute(),200);
	}
	@Test
	public void testaddminuteerror(){
		Calculator cal = new Calculator();//assertEquals(a,b)
		cal.grade = 3;
		cal.time = 700;
		assertEquals(cal.addminute(),-100);
	}
	/* Calminute */
	@Test
	public void testcalminutegoldnoaddline(){
		Calculator cal = new Calculator();//assertEquals(a,b)
		cal.grade = 1;
		cal.time = 878;
		assertEquals(cal.calminute(), 49.95, 0.02);
	}
	@Test
	public void testcalminutegoldexistaddline(){
		Calculator cal = new Calculator();//assertEquals(a,b)
		cal.grade = 1;
		cal.time = 1127;
		assertEquals(cal.calminute(), 107.1, 0.02);
	}
	@Test
	public void testcalminutesilvernoaddline(){
		Calculator cal = new Calculator();//assertEquals(a,b)
		cal.grade = 2;
		cal.time = 300;
		assertEquals(cal.calminute(), 29.95, 0.02);
	}
	@Test
	public void testcalminutesilverexistaddline(){
		Calculator cal = new Calculator();//assertEquals(a,b)
		cal.grade = 2;
		cal.time = 1200;
		assertEquals(cal.calminute(), 407.95, 0.02);
	}
	@Test
	public void testcalminuteerror(){
		Calculator cal = new Calculator();//assertEquals(a,b)
		cal.grade = 3;
		assertEquals(cal.calminute()+1, 0.0, 0.02);
	}


}
