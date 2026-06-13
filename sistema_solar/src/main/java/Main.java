import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //Instanciar planetas
        Planeta mercurio = new PlanetasSistemaSolar("Mercurio", 4.879, 57.9, 0,5.43,3.70,false);
        Planeta venus = new PlanetasSistemaSolar("Venus", 12.104, 108.2, 0,5.24,8.87, false);
        // Jupiter, Saturno, Neptuno y Urano
        Planeta jupiter = new PlanetasSistemaSolar("Jupiter", 69.911, 778.5,95, 1.33, 24.79, true);
        Planeta saturno = new PlanetasSistemaSolar("Saturno", 58.232, 1434, 146, 0.69, 10.44, true);
        Planeta neptuno = new PlanetasSistemaSolar("Neptuno", 24.622, 4495, 16, 1.64, 11.15, true);
        Planeta urano = new PlanetasSistemaSolar("Urano", 25.362, 2871, 28, 1.27, 8.69, true);

        //Crear lista de planetas
        List<Planeta> planetas = new ArrayList<>();
        planetas.add(mercurio);
        planetas.add(venus);
        planetas.add(jupiter);
        planetas.add(saturno);
        planetas.add(neptuno);
        planetas.add(urano);

        Random random = new Random();
        //Imprimir los detalles de los planetas
        for (int i=0; i<planetas.size(); i++){
            Planeta planeta = planetas.get(i);
            System.out.println(planetas.get(i).toString());

            Planeta otroPlaneta = planetas.get((random.nextInt(planetas.toArray().length)));

            System.out.println("Calculo del periodo orbital: " + planeta.calcularAnio() + " años en la tierra");
            System.out.println("Velocidad Orbital : "+ planeta.calcularVelocidadOrbital() +"k/s");
            System.out.println("Tabla significados para las comparaciones: \n 1 = mayor \n 0 = Son iguales \n -1 = es mas pequeño");
            System.out.println("Comparacion de tamaño de "+ planeta.getNombre()+ " con "+ otroPlaneta.getNombre());
            System.out.println("Comparacion por tamaño: " + planeta.compararPorTamano(otroPlaneta));
            System.out.println("Comparacion por Distancia: "+ planeta.compararPorDistancia(otroPlaneta));
            System.out.println("Comparacion por Gravedad: "+ planeta.compararPorGravedad(otroPlaneta));
            System.out.println("Comparacion por Densidad: "+ planeta.compararPorDensidad(otroPlaneta));
            System.out.println("\n");
        }

    }
}