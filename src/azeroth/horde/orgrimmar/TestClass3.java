package azeroth.horde.orgrimmar;

public class TestClass3 {
	private final int property1;
	private final int property2;
	private final int property3;
	private final int property4;
	private final int property5;
	
	public static class Builder{
		//Required parameters
		private final int property1 ;
		private final int property2 ;
		//Optional parameters
		private  int property3 =0;
		private  int property4 =0;
		private  int property5 =0;
		
		public Builder(int a,int b){
			this.property1 = a;
			this.property2 = b;
		}
		public Builder property3(int c){
			this.property3 = c;
			return this;
		}
		public Builder property4(int d){
			this.property4 = d;
			return this;
		}
		public Builder property5(int e){
			this.property5 = e;
			return this;
		}
		public TestClass3 builder(){
			return new TestClass3(this);
		}
	}
	
	private  TestClass3(Builder builder){
		this.property1 = builder.property1;
		this.property2 = builder.property2;
		this.property3 = builder.property3;
		this.property4 = builder.property4;
		this.property5 = builder.property5;
	}

}
