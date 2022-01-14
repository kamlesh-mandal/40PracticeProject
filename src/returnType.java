
public class returnType {
	 
		public int add() {
			int x= 30;
			int y= 40;
			int z= x+y;
			return z;
			
		}
		public static void main(String[] args) {
			returnType r=new returnType();
			int add =r.add();
			System.out.println("The sum of x and y is:" + add);
			
		

	}

}
