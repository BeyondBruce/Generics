package www.youyou.com;

//·ºĞÍÀà
public class GenericsTest<E> {

	private E e;
	
	public static void main(String[] args) {
		GenericsTest<String> str = new GenericsTest<>();
		GenericsTest<Integer> integer = new GenericsTest<>();
		
		str.setE(new String("Generics"));
		integer.setE(new Integer(8));

		System.out.println("str:"+str.getE());
		System.out.println("integer:"+integer.getE());
	}

	public E getE() {
		return e;
	}

	public void setE(E e) {
		this.e = e;
	}

}
