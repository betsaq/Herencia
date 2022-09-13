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
import Entidades.Figuras;
/**
 *
 * @author Betsa
 */
public class Circulo extends Figuras implements calculoFormaCirculo {

    public Circulo(double radio, double diametro, double base, double altura) {
        super(radio, diametro, base, altura);
    }

    @Override
    public void areaCirculo(double PI, double radio, double diametro) {
     
        double area = PI * radio / 2;
        System.out.println("El area del circulo es: " + area);

    }

    @Override
    public void perimetroCirculo(double PI, double diametro) {
        double perimetro = PI * diametro;
        System.out.println("El perimetro del Circulo es de: " + perimetro);
    }
}

//public class Circulo implements calculoFormaCirculo {
//
//    @Override
//    public void areaCirculo(double PI, double radio, double diametro) {
//
//    }
//
//    @Override
//    public void perimetroCirculo(double PI, double diametro) {
//
//    }
