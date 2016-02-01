import java.util.Scanner;

public class Pave{
        public static void main (String [] args) {
           float Longueur=askValue("Longueur");
           float Largeur= askValue("Largeur");
           float Hauteur= askValue("Hauteur");
  
           float Volume=Hauteur*Largeur*Longueur;
  
           System.out.println("Le volume du Pave est égal à"+Volume);
}
public static float askValue(String name){
       
           System.out.print("Entrez la " +name);
Scanner scan=new Scanner(System.in);
return scan.nextFloat();
}}
