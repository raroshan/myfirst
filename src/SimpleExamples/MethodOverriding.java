package SimpleExamples;


class DBDriver{
    public String name = "Database";
    
    public void show() {
    	System.out.println("Default Database");
    }
	
}

class OracleDriver extends DBDriver{
	
	public String name = "Oracle";
	
	public void show() {
    	System.out.println("Oracle Database");
    }
	
	public void display() {
		System.out.println("oracle display");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
          DBDriver db = new DBDriver();
          OracleDriver ordb = new OracleDriver();
          DBDriver db1 = new OracleDriver();
          
          db.show();
          ordb.show();
          db1.show();
          System.out.println("-------------------");
          ordb.display();
          
          System.out.println(db.name);
          System.out.println(ordb.name);
          System.out.println(db1.name);
     }

}
