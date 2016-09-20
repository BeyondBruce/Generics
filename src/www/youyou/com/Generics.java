package www.youyou.com;

public class Generics {
	//使用泛型方法输出元素
	public static void main(String[] args) {

		String[] str={"android","java","C++"};
		Integer[] integer={1,3,4};
		
		System.out.println("str:");
		Test(str);
		
		System.out.println("integer:");
		Test(integer);

	}
	// 泛型方法   所有泛型方法声明都有一个类型参数声明部分（即尖括号部分）
	public static <E> void Test(E[]element ){
		//for遍历，输出String[]，Integer[]
		for(E e : element){
			System.out.println(e);
		}
		System.out.println();
	}
	
}
