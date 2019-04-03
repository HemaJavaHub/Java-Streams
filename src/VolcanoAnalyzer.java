import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class VolcanoAnalyzer {

    public List<Volcano> volcanoes;

    public VolcanoAnalyzer() throws FileNotFoundException {

        String path = new File("").getAbsolutePath();
        path+="/src/resources/volcanoes.json";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        volcanoes = new Gson().fromJson(bufferedReader, new TypeToken<ArrayList<Volcano>>() {
        }.getType());

    }

    public void displayVolcanoes(){
        volcanoes.forEach(volcano -> System.out.println(volcano.getName() + volcano.getVEI()));
    }


    /**
     * Volcanoes that erupted in 1970
     */
    public void displayVolcanoesErupted1970() {
            volcanoes.stream().filter(volcano -> (volcano.getYear() >= 1970 && volcano.getYear() < 1980)
            ).forEach(volcano -> System.out.println(volcano.getName()));
    }

    //Return an array of the names of volcanoes that had an eruption with a Volcanic Explosivity Index (VEI) of 7 or higher

    public void displayVolcanoesIndex7() {
        volcanoes.stream().filter(volcano -> (volcano.getVEI()>=7)
        ).forEach(volcano -> System.out.println(volcano.getName()));




    }


    //Return the eruption with the highest number of recorded deaths.


    public void displayHighestNumberOfDeaths() {

        String name = volcanoes.stream().max(Comparator.comparingInt(Volcano::getDEATHS)).get().getName();
        System.out.println(name);




    }

//Return the percentage of eruptions that caused mudflows (Agent_Code "M" for Mudflow).

    public void displayMudflowPercentage() {

       double mudflowCount =  volcanoes.stream().filter(volcano -> volcano.getAgent().equals("M")).count();
       double size = volcanoes.size();
       double average = mudflowCount / size;
       System.out.println("The average is " + average);
    }

    //Return the most common type of volcano in the set


}
