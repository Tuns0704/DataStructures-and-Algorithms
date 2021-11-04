import java.util.ArrayList;

public class ADSList<E> implements ArrayList<E>{
  private static final int DEFAULT_CAPACITY = 4;
  private Object[] element;
  private int size = 0;

  public ADSList(){
    this.element = new Object[DEFAULT_CAPACITY];
  }

  public boolean add(E element){
    if(this.size == this.elements.length){
      this.elements = grow();
    }
    this.elements[this.size++] = element;
    return true;
  }

  public boolean add(int index, E element) {
    checkIndex(index);
    if (this.size == this.elements.length) {
      this.elements = grow();
    }
    E lastElement = this.getElement(this.size - 1);
    for (int i = this.size -1; i > index; i--) {
      this.elements[i] = this.elements[i-1];
    }
    this.elements[this.size] = lastElement;
    this.elements[index] = element;
    this.size++;
    return true;
  }
  public E get(int index) {
    checkIndex(index);
    return this.getElement(index);
  }
  private getElement(int index) {
    try{
      return this.elements[index];
    }catch(Exception e){
      return null;
    }
  }
  public E set(int index, E element) {
    checkIndex(index);
    E.oldElement = this.getElement(index);
    this.elements[index] = element;
    return oldElement;
  }
  public E remove(int index) {
    this.checkIndex(index);
    E.element = this.getElement(index);
    this.elements[index] = null;
    this.size--;
    shift(index)
  }
}
