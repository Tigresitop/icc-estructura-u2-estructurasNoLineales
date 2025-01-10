import java.util.List;

import main.Ejercicio_03_listLeves.ListLeves;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.ArbolRecorridos;

public class App {
    public static void main(String[] args) throws Exception {
        //runArbolBinario();
        runEjercicio3();
    }
    
    public static void runArbolBinario(){
        ArbolBinario arbolBinario = new ArbolBinario();
        ArbolRecorridos arbolRecorridos = new ArbolRecorridos();

        int[] valores = {40, 20, 60, 10, 30, 50, 70, 5, 15, 55};
        
        

        //Ingresar cada valor al arbol
        for (int i = 0; i < valores.length; i++){
        arbolBinario.insert(valores[i]);
        }
        
        System.out.println();
        arbolBinario.printTree();

        System.out.println(  );
        System.out.println("Recorrido PreOrder");
        arbolRecorridos.preOrderIterativo(arbolBinario.getRoot());
        System.out.println();
        System.out.println("Recorrido PostOrder");
        arbolRecorridos.postOrderRecursivo(arbolBinario.getRoot());
        System.out.println();
        System.out.println("Recorrido InOrder");
        arbolRecorridos.inOrderRecursivo(arbolBinario.getRoot());
    }

    public static void runEjercicio3() {
        ArbolBinario arbolBinario = new ArbolBinario();
        ListLeves listLeves = new ListLeves();
        int[] valores = {4, 2, 7, 1, 3, 6, 9};
        
        for (int valor : valores) {
            arbolBinario.insert(valor);
        }

        System.out.println();
        System.out.println("Listas por Nivel:");
        listLeves.imprimirListasPorNivel(listLeves.ListLeves(arbolBinario.getRoot()));
    }
}