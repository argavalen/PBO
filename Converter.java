public class Converter {
   
    public static double WattToDbm(double a) {
        return 10 * Math.log10(a / 0.001);
    }
    
    public static double WattToDbw(double a) {
        return 10 * Math.log10(a);
    }
    
    public static double WattToMWatt(double a) {
        return a * 1000;
    }
    
    public static double MWattToDbm(double a) {
        return 10.0 * Math.log10(a);
    }
    
    public static double MWattToDbw(double a) {
        return 10 * Math.log10(a / 1000);
    }
    
    public static double MWattToWatt(double a) {
        return a / 1000;
    }
    
    public static double DbwToDbm(double a) {
        return a + 30;
    }
    
    public static double DbwToWatt(double a) {
        return Math.pow(10, a / 10);
    }
    
    public static double DbwToMWatt(double a) {
        return Math.pow(10, (a + 30) / 10);
    }
    
    public static double DbmToWatt(double a) {
        return Math.pow(10, a / 10) * 0.001;
    }
    
    public static double DbmToMWatt(double a) {
        return Math.pow(10, a / 10);
    }
    
    public static double DbmToDbw(double a) {
        return a - 30;
    }
}
