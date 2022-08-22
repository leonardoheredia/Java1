import org.jfree.chart.ChartColor;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.StandardTickUnitSource;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Exemplo1 {

    public static void main(String[] args)
    {
        Funcoes f = new Funcoes();

        XYSeries xy;
        xy = new XYSeries("none");

        for(int n=1; n<10_000; n+=50){
            int x = n;
            int y = f.fb(n);
            System.out.println(x + " - " + y);
            xy.add(x, y);
        }

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(xy);
        JFreeChart chart;
        chart = ChartFactory.createXYLineChart("Exemplo Simples", "", "",
                dataset, PlotOrientation.VERTICAL,
                true, true, true);

        XYPlot plot = chart.getXYPlot();
        plot.setBackgroundPaint(ChartColor.WHITE);

        NumberAxis eixoX = new NumberAxis("Tamanho N");
        NumberAxis eixoY = new NumberAxis("Tempo (Operações)");
        //LogarithmicAxis yAxis = new LogarithmicAxis("Y");
        //yAxis.setAllowNegativesFlag(true);
        //plot.setRangeAxis(0, yAxis);
        plot.setDomainAxis(eixoX);
        plot.setRangeAxis(eixoY);

        ChartFrame frame1 = new ChartFrame("", chart);
        frame1.setVisible(true);
        frame1.setSize(1024, 1024);

    }

}
