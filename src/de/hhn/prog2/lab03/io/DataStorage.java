package de.hhn.prog2.lab03.io;

import de.hhn.prog2.lab03.model.Order;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class DataStorage {

    private BufferedReader fReader = null;

    /**
     * Uses character stream to write to csv file, after an order is saved.
     * Each pizza is written in a seperated line in the file.
     *
     * @param order The pizza order to be written in a file
     */
    public void writeOrderCSV(Order order) {
        try (BufferedWriter fWriter = new BufferedWriter(new FileWriter("Bestellung.txt" ))) {
            fWriter.append(order.getPizzas().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * Reads from CSV file and returns the order for further processing.
     *
     *
     *
     * @return The pizza order to be processed
     */
    public Order readOrderCSV() throws IOException {
        fReader = new BufferedReader(new FileReader("Bestellung.txt", StandardCharsets.UTF_8));

        String test;

        try {
            while ((test = fReader.readLine()) != null) {
                System.out.println(test);
            }
        } finally {
            if (fReader != null) {
                fReader.close();
            }
        }
        return null;
    }
}
