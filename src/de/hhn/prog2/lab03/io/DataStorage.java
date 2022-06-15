package de.hhn.prog2.lab03.io;

import de.hhn.prog2.lab03.model.Order;

import java.io.*;
import java.util.Arrays;

public class DataStorage {

    private BufferedReader fReader = null;

    /**
     * Uses character stream to write to csv file, after an order is saved.
     * Each pizza is written in a seperated line in the file.
     *
     * @param order The pizza order to be written in a file
     */
    public void writeOrderCSV(Order order) {
        try (BufferedWriter fWriter = new BufferedWriter(new FileWriter("Bestellung.txt"))) {
            fWriter.write(order.getPizzas().toString());
            fWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * Reads from CSV file and returns the order for further processing.
     *
     * @return The pizza order to be processed
     */
    public Order readOrderCSV() throws IOException {

        String reader;

        try (BufferedReader bReader = new BufferedReader(new FileReader("Bestellung.txt"))) {
            reader = bReader.readLine();
            while (reader != null) {
                reader = reader + Arrays.toString(reader.split(","));
            }
        }
        return null;
    }
}
