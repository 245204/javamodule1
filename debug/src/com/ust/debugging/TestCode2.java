package com.ust.debugging;

public class TestCode2 {
	int a;
	int b;
	int x;
	 int a1[]= {2,5,7,8,5};
	 int b1[]= {1,43,27,32,12};
	 int x1[]= {1,19,20,21,22};
	 
int ans() {
		int fans=0;
		for(int i=0;i<a1.length;i++) {
			int ans=((a1[i]*(x1[i])^2)+(b1[i]*(x1[i])^2)+(2*a1[i]*b1[i]));
			fans+=ans;	
		
		}
		return fans;
	}
	

		
	public static void main(String[] args) {
		TestCode2 ts=new TestCode2();
		System.out.println(ts.ans());
//		
	}

}
