package design5;

import java.util.Random;

public class RuntimeTest {

   public static void main(String[] args) {
		int amount = 1000000;
		System.out.println("Performance Test for PointCPPolar:");
		long pointCPPolarConversionTime = testPointCPPolar(amount);
		System.out.println("PointCPPolar - Total Conversion Time: " + pointCPPolarConversionTime + " nanoseconds");
		System.out.println("Performance Test for PointCPCartesian:");
		long pointCPCartesianConversionTime = testPointCPCartesian(amount);
		System.out.println("PointCPCartesian - Total Conversion Time: " + pointCPCartesianConversionTime + " nanoseconds");
		System.out.println("\nPerformance Test for PointCP2:");
		long pointCP2ConversionTime = testPointCP2(amount);
		System.out.println("PointCP2 - Total Conversion Time: " + pointCP2ConversionTime + " nanoseconds");
		System.out.println("\nPerformance Test for PointCP3:");
		long pointCP3ConversionTime = testPointCP3(amount);
		System.out.println("PointCP3 - Total Conversion Time: " + pointCP3ConversionTime + " nanoseconds");
	}

	private static long testPointCPPolar(int amount) {
		long totalConversionTime = 0;
		for (int i = 0; i < amount; i++) {
			PointCP point = getRandomCPInstance('P');
			long startTime = System.currentTimeMillis();;
			point.getRho();
			long endTime = System.currentTimeMillis();;
			totalConversionTime += (endTime - startTime);
		}
		return totalConversionTime;
	}

   private static long testPointCPCartesian(int amount) {
		long totalConversionTime = 0;
		for (int i = 0; i < amount; i++) {
			PointCP point = getRandomCPInstance('C');
			long startTime = System.currentTimeMillis();
			point.getRho();
			long endTime = System.currentTimeMillis();
			totalConversionTime += (endTime - startTime);
		}
		return totalConversionTime;
	}

	private static long testPointCP2(int amount) {
		long totalConversionTime = 0;
		for (int i = 0; i < amount; i++) {
			PointCP2 point = getRandomCP2Instance();
			long startTime = System.currentTimeMillis();
			point.getRho();
			long endTime = System.currentTimeMillis();
			totalConversionTime += (endTime - startTime);
		}
		return totalConversionTime;
	}

	private static long testPointCP3(int amount) {
		long totalConversionTime = 0;
		for (int i = 0; i < amount; i++) {
			PointCP3 point = getRandomCP3Instance();
			long startTime = System.currentTimeMillis();
			point.getRho();
			long endTime = System.currentTimeMillis();
			totalConversionTime += (endTime - startTime);
		}
		return totalConversionTime;
	}

	private static PointCP getRandomCPInstance(char type) {
		Random rand = new Random();
		return new PointCP(type, rand.nextDouble()*100, rand.nextDouble() * 100);
	}
	private static PointCP2 getRandomCP2Instance() {
		Random rand = new Random();
		return new PointCP2(rand.nextDouble() * 100, rand.nextDouble() * 360);
	}
	private static PointCP3 getRandomCP3Instance() {
		Random rand = new Random();
		return new PointCP3(rand.nextDouble() * 100, rand.nextDouble() * 100);
	}
}