package Entidades;

public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public Lavadora crearLavadora() {

        crearElectrodomestico();

        System.out.print("De cuanto es la carga de la Lavadora?: ");
        setCarga(leer.nextInt());
        System.out.println(getCarga() + precio + getColor() + consumo + peso);

        return new Lavadora(getCarga(), getPrecio(), getColor(), getConsumo(), getPeso());
    }

    @Override
    public double precioFinal() {
        double P = 0;
        P += super.precioFinal();

      
        if (getCarga() > 30) {
            P += 500;
        } else if (getCarga() <= 30) {
        }

        return P;
    }
}
