

	//Different types of Constructor
class Con{
		int id ;
		String name;
		void displayCon() {
			System.out.println("name and id "+ name + " "+ id);
		}
		Con(int id,String name){
			this.id=id;
			this.name=name;
			System.out.println("NAme and Number "+name+ ", "+ id);
		}
	}

	public class constructor {
		public static void main(String[] args) {
			/*Con c=new Con();
			c.name="Kamlesh";
			c.id=1231;
			c.displayCon();*/
			Con c2=new Con(2323,"Adam");
			/*c2.id=222;
			c2.name="Alex";*/
			c2.displayCon();
			
		}

	}


