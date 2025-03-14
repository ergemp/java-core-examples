package org.ergemp.jFreeChartExamples;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.time.Month;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;

import javax.swing.*;

public class JFreeChartExample {
    public static void main(String[] args) {

        //
        // ref: https://www.baeldung.com/jfreechart-visualize-data
        // ref: https://www.codejava.net/java-se/graphics/using-jfreechart-to-draw-line-chart-with-categorydataset
        //

        //
        // Line Chart
        //
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(200, "Sales", "January");
        dataset.addValue(150, "Sales", "February");
        dataset.addValue(180, "Sales", "March");
        dataset.addValue(260, "Sales", "April");
        dataset.addValue(300, "Sales", "May");

        JFreeChart lineChart = ChartFactory.createLineChart(
                "Monthly Sales",
                "Month",
                "Sales",
                dataset);

        JFreeChart barChart = ChartFactory.createBarChart(
                "Monthly Sales",
                "Month",
                "Sales",
                dataset);

        ChartPanel chartPanel = new ChartPanel(barChart);
        JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setContentPane(chartPanel);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


        /*
        ChartPanel chartPanel = new ChartPanel(chart);
        JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setContentPane(chartPanel);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
q       */

        //
        // Pie Chart
        //

        DefaultPieDataset<String> datasetPie = new DefaultPieDataset<>();
        datasetPie.setValue("January", 200);
        datasetPie.setValue("February", 150);
        datasetPie.setValue("March", 180);

        JFreeChart pieChart = ChartFactory.createPieChart(
                "Monthly Sales",
                datasetPie,
                true,    // include legend
                true,    // generate tooltips
                false);  // no URLs

        ChartPanel pieChartPanel = new ChartPanel(pieChart);
        JFrame pieFrame = new JFrame();
        pieFrame.setSize(800, 600);
        pieFrame.setContentPane(pieChartPanel);
        pieFrame.setLocationRelativeTo(null);
        pieFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pieFrame.setVisible(true);


        //
        // Time Series Chart
        //
        TimeSeries series = new TimeSeries("Monthly Sales");
        series.add(new Month(1, 2024), 200);
        series.add(new Month(2, 2024), 150);
        series.add(new Month(3, 2024), 180);

        TimeSeriesCollection dataset2 = new TimeSeriesCollection();
        dataset2.addSeries(series);

        JFreeChart chart2 = ChartFactory.createTimeSeriesChart(
                "Monthly Sales",
                "Date",
                "Sales",
                dataset2,
                true,    // legend
                false,   // tooltips
                false);  // no URLs

        /*
        ChartPanel chartPanel2 = new ChartPanel(chart2);
        JFrame frame2 = new JFrame();
        frame2.setSize(800, 600);
        frame2.setContentPane(chartPanel2);
        frame2.setLocationRelativeTo(null);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);
        */

        //
        // Chart Combination
        //

        DefaultCategoryDataset lineDataset = new DefaultCategoryDataset();
        lineDataset.addValue(200, "Sales", "January");
        lineDataset.addValue(150, "Sales", "February");
        lineDataset.addValue(180, "Sales", "March");

        DefaultCategoryDataset barDataset = new DefaultCategoryDataset();
        barDataset.addValue(400, "Profit", "January");
        barDataset.addValue(300, "Profit", "February");
        barDataset.addValue(250, "Profit", "March");


        CategoryPlot plot = new CategoryPlot();
        plot.setDataset(0, lineDataset);
        plot.setRenderer(0, new LineAndShapeRenderer());

        plot.setDataset(1, barDataset);
        plot.setRenderer(1, new BarRenderer());

        plot.setDomainAxis(new CategoryAxis("Month"));
        plot.setRangeAxis(new NumberAxis("Value"));

        plot.setOrientation(PlotOrientation.VERTICAL);
        plot.setRangeGridlinesVisible(true);
        plot.setDomainGridlinesVisible(true);

        JFreeChart combinedChart = new JFreeChart(
                "Monthly Sales and Profit",
                null,  // null means to use default font
                plot,  // combination chart as CategoryPlot
                true); // legend


        ChartPanel combinedChartPanel = new ChartPanel(combinedChart);
        JFrame frame2 = new JFrame();
        frame2.setSize(800, 600);
        frame2.setContentPane(combinedChartPanel);
        frame2.setLocationRelativeTo(null);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);


    }
}
