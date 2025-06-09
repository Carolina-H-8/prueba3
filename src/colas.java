
public class colas {

    //atributo
    private Nodo inicio, termino;

    //constructor
    public colas() {
        this.inicio = null;
        this.termino = null;
    }

    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.setNext(null);
        if (inicio == null & termino == null) {
            inicio = nuevo;
            termino = nuevo;
        } else {
            termino.setNext(nuevo);//enlazar nodo
            termino = termino.getNext(); //Enlazar el nodo anterior
        }

    }
    public boolean estaVacia(){
        boolean cola = false;
        if(inicio == null & termino == null){
            cola = true;
            System.out.println("La cola esta vacia");
            
        }else{
            System.out.println("La cola no esta vacia");
        }
        return cola;
    }   
    //
    public String extraer(){
        int dato1= inicio.getDato();
        inicio = inicio.getNext();
        return "El dato desencolado es "+dato1;
        
    }
    public int contar(){
        int aux = 0;
        Nodo c = this.inicio;
        while(c!= null){
            aux++;
            c = c.getNext();
        }
        return aux;
    }

    @Override
    public String toString() {
        Nodo c = this.inicio;
        String m = "";
        while(c != null){
            m += c.toString();
            c = c.getNext();
        }
        return m;
    }
    
}
