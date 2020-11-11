package service;
import com.hcl.calculator;
public class compute {
	static int a=10;
	static int b=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      compute object=new compute();
      object.add(a,b);
	}

	private void add(int a,int b) {
		System.out.println(a+b);
	}
}
