package another;
import source.Parent;

public class NonSubclass {
	public NonSubclass() {
		Parent p=new Parent();
		System.out.println(p.d);
	}
}
