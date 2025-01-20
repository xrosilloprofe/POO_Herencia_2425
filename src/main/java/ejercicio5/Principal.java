package ejercicio5;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Coche ibiza = new Coche("Seat","Ibiza","1234PPP");
        Coche cupra = new Coche("Cupra","Born","9462MZN");
        Coche bmw1 = new Coche("BMW","i3","8465MQQ");
        Coche bmw2 = new Coche("BMW","i3","8464MQQ");
        Coche bmw3 = new Coche("BMW","i3","8463MQQ");
        Coche bmw4 = new Coche("BMW","i3","8462MQQ");

        Secretario juan= new Secretario("Juan","Ymedio","9874A","sa casa","9877",
                LocalDate.of(2000,1,31),32000,"A2","9877");

        Vendedor pepe= new Vendedor("Pepe","Sáez","1234Q","su casa","9999",
                LocalDate.of(2015,12,1),30000.0,ibiza,
                "levante",10.0,"666555");

        JefeZona lucia = new JefeZona("Lucía", "Torán","8888Z","casita","8878",
                LocalDate.of(2004,9,7),51555,"2A",
                cupra,juan,new Vendedor[]{pepe});

        Vendedor carmen= new Vendedor("Carmen","Hervas","1235R","sucasa","9998",
                LocalDate.of(2005,11,1),51000.0,bmw1,
                "norte",15.0,"666554");

        Vendedor antonio= new Vendedor("Antonio","Hervas","1235R","sucasa","9997",
                LocalDate.of(2025,1,1),30000.0,bmw2,
                "norte",15.0,"666554");

        Vendedor maria= new Vendedor("Maria","Hervas","1236T","sucasa","9996",
                LocalDate.of(2008,10,15),35000.0,bmw3,
                "centro",12.5,"666553");

        Vendedor blanca= new Vendedor("Blanca","Hervas","1237U","sucasa","9995",
                LocalDate.of(2018,9,5),39000.0,bmw4,
                "poniente",12.5,"666552");


        pepe.addCliente("alejandro");
        pepe.addCliente("bruno");
        pepe.addCliente("carlos");
        pepe.addCliente("carlos");
        pepe.addCliente("damian");
        pepe.addCliente("enrique");
        pepe.addCliente("francisco");
        pepe.removeCliente("bruno");
        pepe.removeCliente("francisco");
        pepe.removeCliente("alejandro");
        pepe.cambiarSupervisor(carmen);
        pepe.cambiarSupervisor(juan);
        juan.cambiarSupervisor(lucia);
        juan.cambiarSupervisor(carmen);

        carmen.cambiarSupervisor(lucia);
        lucia.cambiarSupervisor(lucia);
        antonio.cambiarSupervisor(lucia);
        maria.cambiarSupervisor(carmen);
        maria.cambiarSupervisor(blanca);

        lucia.addVendedor(pepe);
        lucia.addVendedor(carmen);
        lucia.addVendedor(antonio);
        lucia.addVendedor(maria);
        lucia.addVendedor(blanca);
        lucia.removeVendedor(pepe);

        carmen.incrementarSalario();
        juan.incrementarSalario();

        System.out.println(juan);
        System.out.println(pepe);
        System.out.println(lucia);
        System.out.println(carmen);



    }
}
