package Entidades;

public class Televisor extends Electrodomestico {

    private int pulgadas;
    private boolean TDT;

    public Televisor() {
    }

    public Televisor(int pulgadas, boolean TDT, double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    public Televisor crearTelevisor() {
        crearElectrodomestico();
        System.out.print("Cuantas Pulgadas tiene el televisor: ");
        setPulgadas(leer.nextInt());

        System.out.print("Posee sintonizador TDT: ");
        String aux ;
        aux=leer.next();

        if ("SI".equals(aux) || "si".equals(aux)) {
            setTDT(true);
        } else if ("NO".equals(aux) || "no".equals(aux)) {
            setTDT(false);
        }
        isTDT();
        
        

     System.out.println(getPulgadas() + "****" + getPrecio() + "****" + getColor() + "****" + getConsumo() + "****" + getPeso()+"****" + isTDT());
        return new Televisor(getPulgadas(), isTDT(), getPrecio(), getColor(), getConsumo(), getPeso());

    }

    @Override
    public double precioFinal() {
        double Pe = 0;
        Pe += super.precioFinal();

        if (getPulgadas() > 40) {
            Pe = (Pe * 30 / 100) + Pe;
        }
        if (isTDT() == true) {
            Pe += 500;
        }
        return Pe;
    }

}
