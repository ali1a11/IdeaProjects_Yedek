
package com.example.demo;

        import javafx.application.Application;
        import javafx.scene.Scene;
        import javafx.scene.chart.LineChart;
        import javafx.scene.chart.NumberAxis;
        import javafx.scene.chart.XYChart;
        import javafx.stage.Stage;

        import java.io.IOException;

        import static javafx.application.Application.launch;

public class ShanghaiApplication extends Application {
    @Override
    public void start(Stage stage) {
        // create the x and y axes that the chart is going to use
        NumberAxis xAxis= new NumberAxis(2006, 2018, 2);
        //NumberAxis xAxis = new NumberAxis();
        NumberAxis yAxis = new NumberAxis(0, 100, 10);

        // set the titles for the axes
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");

        // create the line chart. The values of the chart are given as numbers
        // and it uses the axes we created earlier
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai ranking");
        //lineChart.setLegendVisible(false);

        // create the data set that is going to be added to the line chart
        XYChart.Series rankingData = new XYChart.Series();
        // rankingData.setName("****");
        // and single points into the data set

        rankingData.getData().add(new XYChart.Data(2007, 73));
        rankingData.getData().add(new XYChart.Data(2008, 68));
        rankingData.getData().add(new XYChart.Data(2009, 72));
        rankingData.getData().add(new XYChart.Data(2010, 72));
        rankingData.getData().add(new XYChart.Data(2011, 74));
        rankingData.getData().add(new XYChart.Data(2012, 73));
        rankingData.getData().add(new XYChart.Data(2013, 76));
        rankingData.getData().add(new XYChart.Data(2014, 73));
        rankingData.getData().add(new XYChart.Data(2015, 67));
        rankingData.getData().add(new XYChart.Data(2016, 56));
        rankingData.getData().add(new XYChart.Data(2017, 56));

        // add the data set to the line chart
        lineChart.getData().add(rankingData);

        // display the line chart
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }
}

/* from mooc
package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

    @Override
    public void start(Stage stage) {
        NumberAxis xAxis = new NumberAxis(2006, 2018, 1);
        NumberAxis yAxis = new NumberAxis(0, 100, 5);
        xAxis.setLabel("Year");

        yAxis.setLabel("Ranking");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai ranking");
        lineChart.setLegendVisible(false);

        XYChart.Series position = new XYChart.Series();
        position.getData().add(new XYChart.Data(2007, 73));
        position.getData().add(new XYChart.Data(2008, 68));
        position.getData().add(new XYChart.Data(2009, 72));
        position.getData().add(new XYChart.Data(2010, 72));
        position.getData().add(new XYChart.Data(2011, 74));
        position.getData().add(new XYChart.Data(2012, 73));
        position.getData().add(new XYChart.Data(2013, 76));
        position.getData().add(new XYChart.Data(2014, 73));
        position.getData().add(new XYChart.Data(2015, 67));
        position.getData().add(new XYChart.Data(2016, 56));
        position.getData().add(new XYChart.Data(2017, 56));

        lineChart.getData().add(position);

        Scene view = new Scene(lineChart, 400, 300);
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
        System.out.println("Hello world!");
    }

}
 */

