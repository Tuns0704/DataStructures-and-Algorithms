public interface List<T>{

          //Add an element to the list at specified index, resize if needed*/
	void add(int index,T element) throws IndexOutOfBoundsException;

          //Remove an element from specified index if valid and return the removed element
	T remove(int index) throws IndexOutOfBoundsException;

          //Return the element at specified index if valid
	T get(int index) throws IndexOutOfBoundsException;

          //Replace the element at specified index in list with specified element by user if index is valid
	void set(int index, T element) throws IndexOutOfBoundsException;

          //Return the number of elements in the list
	int size();

          //Return a boolean whether the list is empty
	boolean isEmpty();

          //Return the index of first occurence of specified element if it exists in the list
	int find(T element);
		}
