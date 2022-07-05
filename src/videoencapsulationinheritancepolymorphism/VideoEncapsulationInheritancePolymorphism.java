/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package videoencapsulationinheritancepolymorphism;

/**
 *
 * @author Marce
 */
public class VideoEncapsulationInheritancePolymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Video v[] = new Video[3];
        
        v[0] = new Video("Teste Youtube");
        v[1] = new Video("Nao assita e inedito");
        v[2] = new Video("Coisas qe voce nao vai acreditar");
        
        Usuario u[] = new Usuario[2];
        
        u[0] = new Usuario("jub", "Jubileu", "M", 22);
        u[1] = new Usuario("creuzita", "Creuza", "F", 12);
        
        Visualizacao vi[] = new Visualizacao[5]; 
        vi[0] = new Visualizacao(u[0], v[1]); // Nao assita  
        vi[0].avaliar();
        System.out.println(vi[0].toString());
        
        vi[1] = new Visualizacao(u[0], v[2]); // Coisas qe
        vi[1].avaliar(85.7f);
        System.out.println(vi[1].toString());
        
    }
    
}
