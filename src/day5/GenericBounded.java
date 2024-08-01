package day5;

class Numbers<T extends Number>{
	private T[] nums;
	
	public Numbers(T ...nums) {
		this.nums=nums;
	}

	public T[] getNums() {
		return nums;
	}

	public void setNums(T ...nums) {
		this.nums = nums;
	}
	
}

public class GenericBounded {
	public static void main(String[] args) {
		Numbers<Number> n1=new Numbers<>(3,5,6,8,1,2,3);
		
		printVals(n1.getNums());
	}
	
	private static <T> void printVals(T[] val) {
		for(T a: val) {
			System.out.println(a);
		}
	}
}
