package www.youyou.com;

class GenericsType<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	public String toString(){
		return this.t.toString();}
};

public class GenericsMethod {

	public static void main(String[] args) {
		GenericsType<String> str=new GenericsType<String>(); 
		GenericsType<Integer> integer=new GenericsType<Integer>(); 
		
		str.setT("java");
	    integer.setT(10);
	    
	//  Num(str);//字符串不属于Number及其子类而报错
		Num(integer);
	}

	//有界的类型方法 
	 public static void Num (GenericsType <? extends Number> num){
		 System.out.println(num);
	 }
}
