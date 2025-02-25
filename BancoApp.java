package bancoapp;

public class BancoApp {
    public static void main(String[] args) {
        // Crear clientes
        Cliente cliente1 = new Cliente("Ana", 1000);
        Cliente cliente2 = new Cliente("Carlos", 2000);

        // Realizar operaciones
        cliente1.consignar(500);
        cliente2.retirar(300);

        // Mostrar saldo final de los clientes
        System.out.println("Saldo de " + cliente1.getNombre() + ": " + cliente1.getSaldo());
        System.out.println("Saldo de " + cliente2.getNombre() + ": " + cliente2.getSaldo());
    }
}
