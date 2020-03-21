import java.util.ArrayList;
import java.util.List;

public class Generics<T> {
	
	T obj1;
	T obj2;
	
	

	public T getObj1() {
		return obj1;
	}



	public void setObj1(T obj1) {
		this.obj1 = obj1;
	}



	public T getObj2() {
		return obj2;
	}



	public void setObj2(T obj2) {
		this.obj2 = obj2;
	}

	

	public Generics(T obj1, T obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Generics<String> g= new Generics<>("sachin", "chippalkatti");
		 System.out.println(g.getObj1() + g.getObj2());
		 
		 Generics<Integer> g1= new Generics<>(100, 120);
		 System.out.println(g.getObj1() + g.getObj2());
		 
		 List ls = new ArrayList();
		 ls.add("sachin");
		 ls.add(100);
		 String s = (String) ls.get(0);
		 System.out.println(ls.get(0));
		 System.out.println(ls .get(1));
	}

}
