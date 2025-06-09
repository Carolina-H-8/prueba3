
package colas;


public class Colas {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        colas cola1 = new colas();
        cola1.insertar(45);
        cola1.insertar(4);
        cola1.insertar(12);
        cola1.insertar(8);
        cola1.insertar(24);
        System.out.println(cola1.toString);
        cola1.extraer();
        System.out.println(cola1.toString);
        cola1.estaVacia();
        System.out.println(cola1.toString);
        
        int size = cola1.contar();
        System.out.println("cantidad de elementos en la cola son los" + size);
    }
    
}
