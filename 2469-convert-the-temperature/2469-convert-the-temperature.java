class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;

        double fahrenheit = celsius *1.80 + 32.00;

        return new double []{kelvin, fahrenheit};

    }

    public static void main (String[] args) {
        Solution sol = new Solution();

        double[] result1 = sol.convertTemperature(36.50);
        System.out.printf("Kelvin: %.5f, Fahrenheit: %.5f%n",  
        result1[0],result1[1]);

        double[] result2 = sol.convertTemperature(122.11);
        System.out.printf("Kelvin: %.5f, Fahrenheit: %.5f%n",  
        result2[0],result2[1]);

    }
}