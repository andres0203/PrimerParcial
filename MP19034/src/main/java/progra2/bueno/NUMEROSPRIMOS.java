/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2.bueno;

/**
 *
 * @author Usuario
 */
public class NUMEROSPRIMOS {

    public int mayor(int numero1, int numero2) {

        if (numero1 > numero2) {
            return numero1;
        }
        return numero2;
    }

    public int menor(int numero1, int numero2) {

        if (numero1 < numero2) {
            return numero1;
        }
        return numero2;
    }

    public boolean isPrime(int num) {

        int inicio = 2;
        boolean prime = true;

        while (inicio <= (num / 2)) {

            if (num % inicio == 0) {
                prime = false;

                break;
            }
            inicio++;
        }

        return prime;

    }

    public int Contador(int numero1, int numero2) {

        int end = mayor(numero1, numero2);
        int inicio = menor(numero1, numero2);
        int count = 0;

        for (int i = inicio; i <= end; i++) {

            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public int[] Lista(int numero1, int numero2) {

        int end = mayor(numero1, numero2);
        int inicio = menor(numero1, numero2);
        int limite = Contador(numero1, numero2);

        int primes[] = new int[limite];

        int indice = 0;
        for (int i = inicio; i <= end; i++) {
            if (isPrime(i)) {
                primes[indice] = i;
                indice++;
            }

        }

        return primes;
    }

    public void regresa(int array[]) {

        int limite = array.length;

        int temp[] = new int[limite];
        int indice = limite - 1;
        for (int i = 0; i < limite; i++) {
            temp[i] = array[indice];
            indice--;
        }
        indice = 0;
        for (int i : temp) {
            array[indice] = i;
            indice++;
        }
    }

}
