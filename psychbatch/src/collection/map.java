package collection;
import java.util.Map;
import java.util.LinkedHashMap;

public class map {
	public static void main(String[] args) {
		Map<String,Integer>m=new LinkedHashMap();
		m.put("a1",1);
		m.put("a2",2);
		m.put("a3",3);
		m.put("a4",4);
		System.out.println(m.size());
		System.out.println(m.isEmpty());
		//m.clear();
		System.out.println(m);
		System.out.println(m.get("a4"));
		System.out.println(m.containsKey("a3"));
		System.out.println(m.containsValue(3));
		System.out.println(m.keySet());
		System.out.println(m.values());
		//m.remove("a1");
		//System.out.println(m);
		//m.remove("a1",1);
		//System.out.println(m);
//		for(Map.Entry<String,Integer>x:m.entrySet()) {
//			System.out.println(x.getKey()+" "+x.getValue());
//		}
		Map<String,Integer>m1=new LinkedHashMap();
		m1.put("b1",1);
		m1.put("b2",2);
		m1.put("b3",3);
		m1.put("b4",4);
		System.out.println(m1);
		m.putAll(m1);
		System.out.println(m);
	}
}
