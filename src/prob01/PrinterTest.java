package prob01;

public class PrinterTest {

	public static void main(String[] args) {
		Printer printer = new Printer();

		printer.println( 10 );
		printer.println( true );
		printer.println( 5.7 );
		printer.println( "홍길동" );
		
		// 가변 변수
		printer.printLn(10, true, 5.7, "홍길동");
		
		// 가변 변수
		System.out.println(printer.sum(1, 2, 3, 5));
		System.out.println(printer.sum(1, 2, 3));
	}

}
