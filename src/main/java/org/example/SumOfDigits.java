package org.example;

//- Etape 1 : Pour l'entrée 123, la sortie devrait être 6 (1+2+3)
//        - Pour l'entrée 9875, la sortie devrait être 29 (9+8+7+5)
//        - Pour l'entrée 0, la sortie devrait être 0
//- Étape 2 : Faire en sorte que l'addition des chiffres continue jusqu'a que la sortie sois un seul chiffres.
//- Étape 3 : Si impair on multiplie et si pair on additionne.

public class SumOfDigits {

    public static int calculDigits(int number, boolean addition) {

        String strNumber = String.valueOf(number);
        int cumul = addition ? 0 : 1;

        String[] listNumbers = strNumber.split("");
        for (String y : listNumbers) {
            int valeur = Integer.parseInt(y);
            cumul = addition ? cumul + valeur : cumul * valeur;
        }
        return cumul;
    }

    public static int calculFinalDigits(int number) {
        boolean isPair = number % 2 == 0;
        while (number > 9) {
            number = calculDigits(number, isPair);
        }
        return number;
    }
}
