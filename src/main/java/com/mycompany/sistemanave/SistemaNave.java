/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.sistemanave;

import com.mycompany.sistemanave.dao.BaseNavesDao;
import com.mycompany.sistemanave.dto.NaveDTO;
import com.mycompany.sistemanave.models.NaveEspacial;
import com.mycompany.sistemanave.models.NaveLanzadera;
import com.mycompany.sistemanave.models.NaveNoTripulada;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author juans
 */
public class SistemaNave {

    List<NaveLanzadera> listaNaveLanzadera;
    List<NaveNoTripulada> listaNaveNoTripulada;
    List<NaveEspacial> listaNaveEspacial;
    List<NaveDTO> listaNaves;

    public SistemaNave() {

        listaNaveLanzadera = new ArrayList<>();
        listaNaveNoTripulada = new ArrayList<>();
        listaNaveEspacial = new ArrayList<>();
        listaNaves = new ArrayList<>();
        menu();
    }

    private void menu() {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("***Sistema de naves espaciales***");
            System.out.println("Porfavor digite una opcion: ");
            System.out.println("\t1. Para crear. ");
            System.out.println("\t2. Para clasificar por tipos de naves. ");
            System.out.println("\t3. Para realizar una Consulta por caracteristicas. ");
            System.out.println("\t4. Eliminar tipos de naves. ");
            System.out.println("Pulse cualquier tecla para salir. ");
            opcion = Integer.parseInt(sc.nextLine());

            if (opcion == 1 || opcion == 2 || opcion == 4) {
                int tipo;
                System.out.println("Ingrese el tipo de nave ");
                System.out.println("\t1. Nave Lanzadera. ");
                System.out.println("\t2. Nave Tripulada. ");
                System.out.println("\t3. Nave No Tripulada ");
                tipo = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1 -> crearNave(tipo);
                    case 2 -> clasificar(tipo);
                    default -> eliminarTipo(tipo);
                }

            } else if (opcion == 3) {
                buscar();
            }
        } while (opcion > 0 && opcion < 5);

    }

    private void crearNave(int tipo) {
        switch (tipo) {
            case 1 -> {
                System.out.println("***Naves de tipo lanzadera creadas***");
                NaveLanzadera saturno = new NaveLanzadera("Nave Lanzadera", "Saturno V", 2900, "petroleo", 3500, 100, "32000×5", "Nave tripulada Apolo");
                NaveLanzadera delta = new NaveLanzadera("Nave Lanzadera", "Delta IV", 4213, "MMH", 4500, 178, "12000×5", "Suministros");
                NaveLanzadera proton = new NaveLanzadera("Nave Lanzadera", "Protón ", 3700, "petroleo", 4800, 94, "22000×5", "Satelite");
                listaNaveLanzadera.add(saturno);
                listaNaveLanzadera.add(delta);
                listaNaveLanzadera.add(proton);

                BaseNavesDao dao = new BaseNavesDao();
                dao.agregarLanzadera(saturno);
                dao.agregarLanzadera(delta);
                dao.agregarLanzadera(proton);

            }

            case 2 -> {

                System.out.println("***Naves de tipo tripulada creadas***");
                NaveEspacial Vostok = new NaveEspacial("Nave tripulada", "Vostok", 77, "Queroseno", "misiones lunares", 7);
                NaveEspacial Skylab = new NaveEspacial("Nave tripulada", "Skylab", 47, "Nitrogeno", "experimentación", 14);
                NaveEspacial Salyut = new NaveEspacial("Nave tripulada", "Salyut", 86, "tetróxido", "mantenimiento de satélites", 5);
                listaNaveEspacial.add(Vostok);
                listaNaveEspacial.add(Skylab);
                listaNaveEspacial.add(Salyut);

                BaseNavesDao dao = new BaseNavesDao();
                dao.agregarEspacial(Vostok);
                dao.agregarEspacial(Skylab);
                dao.agregarEspacial(Salyut);

            }

            case 3 -> {
                System.out.println("***Naves de tipo no tripulada o robotica creadas***");
                NaveNoTripulada cassini = new NaveNoTripulada("Nave No Tripulada", "Sonda Cassini-Huygens", 2563, "MMH y tetróxido de nitrógeno", 18000, 1);
                NaveNoTripulada Pionero = new NaveNoTripulada("Nave No Tripulada", "Pionero X", 2563, "MMH y tetróxido de nitrógeno", 18000, 1);
                NaveNoTripulada mariner = new NaveNoTripulada("Nave No Tripulada", "Mariner IV,", 1563, "tetróxido de nitrógeno", 1400, 0);
                listaNaveNoTripulada.add(cassini);
                listaNaveNoTripulada.add(Pionero);
                listaNaveNoTripulada.add(mariner);

                BaseNavesDao dao = new BaseNavesDao();
                dao.agregarNoTripulada(cassini);
                dao.agregarNoTripulada(Pionero);
                dao.agregarNoTripulada(mariner);

            }
        }
    }

    private void clasificar(int tipo) {
        switch (tipo) {
            case 1 -> {
                System.out.println("\t*** Naves Lanzaderas *** ");

                BaseNavesDao dao = new BaseNavesDao();
                listaNaves = dao.listar();

                System.out.print("Nombre\t");
                System.out.print("\tPeso");
                System.out.print("\tCombustible");

                for (NaveDTO nave : listaNaves) {
                    if (nave.getTipoNave().equalsIgnoreCase("Nave Lanzadera")) {
                        System.out.println("\n");
                        System.out.print(nave.getNombre());
                        System.out.print("\t" + nave.getPeso());
                        System.out.print("\t" + nave.getCombustible());
                    }

                }
                System.out.println("\n");

            }

            case 2 -> {

                System.out.println("\t*** Naves tipo tripulada *** ");

                BaseNavesDao dao = new BaseNavesDao();
                listaNaves = dao.listar();

                System.out.print("Nombre\t");
                System.out.print("\tPeso");
                System.out.print("\tCombustible");

                for (NaveDTO nave : listaNaves) {
                    if (nave.getTipoNave().equalsIgnoreCase("Nave tripulada")) {
                        System.out.println("\n");
                        System.out.print(nave.getNombre());
                        System.out.print("\t" + nave.getPeso());
                        System.out.print("\t" + nave.getCombustible());
                    }

                }
                System.out.println("\n");

            }

            case 3 -> {

                System.out.println("\t*** Nave No Tripulada *** ");

                BaseNavesDao dao = new BaseNavesDao();
                listaNaves = dao.listar();

                System.out.print("Nombre\t");
                System.out.print("\tPeso");
                System.out.print("\tCombustible");

                for (NaveDTO nave : listaNaves) {
                    if (nave.getTipoNave().equalsIgnoreCase("Nave No Tripulada")) {
                        System.out.println("\n");
                        System.out.print(nave.getNombre());
                        System.out.print("\t" + nave.getPeso());
                        System.out.print("\t" + nave.getCombustible());
                    }

                }
                System.out.println("\n");

            }

        }
    }

    private void buscar() {
        Scanner sc = new Scanner(System.in);
        BaseNavesDao dao = new BaseNavesDao();
        int opcion;
        String valor;
        System.out.println("Que tipo de busqueda desea realizar:");
        System.out.println("\t1. Simple. ");
        System.out.println("\t2. Avanzada.");
        opcion = Integer.parseInt(sc.nextLine());

        switch (opcion) {
            case 1 -> {

                listaNaves = dao.listar();
                System.out.println("***Listado de Naves***");

                System.out.print("Nombre\t");
                System.out.print("\tPeso");
                System.out.print("\tCombustible");

                for (NaveDTO nave : listaNaves) {
                    System.out.println("\n");
                    System.out.print(nave.getNombre());
                    System.out.print("\t" + nave.getPeso());
                    System.out.print("\t" + nave.getCombustible());
                }
                System.out.println("\n");
            }
            case 2 -> {

                System.out.println("Digite el argumento por el cual desea bucar: ");
                System.out.println("\t1. Nombre. ");
                System.out.println("\t2. Peso. ");
                System.out.println("\t3. Combustible. ");
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1 -> {
                        System.out.println("Digite el valor a buscar: ");
                        valor = sc.nextLine();
                        listaNaves = dao.buscarAvanzado("nombre", valor);

                        System.out.print("Nombre\t");
                        System.out.print("\tPeso");
                        System.out.print("\tCombustible");

                        for (NaveDTO nave : listaNaves) {
                            System.out.println("\n");
                            System.out.print(nave.getNombre());
                            System.out.print("\t" + nave.getPeso());
                            System.out.print("\t" + nave.getCombustible());
                        }
                        System.out.println("\n");
                    }
                    case 2 -> {
                        System.out.println("Digite el valor a buscar: ");
                        valor = sc.nextLine();
                        listaNaves = dao.buscarAvanzado("peso", valor);

                        System.out.print("Nombre\t");
                        System.out.print("\tPeso");
                        System.out.print("\tCombustible");

                        for (NaveDTO nave : listaNaves) {
                            System.out.println("\n");
                            System.out.print(nave.getNombre());
                            System.out.print("\t" + nave.getPeso());
                            System.out.print("\t" + nave.getCombustible());
                        }
                        System.out.println("\n");
                    }
                    case 3 -> {
                        System.out.println("Digite el valor a buscar: ");
                        valor = sc.nextLine();
                        listaNaves = dao.buscarAvanzado("combustible", valor);

                        System.out.print("Nombre\t");
                        System.out.print("\tPeso");
                        System.out.print("\tCombustible");

                        for (NaveDTO nave : listaNaves) {
                            System.out.println("\n");
                            System.out.print(nave.getNombre());
                            System.out.print("\t" + nave.getPeso());
                            System.out.print("\t" + nave.getCombustible());
                        }
                        System.out.println("\n");
                    }
                }

            }
        }

    }

    private void eliminarTipo(int tipo){
        BaseNavesDao dao = new BaseNavesDao();
        switch(tipo){
            case 1 -> {
                dao.eliminar("Nave Lanzadera");
            }
            case 2 -> {
                dao.eliminar("Nave tripulada");
            }
            case 3 -> {
                dao.eliminar("Nave No Tripulada");
            }
        }
    }
    
    public static void main(String[] args) {
        
        
        //Intancia un objeto de cada tipo de nave
        NaveEspacial predeterminada = new NaveEspacial("Nave tripulada", "Vostok", 77, "Queroseno", "misiones lunares", 7);
        NaveNoTripulada predeterminada1 = new NaveNoTripulada("Nave No Tripulada", "Sonda Cassini-Huygens", 2563, "MMH y tetróxido de nitrógeno", 18000, 1);
        NaveLanzadera predeterminada3 = new NaveLanzadera("Nave Lanzadera", "Saturno V", 2900, "petroleo", 3500, 100, "32000×5", "Nave tripulada Apolo");
        
        //Intancia un objeto de tipo dao para acceder a los metodos asociados a la base de datos
        BaseNavesDao dao = new BaseNavesDao();
        dao.agregarEspacial(predeterminada);
        dao.agregarNoTripulada(predeterminada1);
        dao.agregarLanzadera(predeterminada3);

        SistemaNave sistema = new SistemaNave();

    }
}
