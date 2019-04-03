import java.io.FileNotFoundException;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        VolcanoAnalyzer volcanoAnalyzer = null;
        try {
            volcanoAnalyzer = new VolcanoAnalyzer();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



            volcanoAnalyzer.displayVolcanoesIndex7();
        volcanoAnalyzer.displayHighestNumberOfDeaths();

        volcanoAnalyzer.displayMudflowPercentage();

    System.out.println(volcanoAnalyzer.displayMostCommonType());
    }
}
