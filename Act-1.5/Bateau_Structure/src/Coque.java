
public class Coque {
	public String name;
	public String type;
	private int id;
	
	public Coque(String name, String type) {     
			this.name = name;
			this.type = type; 
	}
	
	public Coque() {     
		
	}
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public String toString() {
        return "Le coque n° " + this.id;
    }
}
