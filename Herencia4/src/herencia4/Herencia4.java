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
package herencia4;

import Entidades.Circulo;

import Entidades.Rectangulo;

/**
 *
 * @author Betsa
 */
public class Herencia4 {

    public static void main(String[] args) {

        Circulo circulo1 = new Circulo(0, 0, 0, 0);
        circulo1.areaCirculo(3.14, 2, 3);
        circulo1.perimetroCirculo(3.14, 2);

        Rectangulo rectangulo1 = new Rectangulo(0, 0, 0, 0);
        rectangulo1.areaRectangulo(3, 3);
        rectangulo1.perimetroRectangulo(2, 2);

    }

}
