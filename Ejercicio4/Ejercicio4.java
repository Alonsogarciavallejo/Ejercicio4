// Ejercicio 34
Un algoritmo es un conjunto de instrucciones finitas y bien definidas que resuelven un problema específico

// Ejercicio 35

// Iterativo
public class SumaNaturales {
    public static int sumaIterativa(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }
}


int sumaIterativa(int n) {
    int suma = 0;
    for (int i = 1; i <= n; i++) {
        suma += i;
    }
    return suma;
}

// Recursivo
public class SumaNaturales {
    public static int sumaRecursiva(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumaRecursiva(n - 1);
    }
}

int sumaRecursiva(int n) {
    if (n == 0) {
        return 0;
    }
    return n + sumaRecursiva(n - 1);
}

// Ejercicio 36
"O(n)" indica que una función f(n) no crece más rápido que otra función g(n) multiplicada por una constante, cuando n tiende a infinito. Es una forma de describir la complejidad de un algoritmo en función del tamaño de su entrada.

// Ejericio 37
La complejidad temporal de este cálculo en función de t es constante, O(1).

// Ejercicio 38
primero(ArrayList<String> lista): Este método simplemente devuelve el primer elemento de la lista, que se puede acceder en tiempo constante. Por lo tanto, la complejidad temporal es O(1).

nEsimo(ArrayList<String> lista, int n): Este método devuelve el elemento en la posición n de la lista. Acceder a un elemento en una lista mediante su índice toma tiempo constante en las listas de Java (ArrayList), por lo que la complejidad temporal también es O(1).

// Ejercicio 39
Ambos algoritmos tienen una complejidad temporal lineal, O(n), donde "n" es el tamaño de la entrada

// Ejercicio 40
La complejidad temporal de la función recursiva para calcular la suma de los primeros n números naturales es O(n).

public class SumaNaturales {
    public static int sumaRecursiva(int n) {
        return (n == 0) ? 0 : n + sumaRecursiva(n - 1);
    }

    public static void main(String[] args) {
        int n = 5; // Prueba con n = 5
        int resultado = sumaRecursiva(n);
        System.out.println("La suma de los primeros " + n + " números naturales es: " + resultado);
    }
}

// Ejercicio 41


// Ejercicio 42
La complejidad temporal del algoritmo sería cuadrática, O(n^2), en función del tamaño n del conjunto A.

// Ejercicio 43
La complejidad temporal del método sería lineal, O(m * n), donde m es el número de filas y n es el número de columnas de la matriz.

// Ejercicio 44
public static boolean buscar(int e, int[] array) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] == e) {
            return true; // Si se encuentra el número, devuelve true
        }
    }
    return false; // Si no se encuentra el número, devuelve false
}
Caso peor: En el peor de los casos, el algoritmo debe recorrer todo el array para encontrar el número, lo que lleva a una complejidad temporal de O(n), donde n es la longitud del array.

Caso mejor: El mejor caso ocurre cuando el número buscado está en la primera posición del array, lo que resulta en una complejidad temporal de O(1), ya que se encuentra inmediatamente.

Caso promedio: La complejidad promedio sigue siendo O(n), ya que en promedio, se esperaría tener que recorrer aproximadamente la mitad del array antes de encontrar el número, si está presente.

// Ejercicio 45
public static boolean buscar(int e, int[] array) {
    return buscarRecursivo(e, array, 0, array.length - 1);
}

private static boolean buscarRecursivo(int e, int[] array, int inicio, int fin) {
    if (inicio > fin) {
        return false; // Caso base: el elemento no se encuentra
    }

    int medio = (inicio + fin) / 2;
    if (array[medio] == e) {
        return true; // Se encontró el elemento
    } else if (array[medio] < e) {
        return buscarRecursivo(e, array, medio + 1, fin); // Buscar en la mitad derecha
    } else {
        return buscarRecursivo(e, array, inicio, medio - 1); // Buscar en la mitad izquierda
    }
}

// Ejercicio 46
public static int fibonacci(int n) {
    if (n <= 1) {
        return n;
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
Esto resulta en una complejidad temporal de aproximadamente O(2^n)
el espacio requerido para la pila de llamadas recursivas es O(n), ya que en cada llamada recursiva se agregan dos nuevas llamadas hasta que se alcanza la base de la recursión

// Ejercicio 47
los resultados muestran que el método sumaNPrimeros tiene una complejidad temporal lineal en función de n, lo que significa que su tiempo de ejecución aumenta proporcionalmente con el tamaño del problema.
 Sin embargo, los tiempos de ejecución pueden variar debido a factores externos y limitaciones de hardware para valores muy grandes de n

//  Ejercicio 48
os resultados muestran que el método sumaNMPrimeros tiene una complejidad temporal cuadrática en función de n, lo que significa que su tiempo de ejecución aumenta cuadráticamente con el tamaño del problema.
 Esto puede resultar en tiempos de ejecución significativamente más largos para valores grandes de n en comparación con el método anterior.
 
//  Ejercicio 49
a partir de cierto punto n0, el valor de T(m) debe ser menor o igual a k veces el valor de f(m), para todos los valores de m mayores que n0.

// Ejercicio 50
Para demostrar que T(n) = 3 · log2(n) + 2 es de orden O(log2(n)), tomamos k = 3 y n0 = 1, ya que para todo n mayor que 1, T(n) ≤ 3 · log2(n).

No, T(n) ∈ O(log2(n)) no implica T(n) ∈ O(n). La relación entre logaritmos y funciones lineales no permite inferir esta relación directamente.

No necesariamente. T(n) ∈ O(log3(n)) y T(n) ∈ O(log2(n)) son relaciones distintas y no se pueden comparar directamente debido a las diferencias en las bases de los logaritmos.

// Ejercicio 51
f0(x) es constante ;
f1(x) tiene crecimiento lineal;
f2(x) tiene crecimiento cuadratico;
f3(x) tiene un crecimiento logaritmico;
f4(x) tiene un crecimiento exponencial;

// Ejercicio 52
El número total de operaciones realizadas por la función f es proporcional a n, donde n es el valor de entrada.

Por lo tanto, la complejidad temporal asintótica del método f es O(n).

// Ejercicio 53
Sí, la afirmación es cierta.
 La complejidad en el caso peor de la inserción en un ArrayList puede ser diferente dependiendo de si el ArrayList está ordenado o no.
 Cuando el ArrayList no está ordenado, la inserción de un elemento en cualquier posición del ArrayList tiene una complejidad temporal en el peor caso de O(n).
 Cuando el Arraylist está ordenado tiene una complejidad temporal de O(log n), donde n es el tamaño actual del ArrayList

// Ejercicio 54
n=100;
1.20ns
2.1000ns
3.2000ns
4.100000ns
5.100000000000000000ns
6.1000ns
n=100000;
1.50ns
2.1ms
3.5ms
4.10s
5.10*14ns
6.1ms
n=100000 y insttruccion=1ms;
1.5ms
2.100s
3.500s
4.2,78h
5.10*13ms
6.1ms

// Ejercicio 55
Trata sobre el número de veces que se puede doblar un trozo de papel para formar una pila de 64 capas, aún no está "resuelto" en el sentido de que no existe una solución práctica o física debido a limitaciones físicas y a la escala astronómica de la solución matemática
En resumen, el problema del ajedrez sigue siendo un enigma que desafía nuestra comprensión de los números y las cantidades extremadamente grandes.



































