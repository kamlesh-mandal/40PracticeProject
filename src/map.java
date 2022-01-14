import java.util.HashMap;
import java.util.Map;

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(100,"Alex");
		map.put(101,"Adam");
		map.put(103, "Alexnder");
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey() + " "+ m.getValue());
		}
		

	}

}