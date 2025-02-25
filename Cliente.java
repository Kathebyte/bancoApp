package bancoapp;

public class Cliente {
    private String nombre;
    private double saldo;

    // Constructor
    public Cliente(String nombre, double saldoInicial) {
        this.nombre = nombre;
        this.saldo = saldoInicial;
    }

    // Métodos
    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método para consignar dinero
    public void consignar(double monto) {
        if (monto > 0) {
            setSaldo(getSaldo() + monto);
            System.out.println(getNombre() + " ha consignado: " + monto);
        } else {
            System.out.println("El monto a consignar debe ser positivo.");
        }
    }

    // Método para retirar dinero
    public void retirar(double monto) {
        if (monto > 0 && getSaldo() >= monto) {
            setSaldo(getSaldo() - monto);
            System.out.println(getNombre() + " ha retirado: " + monto);
        } else {
            System.out.println("Fondos insuficientes o monto inválido.");
        }
    }

  
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
