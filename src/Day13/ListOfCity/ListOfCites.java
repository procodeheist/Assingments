package Day13.ListOfCity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfCites {
    public static void main(String[] args) {
        //List<String> cityList = new ArrayList<>();
        List<String> cityList = Arrays.asList("Chennai","Mumbai","Kerala","Kolkatta","Delhi");

        List<String> sortedCity = cityList.stream().sorted(String::compareTo).collect(Collectors.toList());

        System.out.println(sortedCity);
    }
}
