package www.youyou.com;

//����ʵ�ֽӿ�
public class GenericsinterfaceDemo implements Genericsinterface<String, Integer>{

	public static void main(String[] args) {
		GenericsinterfaceDemo genericsinterface=new GenericsinterfaceDemo();
		genericsinterface.Test("Generics", 12);

	}

	@Override
	public void Test(String e, Integer t) {
		// TODO Auto-generated method stub
		System.out.println(e);
		System.out.println(t);
	}

}
