import java.util.List;
import java.util.ArrayList;
public class List_Cities {
    public static void main(String[] args) {
        List <String> listOfCities = new ArrayList<>();
        listOfCities.add("Ujjain");
        listOfCities.add("Indore");
        listOfCities.add("Jaipur");
        listOfCities.add("Udaipur");
        listOfCities.add("Goa");
        listOfCities.add("Pune");
        System.out.println(listOfCities);
        System.out.println("Size is " + listOfCities.size());
        listOfCities.addFirst("Mumbai");
        System.out.println(listOfCities);
        // listOfCities.clear();
        // System.out.println(listOfCities);
        for(String city : listOfCities){
            System.err.println(city);
        }


    }
    
}
