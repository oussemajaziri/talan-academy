
public class Mat {
	public String name;
	public String type;
	private int id;
	private Voile voile;
	
	public Mat(String name, String type) {     
			this.name = name;
			this.type = type; 
	}
	
	public Mat() {     
		
	}
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public Voile getVoile() {
		return this.voile;
	}
	public void setVoile(Voile v) {
		this.voile=v;
	}
}
