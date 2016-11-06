package paramPack;

public class MyCase2 {
 int a,b;
 
 // The constructor of object of type MyObject
 public MyCase2(int p, int q){
	 this.a = p;
	 this.b=  q;
 }

//This method divides object instance variables per 2 and is designed to test "object passing"
public void dividObjectArg(MyCase2 obj){ 
	obj.a /= 2;
	obj.b *= 2;
	
}

}
