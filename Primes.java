public class Primes {
    public static void main(String[] args) {

       int n = Integer.parseInt(args[0]);

       if (n > 1) { // filtering out only correct inputs

        int primes = 0;

        System.out.println("Prime numbers up to " + args[0] + ":");

        boolean [] arr = new boolean[n + 1];
        int [] arr2 = new int[n + 1];

        for (int i = 2; i <= n; i++){ // setting all values bigger than 1 to true
            arr [i] = true; 
        }

        for (int i = 0; i <= n; i++){ // making arr2 0 to n
            arr2 [i] = i; 
        }


        for (int i = 0; i <= n; i++){

            if (arr[i] == true) {

                for(int j = i + 1; j <= n; j++){
                    if (arr2[j] % arr2[i] == 0) 
                        arr[j] = false;
                }

            }

        if (i > Math.sqrt(n)) break;
        }

        for (int i = 0; i <= n; i++){

            if (arr[i] == true) {
                primes++;
                System.out.println(arr2[i]);
            }

        }

        int fractionP =  (int) ((double) (primes * 100 / (n))) ;

        System.out.println("There are " + primes + " primes between 2 and " +  n + " (" + fractionP + "% are primes)");

    }
}
}