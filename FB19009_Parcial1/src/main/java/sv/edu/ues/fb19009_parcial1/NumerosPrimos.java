/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.ues.fb19009_parcial1;

/**
 *
 * @author AndresFlores
 */
public class NumerosPrimos {
   public int numeroMayor(int num1, int num2){

        if (num1 > num2){
            return num1;
        }
        return num2;
    }

    public int numeroMenor(int num1, int num2){

        if (num1 < num2){
            return num1;
        }
        return num2;
    }
    public boolean esPrimo(int num) {


        int inicio = 2;
        boolean primo = true;

        while (inicio <= (num / 2)) {

            if (num % inicio == 0) {
                primo = false;

                break;
            }
            inicio++;
        }

        return primo;

    }

    public  int contarPrimos(int num1, int num2) {

        int end = numeroMayor(num1,num2);
        int start = numeroMenor(num1,num2);
        int count = 0;

        for (int i = start; i <= end; i++) {

            if (esPrimo(i)) {
                count++;
            }
        }
        return count;
    }

    public int[] listaPrimos(int num1, int num2) {

        int end = numeroMayor(num1,num2);
        int start = numeroMenor(num1,num2);
        int limite = contarPrimos(num1, num2);

        int primes[] = new int[limite];

        int index = 0;
        for (int i = start; i <= end; i++) {
            if (esPrimo(i)) {
                primes[index] = i;
                index++;
            }

        }

        return primes;
    }

    public void invertir(int array[]) {

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

    public void mostrar(int array[]) {

        for (int i : array) {
            System.out.println(i);
        }
    }
    
}
