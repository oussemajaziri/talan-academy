
public class Bateau {

	public String name;
	public String type;
	private int id;
	private Coque coque;
	private Pont pont;
	private Cabine cabine;
	
	public Bateau(String name, String type) {     
			this.name = name;
			this.type = type; 
	}
	
	public Bateau() {     
		
	}
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id=id;
	}

	public Coque getCoque() {
		return this.coque;
	}
	public void setCoque(Coque c) {
		this.coque=c;
	}

	public Pont getPont() {
		return this.pont;
	}
	public void setPont(Pont p) {
		this.pont=p;
	}
	
	public Cabine getCabine() {
		return this.cabine;
	}
	public void setCabine(Cabine cab) {
		this.cabine=cab;
	}
	
	public String toString() {
        return "Le bateau n°" + this.id + " est constitué de:";
    }
	
}
