public class Voile {
		
	private String name;
	private String type;
	public String material;
	protected int voileNbr;
	private boolean roule;
	private int id;
	
	public Voile(String valAttributeThree, int nbr) {     
			this.material = valAttributeThree;
			this.voileNbr = nbr; 
	}
	
	public Voile() {     
		
	}
	
	public String getName() {
		    return this.name;
	}	  
	public void setName(String c) {
		    this.name = c;
	}
	
	
	public String getType() {
	    return this.type;
	}
	public void setType(String c) {
	    this.type = c;
	}
	
	
	public boolean getRoule() {
		return this.roule;
	}
	public void setRoule(boolean x) {
		this.roule=x;
	}
	
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public Boolean enrouler(boolean enroule) {
        this.roule = (enroule == true) ? true : false;
        return this.roule;
    }
	
	 public Boolean derouler(boolean deroule) {
	    this.roule = (deroule == true) ? false : true;
	    return this.roule;
	 }
}

