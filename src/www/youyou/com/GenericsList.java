package www.youyou.com;

import java.util.ArrayList;
import java.util.List;

class Info1<T, V>{
private T name;
private V age;
public Info1 (T name, V age){
this.name = name;
this.age =age;
}
public T getName() {
return name;
}
public void setName(T name) {
this.name = name;
}
public V getAge() {
return age;
}
public void setAge(V age) {
this.age = age;
}
@Override
public String toString() {
return "±¨¡œ  [name=" + name + ", age=" + age + "]";
}


}
 class Domain<S>{
private S info;
public Domain( S info){
this.info = info;
}
public S getInfo() {
return info;
}
public void setInfo(S info) {
this.info = info;
}
@Override
public String toString(){
return this.info.toString();
}
 

 }
 
public class GenericsList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		List<String> list2 = new ArrayList<String>();
		list2.add("c");
		list2.add("d");
		
		List<List<String>> list3 = new ArrayList<>();
		list3.add(list);
		list3.add(list2);

		
	    System.out.println(list3);
	    
		
	}

}
