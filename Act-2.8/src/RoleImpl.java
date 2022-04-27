
public class RoleImpl implements Role {

	private int id;
	private String name;

	//Empty Constructor
	public RoleImpl() {

	}

	//Constructor with all atrributes
	public RoleImpl(int id, String name) {
		this.id = id;
		this.name = name;
	}

	//Constructor Without Id
	public RoleImpl(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
