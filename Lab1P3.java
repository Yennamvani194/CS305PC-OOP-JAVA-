import java.util.Scanner;

class Lab1P3{
	public static void main(String...ags){
		Scanner s = new Scanner(System.in);
		try{
		
		int a = s.nextInt();
		int b = s.nextInt();
		//var c = a/b;
		System.out.println(a/b);
		}
		catch(Exception e)
		{
		System.out.println(e.getClass());
		}
            }
}
