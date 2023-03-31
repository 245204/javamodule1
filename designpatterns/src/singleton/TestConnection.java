package singleton;

public class TestConnection {
	public static void main(String[] args) {
//		System.out.println("con2 "+con2);
//		System.out.println("con1 "+con1);
		for(int i=0;i<10;i++) {
		Connection con1=Connection.getConnection();
		Connection con2=Connection.getConnection();
		if(con1.hashCode()==con2.hashCode()) {
			System.out.println("singleton pattern");
			
		}else
			System.out.println("not");
		
		}
	}

}
