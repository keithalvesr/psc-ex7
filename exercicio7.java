import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {

     //Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
     double areaQuadrado;
     double largura;
     double dobroArea;
     System.out.println("Bem vindo ao programa de calculo de um quadrado, informe a largura do quadrado: ");

     //Ação do usuário:  Informar a largura
     Scanner teclado = new Scanner (System.in);
     largura = teclado.nextDouble();
     teclado.close();

     //Ação do programa: Calcular area do quadrado e após isso o dobro dessa area:
     areaQuadrado = largura * largura;
     dobroArea = areaQuadrado * 2;

     //Resposta do programa: Mostrar area do quadrado e em seguida o dobro desta area;
     System.out.println("A área do quadrado é:  ");
     System.out.println(areaQuadrado);
     System.out.println("O dobro da area desse quadrado é:  " + dobroArea);  
    




    

    }
    
}
