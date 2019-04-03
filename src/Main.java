import java.io.FileNotFoundException;
import java.util.Arrays;
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

        System.out.println("Country total Eruptions for Indonesia  " + volcanoAnalyzer.countryTotalEruptions("Indonesia"));
        System.out.println( Arrays.toString(volcanoAnalyzer.typesOfVolcanoes()));
    }
}
