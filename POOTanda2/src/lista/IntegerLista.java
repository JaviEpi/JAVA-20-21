package lista;

import java.util.Arrays;

public class IntegerLista {
  private static final int DEFAULT_MAX_SIZE = 10;
  protected int[] content;
  protected int contentSize; 


  public IntegerLista() {
    this.contentSize = 0;
    this.content = new int[DEFAULT_MAX_SIZE];
  }

  public IntegerLista(int... content) {
    this.contentSize = content.length;

    if (content.length > DEFAULT_MAX_SIZE) {
      this.content = new int[content.length];
    } else {
      this.content = new int[DEFAULT_MAX_SIZE];
    }

    for (int i = 0; i < content.length; i++) {
      this.content[i] = content[i];
    }
  }

  public boolean insert(int element) {
    if (this.isFull()) { 
      return false;
    }
    this.content[this.contentSize] = element;
    ++this.contentSize;
    return true;
  }
  
  public boolean insert(int element, int pos) {
    if (this.isFull() || pos < 0) {
      return false;
    }

    if (pos >= this.contentSize) {
      return this.insert(element);
    }

    for (int i = this.contentSize - 1; i >= pos; i--) {
      this.content[i + 1] = this.content[i];
    }
    this.content[pos] = element;

    ++this.contentSize;
    return true;
  }

  public int pop() {
    if (this.isEmpty()) {
      System.err.println("Excepción. La lista está vacía.");
      return 0;
    }

    --this.contentSize;
    return this.content[this.contentSize];
  }

  public boolean remove(int element) {
    if (this.isEmpty()) {
      return false;
    }

    int posicionElement = 0;
    while (posicionElement < this.contentSize - 1 && this.content[posicionElement] != element) {
      posicionElement++;
    }

    if (this.content[posicionElement] != element) {
      return false;
    }

    for (int i = posicionElement; i < this.contentSize - 1; i++) {
      this.content[i] = this.content[i + 1];
    }

    --this.contentSize;
    return true;
  }

  public void clear() {
    this.contentSize = 0;
  }

  public boolean isFull() {
    return this.content.length == this.contentSize;
  }

  public boolean isEmpty() {
    return this.contentSize == 0;
  }

  public boolean resize(int newMaxSize) {
    if (newMaxSize <= this.getContentSize()) {
      return false;
    }

    int[] newContent = new int[newMaxSize]; 
    for (int i = 0; i < this.contentSize; i++) {
      newContent[i] = this.content[i];
    }
    this.content = newContent;
    return true;
  }

  public int getContentSize() {
    return this.contentSize;
  }

  public int getMaxSize() {
    return this.content.length;
  }

  public void setContent(int[] content) {
    this.content = content;
  }

  public void setContentSize(int contentSize) {
    this.contentSize = contentSize;
  }

  @Override
  public String toString() {
    int[] arrayAux = Arrays.copyOfRange(this.content, 0, this.contentSize);
    return Arrays.toString(arrayAux);
  }
}
