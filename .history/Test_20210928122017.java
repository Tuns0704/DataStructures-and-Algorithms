public class Test{
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
  }
  public static void main(String[] args) {
    var l1 = new ADSList<Integer>();
    l1.add(0,1);
    l1.add(1,2);
    l1.remove(0);
    System.out.println(l1.size());
  }
}