
public class Main {
    public static void main(String[] args) {

        System.out.println(calculateCrimeRisk());
        System.out.println(calculateEarthquakeRisk());
        System.out.println(calculateFloodRisk());
        System.out.println(totalCalculatedRisk());

    }

    public static int calculateCrimeRisk(){
       return 20;
    }
    public static int calculateEarthquakeRisk(){
        return 30;
    }
    public static int calculateFloodRisk(){
       return 40;
    }
    public static int totalCalculatedRisk(){

        return ( calculateCrimeRisk() + calculateEarthquakeRisk() + calculateFloodRisk() );
    }
}

