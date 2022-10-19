public class CtoFTableDisplay {
    public static void main(String[] args) {
        double celTemp = 0;
        double fahTemp = 0;
        String CelHeader = "Celsius Temp";
        String FahHeader = "Fahrenheit Temp";
        System.out.printf("%10s    %10s\n", CelHeader, FahHeader);
        for (celTemp = -100; celTemp <=100; celTemp++){
            System.out.printf("%.2f         %.2f\n", celTemp, tempChart(celTemp));
        }
    }

    /**
     *
     * @param celTemp to fahTemp
     * @return conversion table
     */
    private static double tempChart (double celTemp){
        double fahTemp = (celTemp * 1.8) + 32;
        return fahTemp;
    }
}
