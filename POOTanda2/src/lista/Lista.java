package lista;

import java.util.Arrays;

public class Lista {

 private static final int DEFAULT_MAX_SIZE = 10;
 private int[] content; 
 private int contentSize;

 public Lista() {
   this.contentSize = 0;
   this.content = new int[DEFAULT_MAX_SIZE];
 }

 public Lista(int... content) {
   if (content.length > DEFAULT_MAX_SIZE) {
     this.content = new int[content.length];

   } else {
     this.content = new int[DEFAULT_MAX_SIZE];
   }

   for (int i = 0; i < content.length; i++) {
     this.content[i] = content[i];
   }
 }

 public boolean insertar(int element) {
   for (int i = 0; i < content.length; i++) {
     content[content.length - 1] = element;
   }
   return true;
 }
 
 public boolean insertar(int element, int pos) {
   for (int i = 0; i < content.length; i++) {
     content[pos - 1] = element;
   }
   return true;
 }

 public int pop() {
   int lastElement = 0;
   for (int i = 0; i < content.length; i++) {
     content[content.length - 1] = lastElement;
   }
   return lastElement;
 }

 
 public boolean borrarElemento(int element) {
   return false;
 }

 public void borrar() {
   this.contentSize = 0;
 }


 public boolean isFull() {
   return this.content.length == this.contentSize;
 }

 public boolean isEmpty() {
   return this.content.length == 0;
 }

 public boolean resize() {
   return false;
 }

 public int getSize() {
   return this.contentSize;
 }

 public int getMaxSize() {
   return this.content.length;
 }

 @Override
 public String toString() {
   int[] arrayAux = Arrays.copyOfRange(this.content, 0, this.contentSize);
   return Arrays.toString(arrayAux);
 }
}
