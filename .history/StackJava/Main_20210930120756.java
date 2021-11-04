class Main {
    public static void main(String args[]){
        var s1 = new ADSStack<Integer>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println("Stack");
        System.out.println("Peek: "+s1.peek());
        System.out.println("Pop: "+s1.pop());
        System.out.println("Size after pop: "+s1.size());
        System.out.println("..................................");
    }
  }