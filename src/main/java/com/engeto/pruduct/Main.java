package com.engeto.pruduct;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Dell", 1980, BigDecimal.valueOf(20000));
        Computer computer2 = new Computer("Dell", 2010, BigDecimal.valueOf(21000));
        Computer computer3 = new Computer("Mac", 2009, BigDecimal.valueOf(15000));
        List<Computer> otherList = new ArrayList<>();
        ComputerManager manager = new ComputerManager(otherList);
        manager.addComputer(computer1);
        manager.addComputer(computer2);
        manager.addComputer(computer3);
        System.out.println(manager.getComputers().size());
        for (Computer computer : manager.getComputers()) {
            System.out.println("Název PC: " +computer.getDescription()+ " rok: " +computer.getYearOfProduction()+ " cena: " +computer.getPrice()+ " Kč");
        }
        System.out.println("Řada computer seřazená dle ceny bez nového listu: \n");
        manager.getComputers().sort(Comparator.comparing(Computer::getPrice));
        manager.getComputers().forEach(System.out::println);

        List<Computer> priceSortedList = new ArrayList<>(manager.getComputers());
        System.out.println("Řada computer dle ceny včetně nového listu: \n");
        priceSortedList.sort(Comparator.comparing((Computer::getPrice)));
        priceSortedList.forEach(System.out::println);
        System.out.println("Řada computer reverzně dle datu výroby včetně nového listu: \n");
        priceSortedList.sort(Comparator.comparing(Computer::getYearOfProduction).reversed());
        priceSortedList.forEach(System.out::println);

    }


}
