# L'Héritage

## Introduction

### Qu'est ce que l'héritage ?

L'héritage est un concept fondamentale de la programmation orientée objet (POO) qui permet à une classe de dériver les attributs et les méthodes d'une autre classe. La classe dérivée est appelée **sous-classe** ou **classe enfant**, et la classe de base est appelée **super-classe** ou **classe parent**.

### Pourquoi utiliser l'héritage ?

L'héritage permet de réutiliser du code existant, de structurer le code de manière hiérarchique et de faciliter la maintenance et l'évolution des programmes. (Rajout d'information dans le dossier doc).

## Syntaxe de l'héritage

### Déclaration d'une Sous-Classe

Pour hériter d'une classe, on utilise le mot-clé `extends`.

```java
public class SuperClasse {
    // Attributs et méthodes de la super-classe
}

public class SousClasse extends SuperClasse {
    // Attributs et méthodes de la sous-classe
}
```

### Exemple Simple

```java
public class Animal {
    String nom;

    public Animal(String nom) {
        this.nom = nom;
    }

    public void manger() {
        System.out.println(nom + " mange.");
    }
}

public class Chien extends Animal {
    public Chien(String nom) {
        super(nom);
    }

    public void aboyer() {
        System.out.println(nom + " aboie.");
    }
}

public class Main {
    public static void main(String[] args) {
        Chien chien = new Chien("Fido");
        chien.manger(); // Hérite de la classe Animal
        chien.aboyer(); // Propre à la classe Chien
    }
}
```

## Constructeurs et Héritage

### Appel du Constructeur de la Super-Classe

Pour appeler le constructeur de la super-classe, on utilise le mot-clé `super`.

```java
public class Animal {
    String nom;

    public Animal(String nom) {
        this.nom = nom;
    }

    public void manger() {
        System.out.println(nom + " mange.");
    }
}

public class Chien extends Animal {
    public Chien(String nom) {
        super(nom); // Appel du constructeur de la super-classe
    }

    public void aboyer() {
        System.out.println(nom + " aboie.");
    }
}
```

## Surcharge et Redéfinition des Méthodes

### Surcharge (Overloading)

La surcharge permet de définir plusieurs méthodes avec le m^éme nom mais des paramètres différents dans la même classe.

```java
public class Calculatrice {
    public int addition(int a, int b) {
        return a + b;
    }

    public double addition(double a, double b) {
        return a + b;
    }
}
```

### Redéfinition (Overriding)

La redéfinition permet à une sous-classe de fournir une implémentation spécifique d'une méthode déjà définie dans la super-classe.

```java
public class Animal {
    public void faireDuBruit() {
        System.out.println("L'animal fait du bruit.");
    }
}

public class Chien extends Animal {
    @Override
    public void faireDuBruit() {
        System.out.println("Le chien aboie.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal monAnimal = new Animal();
        monAnimal.faitDuBruit(); // L'animal fait du bruit.

        Chien monChien = new Chien();
        monChien.faitDuBruit(); // Le chien aboie.
    }
}
```

## Types de Relations d'Héritage

### Héritage Simple

Une classe dérive directement d'une autre classe.

```java
public class Animal {
    // Attributs et méthodes de la super-classe
}

public class Chien extends Animal {
    // Attributs et méthodes de la sous-classe
}
```

### Héritage Multiniveau

Une classe dérive d'une autre classe, qui dérive elle-même d'une autre classe.

```java
public class Animal {
    // Attributs et méthodes de la super-classe
}

public class Mammifère extends Animal {
    // Attributs et méthodes de la sous-classe
}

public class Chien extends Mammifère {
    // Attributs et méthodes de la sous-classe
}
```

### Héritage Hiérarchique

Plusieurs classes dérivent d'une même super-classe.

```java
public class Animal {
    // Attributs et méthodes de la super-classe
}

public class Chien extends Animal {
    // Attributs et méthodes de la sous-classe
}

public class Chat extends Animal {
    // Attributs et méthodes de la sous-classe
}
```

## Conclusion

L'héritage est un concept puissant en Java qui permet de créer des relations hiérarchiques entre les classes. En utilisant l'héritage, vous pouvez réutiliser du code, structurer vos programmes de manière logique et faciliter la maintenance et l'évolution de vos applications.
