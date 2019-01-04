package prob01;

public class Printer<T> {

/*	public void println(int i) {
		// TODO Auto-generated method stub
		System.out.println(i);
	}

	public void println(boolean b) {
		// TODO Auto-generated method stub
		System.out.println(b);
	}

	public void println(double d) {
		// TODO Auto-generated method stub
		System.out.println(d);
	}

	public void println(String string) {
		// TODO Auto-generated method stub
		System.out.println(string);
	}*/
	public void println(T t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}
	
	
	public <T> void printLn( T... ts) {
		for(T t : ts) {
			System.out.println(t);
		}
	}
	
	
	// 가변 변수
	// Integer[] nums = { 1, 2, 3 }
	// sum(nums);
	// sum(1, 2, 3, 4, 5)
	// sum(10, 20)
	// sum(100, 200, 300)
	public Integer sum(Integer... nums) {
		Integer sum = 0;
		// nums -> 배열이다!!
		for(Integer i : nums) {
			sum += i;
		}
		return sum;
	}
}
