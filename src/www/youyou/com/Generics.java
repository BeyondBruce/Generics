package www.youyou.com;

public class Generics {
	//ʹ�÷��ͷ������Ԫ��
	public static void main(String[] args) {

		String[] str={"android","java","C++"};
		Integer[] integer={1,3,4};
		
		System.out.println("str:");
		Test(str);
		
		System.out.println("integer:");
		Test(integer);

	}
	// ���ͷ���   ���з��ͷ�����������һ�����Ͳ����������֣��������Ų��֣�
	public static <E> void Test(E[]element ){
		//for���������String[]��Integer[]
		for(E e : element){
			System.out.println(e);
		}
		System.out.println();
	}
	
}
