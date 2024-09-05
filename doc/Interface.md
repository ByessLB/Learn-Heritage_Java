# Interface

## Introduction

### Qu'est ce qu'une interface ?

Une interface en Java est un type de référence, similaire à une classe, qui peut contenir uniquement des constantes, des méthodes abstraites, des méthodes par défaut, des méthodes statiques et des méthodes privées. Les interfaces sont utilisées pour atteindre l'abstraction et polymorphisme.

### Pourquoi utiliser des interfaces ?

Les interfaces permettent de définir des contrats que les classes doivent respecter. Elles sont utilisées pour :

- **Abstraction** : Définir des comportements sans implémentation.
- **Polymorphisme** : Permettre à diférentes classes de partager un même comportement.
- **Flexibilité** : Faciliter la maintenance et l'évolution du code.

## Déclaration d'une Interface

### Syntaxe de Base

Une interface est déclarée à l'aide du mot-clé `interface`.

```java
public interface Animal {
    void manger();
    void dormir();
}
```

### Implémentation d'une interface

Une classe implémente une interface en utilisant le mot-clé `implements`.

```java
public class Chien implements Animal {

    @Override
    public void manger() {
        System.out.println("Le chien aboie");
    }

    @Override
    public void dormir() {
        System.out.println("Le chien dort");
    }
}
```

## Méthodes dans les Interfaces

### Méthodes Abstraites

Les méthodes abstraites sont des méthodes sans corps. Elles doivent être implémentées par les classes qui immplémentent l'interface .

```java
public interface Animal {
    void manger(); // Méthode abstraite
    void dormir(); // Méthode abstraite
}
```

### Méthodes par Défaut

Les méthodes par défaut sont des méthodes avec un corps. Elles peuvent être implémentées directement dans l'interface et n'ont pas besoin d'être redéfinies dans les classes qui implémentent l'interface.

```java
public interface Animal {
    void manger();
    void dormir();

    default void faireDuBruit() {
        System.out.println("L'animal fait du bruit.");
    }
}
```

### Méthodes Statiques

Les méthodes statiques sont des méthodes qui appartiennent à l'interface elle-même et non à une instance de l'interface.

```java
public interface Animal {
    void manger();
    void dormir();

    static void description() {
        System.out.println("Ceci est une interface Animal.");
    }
}
```

### Méthodes Privées

Les méthodes privées sont des méthodes qui ne peuvent être appelées que depuis d'autres méthodes de l'interface.

```java
public interface Animal {
    void manger();
    void dormir();

    default void faireDuBruit() {
        System.out.println("L'animal fait du bruit.");
        faireDuBruitInterne();
    }

    private void faireDuBruitInterne() {
        System.out.println("Bruit interne.");
    }
}
```

## Héritage Multiple avec les Interfaces

### Implémentation de Plusieurs Interfaces

Une classe peut implémenter plusieurs interfaces en les séparant par des virgules.

```java
public interface Volant {
    void voler();
}

public interface Nageur {
    void nager();
}

public class Canard implements Animal, Volant, Nageur {
    @Override
    public void manger() {
        System.out.println("Le canard mange.");
    }

    @Override
    public void dormir() {
        System.out.println("Le canard dort.");
    }

    @Override
    public void voler() {
        System.out.println("Le canard vole.");
    }

    @Override
    public void nager() {
        System.out.println("Le canard nage.");
    }
}
```

## Interfaces et Héritage

### Héritage d'Interfaces

Une interface peut hériter d'une ou plusieurs autres interfaces en utilisant le mot-clé `extends`.

```java
public interface Mammifère extends Animal {
    void allaiter();
}

public class Chien implements Mammifère {
    @Override
    public void manger() {
        System.out.println("Le chien mange.");
    }

    @Override
    public void dormir() {
        System.out.println("Le chien dort.");
    }
}
```

## Exemple Complet

### Définition des Interfaces

```java
public interface Animal {
    void manger();
    void dormir();

    default void faireDuBruit() {
        System.out.println("L'animal fait du bruit.");
    }

    static void description() {
        System.out.println("Ceci est une interface Animal.");
    }
}

public interface Volant {
    void voler();
}

public interface Nageur {
    void nager();
}
```

### Implémentation des Interfaces

```java
public class Canard implements Animal, Volant, Nageur {
    @Override
    public void manger() {
        System.out.println("Le canard mange.");
    }

    @Override
    public void dormir() {
        System.out.println("Le canard dort.");
    }

    @Override
    public void voler() {
        System.out.println("Le canard vole.");
    }

    @Override
    public void nager() {
        System.out.println("Le canard nage.");
    }
}
```

### Utilisation des Interfaces

```java
public class Main {
    public static void main(String[] args) {
        Canard monCanard = new Canard();
        monCanard.manger();
        monCanard.dormir();
        monCanard.voler();
        monCanard.nager();
        monCanard.faireDuBruit();

        Animal.description();
    }
}
```

## Conclusion

Les interfaces en Java sont un moyen puissant de définir des contrats que les classes doivent respecter. Elles permettent d'atteindre l'abstraction et le polymorphisme, facilitant ainsi la maintenance et l'évolution du code. En utilisant les interfaces, vous pouvez rendre votre code plus flexible et plus facile à comprendre.
