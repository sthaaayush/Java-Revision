package day5;

class User<K, T> {
	private K key;
	private T value;

	public User(K k, T t) {
		this.key = k;
		this.value = t;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}

public class GenericClass {
	public static void main(String[] args) {
		User<Integer, String> u1=new User<Integer, String>(2, "Harry");
		System.out.println("Key: "+u1.getKey() +"\nValue: "+ u1.getValue());
		
		User<String, Double> u2=new User<>("Vault1", 234.57);
		System.out.println("Key: "+u2.getKey() +"\nValue: "+ u2.getValue());
	}
}
