package lista;

public class TestLista {
  public static void main(String[] args) {
    
    Lista lista = new Lista();
    Lista lista1 = new Lista(5, 5, 7, 1, 4, 6);

    System.out.println(lista.insertar(5));
    
    System.out.println(
    lista.insertar(2, 7)
    );

    /** Return the last element of the list and delete it */
    System.out.println(lista1.pop());
  }
}
