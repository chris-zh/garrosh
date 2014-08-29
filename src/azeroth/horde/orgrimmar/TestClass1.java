package azeroth.horde.orgrimmar;

/**
 * 重叠构造器示例(telescoping constructor)
 * @author chris.zhang
 *
 */
public class TestClass1 {
	private final int property1;
	private final int property2;
	private final int property3;
	private final int property4;
	private final int property5;
	
	public TestClass1(int a,int b,int c,int d,int e){
		this.property1 = a;
		this.property2 = b;
		this.property3 = c;
		this.property4 = d;
		this.property5 = e;
	}
	public TestClass1(int a,int b,int c,int d){
		this(a,b,c,d,0);
	}
	public TestClass1(int a,int b,int c){
		this(a,b,c,0);
	}
	public TestClass1(int a,int b){
		this(a,b,0);
	}
	public TestClass1(int a){
		this(a,0);
	}
	public TestClass1(){
		this(0);
	}
	
	
}
