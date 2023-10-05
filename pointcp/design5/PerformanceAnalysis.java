package design5;

import java.util.Random;
import java.util.Arrays;

public class PerformanceAnalysis {

    private static PointCP getRandomCPCartesianInstance() {
        Random rand = new Random();
        double x = rand.nextDouble() * 100;
        double y = rand.nextDouble() * 100;
        return new PointCP('C', x, y);
    }

    private static PointCP getRandomCPPolarInstance() {
        Random rand = new Random();
        double x = rand.nextDouble() * 100;
        double y = rand.nextDouble() * 100;
        return new PointCP('P', x, y);
    }

    private static PointCP2 getRandomCP2Instance() {
        Random rand = new Random();
        double rho = rand.nextDouble() * 100;
        double theta = rand.nextDouble() * 360;
        return new PointCP2(rho, theta);
    }

    private static PointCP3 getRandomCP3Instance() {
        Random rand = new Random();
        double x = rand.nextDouble() * 100;
        double y = rand.nextDouble() * 100;
        return new PointCP3(x, y);
    }

    private static void testCPCartesianMethods(PointCP point, int iterations) {
        long[] executionTimes = new long[iterations];

        for (int i = 0; i < iterations; i++) {
            long startTime = System.nanoTime();
            point.convertStorageToCartesian();
            point.convertStorageToPolar(); 
            point.convertStorageToCartesian();
            point.getRho();
            point.getX();
            point.getY();
            point.convertStorageToPolar(); 
            point.getX();
            point.getY();
           point.getTheta();
            point.getRho(); 
            point.getTheta();
            point.getDistance(point);
            point.rotatePoint(50);
            long endTime = System.nanoTime();
            executionTimes[i] = endTime - startTime;
        }

        Arrays.sort(executionTimes);
        long medianTime = executionTimes[iterations / 2];
        long minTime = executionTimes[0];
        long maxTime = executionTimes[iterations - 1];

        System.out.println("Testing PointCPCartesian:");
        System.out.println("Execution Time (median): " + (medianTime) + " milliseconds");
        System.out.println("Execution Time (min): " + (minTime) + " milliseconds");
        System.out.println("Execution Time (max): " + (maxTime) + " milliseconds");
        System.out.println();
    }

    private static void testCPPolarMethods(PointCP point, int iterations) {
        long[] executionTimes = new long[iterations];

        for (int i = 0; i < iterations; i++) {
            long startTime = System.nanoTime();
            point.convertStorageToCartesian();
            point.convertStorageToPolar(); 
            point.convertStorageToCartesian();
            point.getRho();
            point.getX();
            point.getY();
            point.convertStorageToPolar(); 
            point.getX();
            point.getY();
            point.getTheta();
            point.getRho(); 
            point.getTheta();
            point.getDistance(point);
            point.rotatePoint(50);
            long endTime = System.nanoTime();
            executionTimes[i] = endTime - startTime;
        }

        Arrays.sort(executionTimes);
        long medianTime = executionTimes[iterations / 2];
        long minTime = executionTimes[0];
        long maxTime = executionTimes[iterations - 1];

        System.out.println("Testing PointCPPolar:");
        System.out.println("Execution Time (median): " + (medianTime) + " milliseconds");
        System.out.println("Execution Time (min): " + (minTime) + " milliseconds");
        System.out.println("Execution Time (max): " + (maxTime) + " milliseconds");
        System.out.println();
    }

    private static void testCP2Methods(PointCP2 point, int iterations) {
        long[] executionTimes = new long[iterations];

        for (int i = 0; i < iterations; i++) {
            long startTime = System.nanoTime();
            point.convertStorageToCartesian();
            point.convertStorageToPolar(); 
            point.convertStorageToCartesian();
            point.convertStorageToPolar(); 
            point.getX();
            point.getY();
            point.getTheta();
            point.getRho();
            point.getX();
            point.getY();
            point.getTheta();
            point.getRho(); 
            point.getDistance(point);
            point.rotatePoint(50);
            long endTime = System.nanoTime();
            executionTimes[i] = endTime - startTime;
        }

        Arrays.sort(executionTimes);
        long medianTime = executionTimes[iterations / 2];
        long minTime = executionTimes[0];
        long maxTime = executionTimes[iterations - 1];

        System.out.println("Testing PointCP2:");
        System.out.println("Execution Time (median): " + (medianTime) + " milliseconds");
        System.out.println("Execution Time (min): " + (minTime) + " milliseconds");
        System.out.println("Execution Time (max): " + (maxTime)+ " milliseconds");
        System.out.println();
    }

    private static void testCP3Methods(PointCP3 point, int iterations) {
        long[] executionTimes = new long[iterations];

        for (int i = 0; i < iterations; i++) {
            long startTime = System.nanoTime();
            point.convertStorageToCartesian();
            point.convertStorageToPolar(); 
            point.convertStorageToCartesian();
            point.convertStorageToPolar(); 
            point.getX();
            point.getY();
            point.getTheta();
            point.getRho();
            point.getX();
            point.getY();
            point.getTheta();
            point.getRho(); 
            point.getDistance(point);
            point.rotatePoint(50);
            long endTime = System.nanoTime();
            executionTimes[i] = endTime - startTime;
        }

        Arrays.sort(executionTimes);
        long medianTime = executionTimes[iterations / 2];
        long minTime = executionTimes[0];
        long maxTime = executionTimes[iterations - 1];

        System.out.println("Testing PointCP3:");
        System.out.println("Execution Time (median): " + (medianTime) + " milliseconds");
        System.out.println("Execution Time (min): " + (minTime) + " milliseconds");
        System.out.println("Execution Time (max): " + (maxTime)+ " milliseconds");
        System.out.println();
    }

    public static void main(String[] args) {
        int iterations = 100000000;

        System.out.println("Performance Analysis:");

        PointCP pointCPCartesian = getRandomCPCartesianInstance();
        testCPCartesianMethods(pointCPCartesian, iterations);

        PointCP pointCPPolar = getRandomCPPolarInstance();
        testCPPolarMethods(pointCPPolar, iterations);

        PointCP2 pointCP2 = getRandomCP2Instance();
        testCP2Methods(pointCP2, iterations);

        PointCP3 pointCP3 = getRandomCP3Instance();
        testCP3Methods(pointCP3, iterations);
    }
}
