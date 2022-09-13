//Se plantea desarrollar un programa que nos permita calcular el área y el perímetro
//de formas geométricas, en este caso un circulo y un rectángulo. Ya que este
//calculo se va a repetir en las dos formas geométricas, vamos a crear una Interfaz,
//llamada calculosFormas que tendrá, los dos métodos para calcular el área, el
//perímetro y el valor de PI como constante.
//Desarrollar el ejercicio para que las formas implementen los métodos de la
//interfaz y se calcule el área y el perímetro de los dos. En el main se crearán las
//formas y se mostrará el resultado final.
//Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
//Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2
package Entidades;

/**
 *
 * @author Betsa
 */
public class Rectangulo extends Figuras implements calculoFormaRectangulo {

    public Rectangulo(double radio, double diametro, double base, double altura) {
        super(radio, diametro, base, altura);
    }

    @Override
    public void areaRectangulo(double base, double altura) {
        double area = base * altura;
        System.out.println("El area del rectángulo es:" + area);

    }

    @Override
    public void perimetroRectangulo(double base, double altura) {
        double perimetro = (base + altura) * 2;
        System.out.println("El perimetro del rectángulo es: " + perimetro);

    }

}
