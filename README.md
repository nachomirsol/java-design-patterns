# Design patterns Java

Podemos clasificar los patrones de diseño en:

- **Creacionales**
- **Estructurales**
- **Comportamiento**

## 1- Patrones creacionales

Los patrones de diseño creacionales resuelven problemas en la creación de las instancias, en cómo se crean o construyen objetos
En este tipo de patrón podemos englobar los siguientes patrones:

- **Singleton pattern**
- **Factory pattern**
- **Builder pattern**
- **Proxy pattern**

### 1.1- Singleton pattern

Si queremos que una clase pueda crear únicamente un objeto.
Para ello definiremos el constructor como privado, para que no podamos instanciar la clase con new. Además definiremos el método que crea ese objeto como static, para que pueda accederse a los métodos del objeto sin tener que crear la instancia de la clase con new.

**Ejemplo**

Ejemplo logger o impresora, imaginemos el caso de imprimir un archivo de word y un archivo de powerpoint, si cada vez que le damos a se crea un objeto de printer, podría darnos resultados inesperados

## 1.2- Factory pattern

La regla básica del factory pattern es que siempre hay que programar de cara a interfaces. En este patrón el tipo de objetos que se crean se decide en una clase factory separada, de manera que si algún día se añade una clase extra o función, el cliente o main no cambiará.

**Ejemplo**

Ejemplo una clase que se encargue de mostrar los enemigos de un videojuego. En la clase EnemyFactory podríamos tener un método createEnemy, que va creando de forma aleatoria los enemigos, new Enemy dentro de esta clase.

```java
interface EnemyFactory{
    public Enemy createEnemy()
}
```

## 1.3- Builder pattern

-
**Ejemplo** -

## 1.4- Proxy pattern

-
**Ejemplo**

## 2- Patrones estructurales

Los patrones estructurales hacen referencia a cómo están estructurados las clases u objetos, resuelven problemas referidos a la estructura de clases:

- **Template pattern**
- **Adapter pattern**
- **Decorator pattern**
- **Facade pattern**
- **Composite pattern**

### 2.1- Template pattern

- Cuando queremos tener el control de que ciertos métodos se llamen en un determinado orden concreto podemos crearnos un método que contenga la llamada a esos métodos de forma ordenada.
- la idea es tener la llamada a esos métodos en una superclase, de modo que esos métodos podrán repartirse a lo largo de los diferentes archivos. De forma que los métodos comunes estarán en la misma clase. Pero como no podemos llamar a los métodos de una subclase desde una superclase, tenemos que hacer esta superclase abstracta y definir los métodos que van a llamarse con un public abstract nombremétodo().

**Ejemplo**

Por ejemplo la clase principal des DataProcessor y las subclases son ExcelFile y TextFile. Estas deciden cómo implementan las funciones que extienden de DataProcessor.

### 2.2- Adapter pattern

Cuando tenemos interfaces diferentes o incompatibles entre sí, pero necesitamos que el cliente pueda usar ambas del mismo modo. Este patrón convierte una interfaz o clase en otra interfaz que el cliente desea.
Partes:

- Target: La interfaz que usamos para crear el adapter
- Adapter: Es la implementación del target y que realizará la adaptación
- Client: Es el que interactúa y usa el adapter
- Adaptee: Es la interfaz incompatible que necesitamos adaptar con el adapter

**Ejemplo**

BankData y User

### 2.3- Decorator pattern

-
**Ejemplo** -

### 2.4- Facade pattern

-
**Ejemplo**

-

### 2.5- Composite pattern

-
**Ejemplo** -

## 3- Patrones de comportamiento

Los patrones comportamentales resuelven problemas relacionados con la forma en que debe comportarse un objeto:

- Observer pattern
- Strategy pattern

### 3.1- Observer pattern

- Se utiliza cuando aparece la necesidad de notificar cambios de estado a algún objeto.

**Ejemplo**

Canal de youtube tiene un estado concreto, videos publicado. Cada vez que se sube un video nuevo queremos notificar a todos los suscriptores. Canal de youtube sería el objeto a observar u **observable**. Cada suscriptor sería el objeto que observa u **observador**.
Queremos que cada uno de los observadores sea notificado cuando el observable quiera.
Truco para recibir las notificaciones: Cuando construimos el observador(suscriptor) el observable(canal de youtube) se pasa como parámetro.

### 3.2- Strategy pattern

-

**Ejemplo**
