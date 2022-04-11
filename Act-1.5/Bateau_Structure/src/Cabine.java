
public class Cabine {
	public String name;
	public String type;
	private int id;
	
	public Cabine(String name, String type) {     
			this.name = name;
			this.type = type; 
	}
	
	public Cabine() {     
		
	}
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public String toString() {
        return "Le cabine n°" + this.id;
    }
}
