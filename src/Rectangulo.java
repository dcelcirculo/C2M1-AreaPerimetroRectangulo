import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite la altura del rectángulo");
        double altura = entrada.nextDouble();
        System.out.println("Digite el base del rectángulo");
        double base = entrada.nextDouble();

        double area = base * altura;
        System.out.printf("El área del rectangulo de base %.1f y altura %.1f, es: %.1f\n", base, altura, area);
        double perimetro = 2.0 * (base * altura);
        System.out.printf("El perimetro del rectangulo de base %.1f y altura %.1f, es: %.1f\n", base, altura,
                perimetro);

        entrada.close();
    }
}
