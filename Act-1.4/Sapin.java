import java.util.Scanner;
public class Sapin{
    public static void main(String[] args){
    int nbtriangles, nbespaces, nbetoiles;
    System.out.print("Combien de triangles? ");
    Scanner clavier1 = new Scanner(System.in);
    nbtriangles= clavier1.nextInt();
    
    for (int n =1; n<= nbtriangles; n=n+1){
        nbespaces=5;
        nbetoiles = 1;
        for (int lig=0; lig<4; lig=lig+1){
            for (int i = 0; i < nbespaces; i=i+1){
                System.out.print(' ');
            }
            for (int i=0; i<nbetoiles; i=i+1){
                System.out.print('*');
            }
            System.out.println();
            nbetoiles = nbetoiles+2;
            nbespaces = nbespaces -1;
        }
    }
    nbespaces=4;
    nbetoiles = 3;
    for (int lig=0; lig<4; lig=lig+1){
        for (int i = 0; i < nbespaces; i=i+1){
            System.out.print(' ');
        }
        for (int i=0; i<nbetoiles; i=i+1){
            System.out.print('*');
        }
        System.out.println();
    }
    }
}