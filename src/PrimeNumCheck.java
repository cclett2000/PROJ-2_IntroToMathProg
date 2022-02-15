// Algorithm info: https://en.wikipedia.org/wiki/Primality_test
// Algorithm implementation: https://stackoverflow.com/questions/2385909/what-would-be-the-fastest-method-to-test-for-primality-in-java

import java.lang.Math;

public class PrimeNumCheck {
    boolean enableDebug = false;     // enable/disable debug info


    // method to call
    public void run(int val){
        primeCheck(val);
    }

    // test algorithm
    public void test(int testType){
        // 0 = PRIME TEST, 1 = COMPOSITE TEST
        // Works for detecting if a prime numbers but does not work when composite numbers are tested
        final int[] prime100 = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        final int[] comp100 = {4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20, 21, 22, 24, 25, 26, 27, 28, 30, 32, 33, 34, 35, 36, 38, 39, 40, 42, 44, 45, 46, 48, 49, 50, 51, 52, 54, 55, 56, 57, 58, 60, 62, 63, 64, 65, 66, 68, 69, 70, 72, 74, 75, 76, 77, 78, 80, 81, 82, 84, 85, 86, 87, 88, 90, 91, 92, 93, 94, 95, 96, 98, 99, 100};

        if (testType == 0){
            System.out.println("Running Prime Number Tester(Prime Values)...\n");
            for (int i = 0; i < prime100.length; i++) primeCheck(prime100[i]);
            System.out.println("Done.");
        }

        if (testType == 1){
            System.out.println("Running Prime Number Tester (Composite Values)...\n");
            for (int i = 0; i < prime100.length; i++) primeCheck(comp100[i]);
            System.out.println("Done.");
        }

    }

    // check for prime
    private void primeCheck(int val){
        System.out.println("Checking if \"" + val + "\" is prime...");

        boolean isPrime = true;

        // threshold to check prime 2 -> sqrt(num)
        int start_threshold = 2;
        int end_threshold = (int) Math.sqrt(val) + 1;

        if (enableDebug) System.out.println("StartThresh: " + start_threshold + ", EndThresh: " + end_threshold);

        // run the check
        for (int i = start_threshold; i < end_threshold; i++){
            if (enableDebug){
                System.out.println("PCalc -> " + val + " % " + i + " = " + val % i);
            }
            // (prev) val % ((6 * i) - 1) == 0 && val % ((6 * i) + 1) == 0
            if (val % i == 0){
                System.out.println(">>> " + val + " is not prime\n");
                isPrime = false;
                break;
            }

        }

        if (isPrime){
            System.out.println(">>> " + val + " is prime\n");
        }

    }

}
