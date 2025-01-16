# Ejercicios sobre Árboles Binarios

Este repositorio contiene la implementación de varios ejercicios relacionados con árboles binarios en Java. Cada ejercicio aborda un problema específico, aplicando conceptos fundamentales de estructuras de datos.

---

## Estructura del Proyecto

El proyecto está organizado en las siguientes carpetas y clases principales:

- **Ejercicio_01_insert**: Inserción de nodos en un Árbol Binario de Búsqueda (BST).
- **Ejercicio_02_invert**: Inversión de un Árbol Binario.
- **Ejercicio_03_listLeves**: Generación de listas enlazadas por niveles del Árbol Binario.
- **Ejercicio_04_depth**: Cálculo de la profundidad máxima de un Árbol Binario.

Cada carpeta contiene la clase principal que resuelve el ejercicio correspondiente.

---

## Ejercicios y Métodos Implementados

### **Ejercicio 01: Insertar en un Árbol Binario de Búsqueda (BST)**

- **Carpeta:** `Ejercicio_01_insert`
- **Clase:** `InsertBSTTest`

**Descripción:**
Este ejercicio implementa un Árbol Binario de Búsqueda (BST), donde:
  - Los valores menores que el nodo están en el subárbol izquierdo.
  - Los valores mayores que el nodo están en el subárbol derecho.

**Métodos:**
  - `Node insert(Node root, int value)`: Inserta un valor en el árbol respetando las reglas del BST.
  - `printTree(Node node, int level)`: Imprime el árbol en formato jerárquico.

---

### **Ejercicio 02: Invertir un Árbol Binario**

- **Carpeta:** `Ejercicio_02_invert`
- **Clase:** `InvertBinaryTree`

**Descripción:**
Este ejercicio invierte un Árbol Binario, intercambiando los subárboles izquierdo y derecho de cada nodo.

**Métodos:**
  - `Node invertTree(Node root)`: Invierte el árbol de manera recursiva.
  - `printTree(Node node, int level)`: Imprime el árbol antes y después de la inversión.

---

### **Ejercicio 03: Listar Niveles en Listas Enlazadas**

- **Carpeta:** `Ejercicio_03_listLeves`
- **Clase:** `ListLeves`

**Descripción:**
Este ejercicio genera una lista enlazada por cada nivel del árbol. Si el árbol tiene `N` niveles, se obtendrán `N` listas enlazadas, cada una representando los nodos de un nivel.

**Métodos:**
  - `List<LinkedList<Node>> ListLeves(Node root)`: Recorre el árbol y devuelve las listas enlazadas por nivel.
  - `void imprimirListasPorNivel(List<LinkedList<Node>> listas)`: Imprime las listas enlazadas, mostrando los nodos de cada nivel.

---

### **Ejercicio 04: Calcular la Profundidad Máxima**

- **Carpeta:** `Ejercicio_04_depth`
- **Clase:** `Depth`

**Descripción:**
Calcula la profundidad máxima de un árbol, es decir, la longitud del camino más largo desde la raíz hasta una hoja.

**Métodos:**
  - `int maxDepth(Node root)`: Calcula de manera recursiva la profundidad máxima del árbol.

---

## Clase Principal: App

La clase `App` ejecuta los ejercicios en orden y muestra los resultados en la consola. Cada ejercicio incluye:
1. Valores de entrada.
2. La estructura jerárquica del árbol.
3. Los resultados requeridos (árbol invertido, niveles o profundidad máxima).

### Métodos en `App`:
- **`runEjercicio01()`**: Inserta nodos en un BST y muestra la estructura del árbol.
- **`runEjercicio02()`**: Invierte un árbol binario y muestra su estado antes y después de la inversión.
- **`runEjercicio3()`**: Genera listas enlazadas por nivel y las imprime.
- **`runEjercicio04()`**: Calcula y muestra la profundidad máxima del árbol.


