package paramPack;

public class Test {
 public static void main(String ...args){
	 
	 int a = 3;
	 int b = 3;
	 
	 String name = "Brahima";
	 String name2 = name;
	 
	 System.out.println(a == b);
	 System.out.println(name == name2);
	 
	 String c = "Traore";
	 String d = "Traore";
	 System.out.println("************************************");
	 System.out.println(c==d);
	 System.out.println(c.equals(d));
	 System.out.println("************************************");
	 String e = new String("makassi");
	 String f = new String("makassi");
	 System.out.println(e==f);
	 System.out.println(e.equals(f));
 }
}
