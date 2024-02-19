package com.tokio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Personas> lista = new ArrayList<>();
        lista.add(new Personas("Pedro", "garcia", 29, "espana"));
        lista.add(new Personas("Diego", "perez", 32, "italia"));
        lista.add(new Personas("Maya", "sanchez", 2, "espana"));
        lista.add(new Personas("carlos", "ruiz", 29, "francia"));
        lista.add(new Personas("luis", "lopez", 52, "ecuador"));
        lista.add(new Personas("May", "garcia", 1, "espana"));


        Comparator<Personas> personas = (Personas o1, Personas o2) -> o1.getNombre().compareTo(o2.getNombre());
        lista.stream()
                .filter(n->n.getEdad()>15);


    }
}
