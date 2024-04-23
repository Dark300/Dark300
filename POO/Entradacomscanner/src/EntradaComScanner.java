import java.util.*;
public class EntradaComScanner {

    public static void main(String[] args) {
        float largura, comprimento, area, perimetro;
        Scanner sc;
        try {
            System.out.println("Entre com o comprimento: ");
            sc = new Scanner(System.in);
            comprimento = sc.nextFloat();

            System.out.println("Entre com a largura: ");
            sc = new Scanner(System.in);
            largura = sc.nextFloat();

            area = comprimento * largura;
            perimetro = comprimento * 2 + largura * 2;

            System.out.println("area do terreno: " + area);
            System.out.println("area do perimetro: " + perimetro);


        }
        catch (NumberFormatException e) {
            System.out.println("houve um erro na conversão, digite apenas numeros!!");
        }

    }



}
