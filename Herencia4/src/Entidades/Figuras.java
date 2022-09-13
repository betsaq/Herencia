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
public class Figuras {

    protected double radio;
    protected final double PI = 3.14;
    protected double diametro;
    protected double base;
    protected double altura;

    public Figuras(double radio, double diametro, double base, double altura) {
        this.radio = radio;
        this.diametro = diametro;
        this.base = base;
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
