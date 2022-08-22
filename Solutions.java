/*
* @author Pransh Gupta
* Fastest algorithm to find all prime numbers between 1 to n;
*/

import java.util.ArrayList;
import java.util.Scanner;

class Solutions {
    private static void isPrime(long n) {
        ArrayList<Long> arr = new ArrayList<>();
        for(long i=2; i<n; i++) {
            boolean flag = false; 
            int a = (int)(Math.sqrt(i));
            for(Long num: arr) {
                if(num > a) {
                    break;
                }
                if(i%num == 0) {
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                arr.add(i);
            }
        }

        for(Long num: arr) {
            System.out.print(num + ", ");
        }
        System.out.println();
        System.out.println(arr.size());
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long n = sc.nextLong();
        isPrime(n);
    }
}
