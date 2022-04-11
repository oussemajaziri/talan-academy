
public class Pont {
	public String name;
	public String type;
	private int id;
	private Mat mat;
	
	public Pont(String name, String type) {     
			this.name = name;
			this.type = type; 
	}
	
	public Pont() {     
		
	}
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public Mat getMat() {
		return this.mat;
	}
	public void setMat(Mat m) {
		this.mat=m;
	}
	
	
    public String toString() {
        return "Le pont n°" + this.id + " est constitué du mât n°" + this.mat.getId()+"qui est constitué de la Voile N°"+this.mat.getVoile().getId() ;
    }
}
