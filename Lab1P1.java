class Lab1P1{
	public static void main(String...args){
		byte b = 15;
		Byte bb=b;//autoboxing
		//int x = 100;
		//Byte b = x;
		System.out.println(Byte.MAX_VALUE);
		System.out.println(bb.MIN_VALUE);
		System.out.println(Byte.SIZE);
		System.out.println(Byte.TYPE);
		System.out.println(Byte.BYTES);
		
		System.out.println("........Short.......");
		
		short s=12;
		Short ss=s;
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(ss.MIN_VALUE);
		System.out.println(ss.SIZE);
		System.out.println(ss.TYPE);
		System.out.println(ss.BYTES);
		
		System.out.println("......Integer.....");
		
		int i=19;
		Integer ii=i;
		System.out.println(Integer.MAX_VALUE);
		System.out.println(ii.MIN_VALUE);
		System.out.println(ii.SIZE);
		System.out.println(ii.TYPE);
		System.out.println(ii.BYTES);
		
		
		}
}
