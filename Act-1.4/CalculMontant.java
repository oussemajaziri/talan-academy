import java.util.Scanner;
public class CalculMontant{

    public static void main(String[] args){

    int quantite, nbarticles;
    double prix, totalHT, totalTTC;
    String tauxTVA;
    totalHT = 0.0;
    totalTTC = 0.0;
    System.out.println("Donner le nombre d'articles: ");
    Scanner clavier1 = new Scanner(System.in);
    nbarticles= clavier1.nextInt();
 
        for (int j=1; j<=nbarticles; j=j+1){
            
            System.out.println("Prix de l'articel: " + j + " ");
            Scanner clavier2 = new Scanner(System.in);
            prix= clavier2.nextInt();
            
            System.out.println("Quantité de l'articele: " + j +" ");
            Scanner clavier3 = new Scanner(System.in);
            quantite= clavier3.nextInt();
            
            System.out.println("Taux de TVA (n, i, r) de l'article: " + j + " ");
            Scanner clavier4 = new Scanner(System.in);
            tauxTVA= clavier4.nextLine();
            
            totalHT = totalHT + (prix *quantite);
            
            if (tauxTVA .equals("i")){
            totalTTC = totalTTC + (prix *quantite *1.1);
            }else if (tauxTVA .equals("r")){
            totalTTC = totalTTC + (prix *quantite *1.055);
            }else{
            totalTTC = totalTTC + (prix *quantite *1.2);
            }
        }
        
    System.out.println("Total HT: ");
    System.out.println(totalHT);
    System.out.println("Total TTC:");
    System.out.println(totalTTC);
    
    }
}