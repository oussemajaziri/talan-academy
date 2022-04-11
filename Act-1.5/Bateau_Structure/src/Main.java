public class Main {
	
    public static void main(String[] args) {
    	
        Voile voile = new Voile("Satin", 300);
        voile.setName("Premiere");
        voile.setType("Epaisse");
        voile.setId(1);
        voile.setRoule(true);
        
        Mat mat = new Mat ("matOne","sss");
        mat.setVoile(voile);
        mat.setId(5);
        
        Cabine cabine = new Cabine("cabineOne","dddd");
        cabine.setId(6);
    
        Pont pont = new Pont ("namepont","ssdfdf");
        pont.setId(6);
        pont.setMat(mat);
        
        Coque coque = new Coque ("namCoque", "typeCoque");
        coque.setId(3);
        
        Bateau bateau = new Bateau("cart", "grand");
        bateau.setId(100);
        bateau.setPont(pont);
        bateau.setCoque(coque);
        bateau.setCabine(cabine);
        
        System.out.println(bateau);
        System.out.println(coque);
        System.out.println(cabine);
        System.out.println(pont);
    }        
        
}        