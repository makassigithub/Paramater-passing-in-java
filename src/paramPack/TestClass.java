package paramPack;

public class TestClass {

	public static void main(String[] args) {
		
		// Let's see what happens to the the primitive a and b before and after the call of dividPrimitiveArg() .
		MyCase1 ob1 = new MyCase1();
		
		// primitive values that will be use to test the primitive passing for MyCase1.java
		int a = 10, b=7;
		
		
		
		System.out.println("a and b before call to dividArg(): "+a+" & "+b);
		ob1.dividPrimitiveArg(a, b);
		System.out.println("a and b after call to dividArg() : "+a+" & "+b);
		
		/*The output is:
		 a and b before call to dividArg(): 10 & 7
         a and b after call to dividArg() : 10 & 7
		 */
		
		// Let's see what happens to a and b before and after the call to dividObjectArg() on an instance of MyObject.
		
		MyCase2 ob2 = new MyCase2(20,30);
		System.out.println("a and b before call to dividArg() :" +ob2.a +" & "+ ob2.b);
		ob2.dividObjectArg(ob2);
		System.out.println("a and b after   call to dividArg() :" +ob2.a +" & "+ob2.b);
		
		/*The output is:
		 a and b before call to dividArg(): 20 & 30
         a and b after call to dividArg() : 10 & 60
		 */
	}

}
