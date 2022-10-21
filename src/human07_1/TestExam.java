package human07_1;

public class TestExam {

	public static void main(String[] args) {
		Test t = new Test();
		
		try {
			t.test("100", "a100");	
		}
		catch(NumberFormatException ne) {
			System.out.println(ne.getMessage());
		}
		
//		t.test("100", "a100");
		
		System.out.println("시스템 종료");

	}

}
