/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Betsa
 */
public class Electrodomestico {
     Scanner leer = new Scanner(System.in);
    protected double precio = 1000;
    protected String color;
    protected char consumo;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumo, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char comprobarConsumoEnergetico(char consumo) {
        char consumoDefinitivo = 'F';
        if ((getConsumo() != 'A') || (getConsumo() != 'B') || (getConsumo() != 'C') || (getConsumo() != 'D') || (getConsumo() != 'E') || (getConsumo() != 'F')) {
            consumo = consumoDefinitivo;
        }
        return consumo;
    }

    public String comprobarColor(String color) {
        String colorDefinitivo = "BLANCO";
        if ("blanco".equals(color) || "BLANCO".equals(color)
                || "negro".equals(color) || "NEGRO".equals(color)
                || "rojo".equals(color) || "ROJO".equals(color)
                || "azul".equals(color) || "AZUL".equals(color)
                || "gris".equals(color) || "GRIS".equals(color)) {
            color = color;
        } else {
            color = colorDefinitivo;
        }
        return color;
    }

    public Electrodomestico crearElectrodomestico(double precio, String color, double peso, char consumo) {

        System.out.print("De que color es el Electrodomestico: ");
        setColor(leer.next());
        comprobarColor(color);

        System.out.print("Cual es el peso del Electrodomestico: ");
        setPeso(leer.nextDouble());

        System.out.print("Ingrese la letra del consumo del Electrodomestico(A a F): ");
        setConsumo(leer.next().charAt(0));
        comprobarConsumoEnergetico(consumo);

        return new Electrodomestico(getPrecio(), comprobarColor(color), comprobarConsumoEnergetico(consumo), getPeso());

    }

    public double precioFinal() {

        switch (consumo) {
            case 'A':
                precio += 1000;
                break;
            case 'B':
                precio += 800;
                break;
            case 'C':
                precio += 600;
                break;
            case 'D':
                precio += 500;
                break;
            case 'E':
                precio += 300;
                break;
            case 'F':
                precio += 100;
                break;
            default:
                break;
        }
        // System.out.println("El precio con consumo es"+ precio);

        if ((getPeso() >= 1) && (getPeso() <= 19)) {
            precio += 100;
        } else if ((getPeso() >= 20) && (getPeso() <= 49)) {
            precio += 500;
        } else if ((getPeso() >= 50) && (getPeso() <= 79)) {
            precio += 800;
        } else if (getPeso() >= 80) {
            precio += 1000;
        }

        return getPrecio();
    }
}