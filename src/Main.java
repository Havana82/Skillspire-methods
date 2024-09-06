
public class Main {
    public static void main(String[] args) {

        System.out.println(calculateCrimeRisk(20));
        System.out.println(calculateEarthquakeRisk(30));
        System.out.println(calculateFloodRisk(40));
        System.out.println(totalCalculatedRisk());

    }

    public static int calculateCrimeRisk(int risk){
       return risk;
    }
    public static int calculateEarthquakeRisk(int risk){
        return risk;
    }
    public static int calculateFloodRisk(int risk){
       return risk;
    }
    public static int totalCalculatedRisk(){

        return ( calculateCrimeRisk(20) + calculateEarthquakeRisk(30) + calculateFloodRisk(40) );
    }
}

