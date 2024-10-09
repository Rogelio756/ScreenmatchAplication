package com.aluracursos.screenmatch.Principal;

import java.util.Arrays;
import java.util.List;

public class EjemploStreams {
    public void muestraEjemplo(){
        List<String> nombres = Arrays.asList("Brenda","Luis","Maria","Eric","Genesys");

        nombres.stream()
                .sorted()
                .limit(4)              // cantidad de los datos
                .filter(n ->n.startsWith("L")) //nombre con esa inicial
                .map(n->n.toUpperCase())       //nombre en mayusculas
                .forEach(System.out::println);
    }
}
