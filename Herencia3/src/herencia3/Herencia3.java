//Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
//Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
//televisores, con valores ya asignados.
//Luego, recorrer este array y ejecutar el método precioFinal() en cada
//electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto,
//es decir, el precio de todos los televisores y el de las lavadoras. Una vez hecho
//eso, también deberemos mostrar, la suma del precio de todos los
//Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 2000
//y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
//electrodomésticos, 2000 para lavadora y 5000 para televisor.
package herencia3;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;

/**
 *
 * @author Betsa
 */
public class Herencia3 {

    public static void main(String[] args) {
        Electrodomestico E = new Electrodomestico();

        Lavadora L = new Lavadora();
        Televisor T = new Televisor();

        ArrayList<String> Lavadora = new ArrayList();

        System.out.println("**************" + "LAVADORA 1" + "*****************");
        L.crearElectrodomestico(3500, "negro", 60, 'F');
        L.crearLavadora(0);
        System.out.println("El precio de la lavadora ingresada es de: " + L.precioFinal());

        System.out.println("**************" + "LAVADORA 2" + "*****************");
        L.crearElectrodomestico(3500, "negro", 60, 'F');
        L.crearLavadora(0);
        System.out.println("El precio de la lavadora ingresada es de: " + L.precioFinal());

        System.out.println("**************" + "LAVADORA 3" + "*****************");
        L.crearElectrodomestico(3500, "negro", 60, 'F');
        L.crearLavadora(0);
        System.out.println("El precio de la lavadora ingresada es de: " + L.precioFinal());

        System.out.println("**************" + "LAVADORA 4" + "*****************");
        L.crearElectrodomestico(3500, "negro", 60, 'F');
        L.crearLavadora(0);
        System.out.println("El precio de la lavadora ingresada es de: " + L.precioFinal());

        ArrayList<String> Televisor = new ArrayList();
        System.out.println("**************" + "TELEVISOR 1" + "*****************");
        T.crearElectrodomestico(3500, "negro", 60, 'F');
        T.crearTelevisor(32, true);
        System.out.println("El precio del TV cargado es de: " + T.precioFinal());

        System.out.println("**************" + "TELEVISOR 2" + "*****************");
        T.crearElectrodomestico(500, "gris", 50, 'A');
        T.crearTelevisor(43, true);
        System.out.println("El precio del TV cargado es de: " + T.precioFinal());

        System.out.println("**************" + "TELEVISOR 3" + "*****************");
        T.crearElectrodomestico(500, "gris", 50, 'A');
        T.crearTelevisor(43, true);
        System.out.println("El precio del TV cargado es de: " + T.precioFinal());

        System.out.println("**************" + "TELEVISOR 4" + "*****************");
        T.crearElectrodomestico(500, "gris", 50, 'A');
        T.crearTelevisor(43, true);
        System.out.println("El precio del TV cargado es de: " + T.precioFinal());
    }

}
//  System.out.println("CARGUE DATOS DEL TV");
//   System.out.println("CARGUE DATOS DE LA LAVADORA");
