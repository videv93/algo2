package com.example;

import java.util.Arrays;

class StepInPrimes {

	public static void main(String[] args) {
		System.out.println("Result : " + Arrays.toString(StepInPrimes.step(2,4900,4919)));
	}

	public static long[] step(int g, long m, long n) {
		// your code
		long[] result = null;
		if (m >= n) {
			return result;
		}
		int size = 0;
		long[] temp = new long[] {};
		for (long i = m; i <= n; i++) {
			if (isPrime(i)) {
				size++;
				temp = Arrays.copyOf(temp, size);
				temp[size - 1] = i;
			}
		}

		if (temp.length > 0 && g > 0) {
			boolean check = false;
			for (int j = 0; j < temp.length; j++) {
				for (int k = j; k < temp.length; k++) {
					if (temp[k] - temp[j] == g) {
						result = new long[2];
						result[0] = temp[j];
						result[1] = temp[k];
						check = true;
						break;
					}
				}
				if(check) {
					break;
				}
			}
		}

		return result;
	}

	public static boolean isPrime(long n) {
		for (int i = 2; i < (long)Math.sqrt(n)+1; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
	
	/**
	 * class StepInPrimes {

    private static HashSet<Long> primes = new HashSet<>();

    public static long[] step(int stepLength, long start, long end) {
        OptionalLong smallerPrime = LongStream.rangeClosed(start, end).filter(i -> isPrime(i) && isPrime(i+stepLength)).findFirst();
        return smallerPrime.isPresent()
                ? new long[]{smallerPrime.getAsLong(), smallerPrime.getAsLong()+stepLength}
                : null;
    }

    private static boolean isPrime(long primeCandidate){
        if(primes.contains(primeCandidate))
            return true;

        for(long i=2; i<Math.sqrt(primeCandidate)+1; i++){
            if(primeCandidate%i == 0)
                return false;
        }

        primes.add(primeCandidate);
        return true;
    }
	 */
	
	
	/***
	 * class StepInPrimes {
    
    public static long[] step(int g, long m, long n) {
        long start = m;
        long end = n;
        long step = g;
        
        for (long i=start;i<=(end-step);i++){
          if (isPrime(i) && isPrime(i+step)){
            return new long[]{i, i+step};
          }
        }
        return null;
    }
    
    public static boolean isPrime(long input){
      if (input == 1 || input == 3) return false;
      if (input % 2 == 0) return false;
      long sqrt_value = (long)Math.sqrt(input);
      for (long i=3;i<=sqrt_value;i+=2){
        if (input%i == 0) return false;
      }
      return true;
    }
	 * 
	 */
}
