package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class FinnishParties extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // create the x and y axes that the chart is going to use
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);

        Map<String, Map<Integer, Double>> values = readFile();

        values.keySet().stream().forEach(party -> {
            XYChart.Series data = new XYChart.Series();
            data.setName(party);

            values.get(party).entrySet().stream().forEach(pair -> {
                data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });

            // and add the data set to the chart
            lineChart.getData().add(data);
        });

        // display the line chart
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }

    public Map<String, Map<Integer, Double>> readFile() throws IOException{
        ArrayList<String> lines = new ArrayList<>();

        Map<String, Map<Integer, Double>> allData = new HashMap<>();

        try (Scanner scanner = new Scanner(Paths.get("partiesdata.tsv"))) {
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println("ERROR " + e.getMessage());
        }

        String[] years = lines.get(0).split("\t");
        lines.remove(0);
        for (String line : lines) {
            Map<Integer, Double> data = new HashMap<>();
            String[] parts = line.split("\t");

            for (int i = 1; i < years.length; i++) {
                if (parts[i].equals("-")) {
                    continue;
                }
                data.put(Integer.valueOf(years[i]), Double.valueOf(parts[i]));
            }
            allData.put(parts[0], data);
        }
        return allData;
    }

    public static void main(String[] args) {
        launch(FinnishParties.class);
    }
}
