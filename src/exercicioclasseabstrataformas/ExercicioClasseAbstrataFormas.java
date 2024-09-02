/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioclasseabstrataformas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Computador
 */
public class ExercicioClasseAbstrataFormas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner tec = new Scanner(System.in);
    List<Formas> lista = new ArrayList<>();
    
        System.out.print("Digite o número de formas: ");   
        int cap = tec.nextInt();
        
        for(int i=0; i<cap; i++){
            System.out.println("Dados da Forma #" + (i +1));
            System.out.println("Retângulo ou Circulo: (r/c)");
            char tipo = tec.next().charAt(0);
            if(tipo == 'c'){
               System.out.println("Color (BLUE/RED/BLACK): ");
               tec.nextLine();
               String corF = tec.nextLine();
               System.out.println("Digite o raio: ");
               Double raioF = tec.nextDouble();
               lista.add(new Circulo(raioF, Color.valueOf(corF)));
            }
            else if (tipo == 'r'){
               System.out.println("Color (BLUE/RED/BLACK): ");
               tec.nextLine();
               String corF = tec.nextLine();
               System.out.println("Digite o altura: ");
               Double alturaF = tec.nextDouble();
               System.out.println("Digite o largura: ");
               Double larguraF = tec.nextDouble();
               lista.add(new Retangulo(alturaF, larguraF, Color.valueOf(corF)));
            }
            }
         System.out.println("---Àrea da forma---");
            for (Formas listaF: lista){
                System.out.println(listaF.area());
        }
        
    }
    
}
