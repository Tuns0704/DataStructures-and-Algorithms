import java.util.ArrayList;

public class ADSList<E> implements ArrayList<E>{
  private static final int DEFAULT_CAPACITY = 4;
  private Object[] element;
  private int size = 0;

  public ADSList(){
    this.element = new Object[DEFAULT_CAPACITY];
  }

  public boolean add(E element){
    if(this.size == this.element.length){
      this.elements = grow();
    }
    this.element[this.size++] = element;
    return true;
  }

  public boolean add(int index, E element){
    checkIndex(index);
    if(this.size == this.element.length){
      this.elements = grow();
    }
    E lastElement = this.getElements[this.size - 1];
    for(int i = this.size - 1; i >= 0; i--){
      this.elements[i] = this.element[i-1];
    }
    this.element =
  }
}
