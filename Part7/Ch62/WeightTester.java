public class WeightTester{
    public static void main ( String[] args ){
        /*
        int[] values = { 98,  99,  98,  99, 100, 101, 102, 100, 104, 105,
            105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
            105, 105, 104, 104, 103, 102, 102, 101, 100, 102};
        */
        int[] values = {1, 3, 101, 103};
        Weight june = new Weight( values );

        int average = june.average();
        int firstHalfAverage;
        if(values.length % 2 == 1){
            firstHalfAverage = june.subAverage(0, values.length/2);
        } else { 
            firstHalfAverage = june.subAverage(0, values.length/2-1);
        }

        int secondHalfAverage = june.subAverage(values.length/2, values.length-1);

        System.out.println("To String:" + june );
        System.out.println("Average: " + average);
        System.out.println("First 2 average: " + june.subAverage(0, 1));
        System.out.println("First half of month average: " + firstHalfAverage);
        System.out.println("Second half of month average: " + secondHalfAverage);
        System.out.println("Difference between last 2 averages: " + (Math.abs( firstHalfAverage - secondHalfAverage)));

    }
}      