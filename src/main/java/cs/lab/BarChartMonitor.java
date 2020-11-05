package cs.lab;

import cs.lab.Subject;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.awt.*;


public class BarChartMonitor{
    Subject subject;

    public void start(Stage stage) {
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
//        final BarChart<String,Number> bc =
//                new BarChart<String,Number>(xAxis,yAxis);
        //bc.setTitle("Country Summary");
        xAxis.setLabel("Country");
        yAxis.setLabel("Value");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("2003");
        series1.getData().add(new XYChart.Data("A", subject.getA()));
        series1.getData().add(new XYChart.Data("B", subject.getB()));
        series1.getData().add(new XYChart.Data("C", subject.getC()));
        series1.getData().add(new XYChart.Data("D", subject.getD()));

        //Scene scene  = new Scene(bc,800,600);
        //bc.getData().addAll(series1);
        //stage.setScene(scene);
        stage.show();
    }

}
