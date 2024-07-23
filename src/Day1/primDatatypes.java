package Day1;

public class PrimDatatypes {
	public static void main(String[] args){
		byte b=1;
		short s=2;
		int i=3;
		long l=4;
		float f= 4.5f;
		char c='5';
		double d=5.5;
		boolean bo=true;
		System.out.println(b + "\nType: "+ ((Object)b).getClass().getName() + " \nSize: "+ Byte.SIZE);
		System.out.println(s + "\nType: "+ ((Object)s).getClass().getName() + " \nSize: "+ Short.SIZE);
		System.out.println(i + "\nType: "+ ((Object)i).getClass().getName() + " \nSize: "+ Integer.SIZE);
		System.out.println(l + "\nType: "+ ((Object)l).getClass().getName() + " \nSize: "+ Long.SIZE);
		System.out.println(f + "\nType: "+ ((Object)f).getClass().getName() + " \nSize: "+ Float.SIZE);
		System.out.println(c + "\nType: "+ ((Object)c).getClass().getName() + " \nSize: "+ Character.SIZE);
		System.out.println(d + "\nType: "+ ((Object)d).getClass().getName() + " \nSize: "+ Double.SIZE);
		System.out.println(bo + "\nType: "+ ((Object)bo).getClass().getName() + " \nSize: 1");
		
	}
}
