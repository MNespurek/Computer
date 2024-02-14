package com.engeto.pruduct;

import java.util.ArrayList;
import java.util.List;

public class ComputerManager {
    private List<Computer> computers;

    ComputerManager(List<Computer> computers) {
        this.computers = new ArrayList<>(computers);
    }
    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public List<Computer> getComputers() {
        return new ArrayList<>(computers);
    }
}
