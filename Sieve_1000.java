package sieve_1000;

public class Sieve_1000 {
    
    // initialize boolean array
    public static boolean [] initialize_array(boolean [] a , int n) {
            for (int i =1 ; i<n; i++) {
            a[i] = true ;
        }    
        return a;
    }
    
    // identify prime numbers based on k * j != prime
    public static boolean [] identify_non_primes(boolean [] a , int n) {
        for (int k=2; k<=n/k; k++) { 
            if (a[k]) {
                for (int j =k; j <= n/k; j++) {
                    a[k*j] = false;  
                }          
            } 
        } 
        return a;
    } 
    
    // print prime numbers
    public static void print_primes(boolean [] a , int n) {
        int count = 0; // Count the number of prime numbers found so far 
        for (int i= 2; i<a.length; i++) {
            if (a[i]) { 
                count = count + 1;
                if (count%10 == 0)
                    System.out.printf("%7d\n", i); 
                else
                    System.out.printf("%7d", i);      
            }
        }
    }      
    
    public static void main(String[] args) {
        
        int num = 1000;

        boolean [] array1 = new boolean[num + 1];
       
        boolean array2 [] = initialize_array( array1 , num);
        
        boolean array3 [] = identify_non_primes( array2 , num);
        
        print_primes( array3 , num);
        
        System.out.println("\n");
    }  
}
    

