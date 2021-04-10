/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertoargueta.servlts;

/**
 *
 * @author rober
 */
public class Primos {
   public int mayor(int num1, int num2){

        if (num1 > num2){
            return num1;
        }
        return num2;
    }

    public int menor(int num1, int num2){

        if (num1 < num2){
            return num1;
        }
        return num2;
    }
    public boolean isPrime(int num) {


        int start = 2;
        boolean prime = true;

        while (start <= (num / 2)) {

            if (num % start == 0) {
                prime = false;

                break;
            }
            start++;
        }

        return prime;

    }

    public  int countPrimes(int num1, int num2) {

        int end = mayor(num1,num2);
        int start = menor(num1,num2);
        int count = 0;

        for (int i = start; i <= end; i++) {

            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public int[] primeList(int num1, int num2) {

        int end = mayor(num1,num2);
        int start = menor(num1,num2);
        int limite = countPrimes(num1, num2);

        int primes[] = new int[limite];

        int index = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primes[index] = i;
                index++;
            }

        }

        return primes;
    }

    public void reverse(int array[]) {

        int limite = array.length;

        int temp[] = new int[limite];
        int index = limite - 1;

        for (int i = 0; i < limite; i++) {
            temp[i] = array[index];

            index--;
        }

        index = 0;
        for (int i : temp) {
            array[index] = i;
            index++;
        }
    }

    public void show(int array[]) {

        for (int i : array) {
            System.out.println(i);
        }
    }
    
}
