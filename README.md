# Sum of Digits Kata

## Description
Ce kata consiste à créer une fonction qui calcule la somme des chiffres d'un nombre entier.

Par exemple :
- Pour l'entrée 123, la sortie devrait être 6 (1+2+3)
- Pour l'entrée 9875, la sortie devrait être 29 (9+8+7+5)
- Pour l'entrée 0, la sortie devrait être 0

## Structure du projet
Le projet contient deux fichiers principaux :
- `SumOfDigits.java` - La classe contenant la méthode qui calcule la somme des chiffres
- `SumOfDigitsTest.java` - Les tests unitaires pour vérifier le bon fonctionnement de la méthode

## Comment démarrer
1. Clonez ce dépôt
2. Ouvrez le projet dans votre IDE préféré
3. Exécutez les tests pour vérifier que l'environnement fonctionne correctement

## Étapes suggérées
1. Commencez par faire passer le test initial (qui vérifie que la méthode renvoie 1 pour l'entrée 1)
2. Ajoutez un test pour vérifier que la méthode fonctionne avec d'autres nombres à un chiffre
3. Implémentez la logique pour calculer la somme des chiffres d'un nombre à plusieurs chiffres
4. Ajoutez des tests pour les cas spéciaux (0, nombres négatifs, etc.)
5. Optimisez votre solution si nécessaire

## Approches possibles
- **Approche par conversion en chaîne de caractères** : Convertir le nombre en chaîne, puis parcourir chaque caractère
- **Approche mathématique** : Utiliser des opérations modulo (%) et division entière (//) pour extraire chaque chiffre

## Extensions possibles
- Calculer la "somme digitale" récursive (continuer à additionner jusqu'à obtenir un seul chiffre)
- Gérer les nombres négatifs
- Optimiser pour les très grands nombres

## Prérequis
- Java 8 ou supérieur
- JUnit 5 pour exécuter les tests

Organisé et animé par MOMPER Axel
