class Main {
  public static void main(String args[]){
    var q1 = new ADSQueue<Integer>();
    q1.offer(1);
    q1.offer(2);
    q1.offer(3);
    q1.offer(4);
    q1.poll();
    System.out.println("Queue");
    System.out.println("----------");
    System.out.println("Queue: "+q1.size());
    System.out.println("Peek: "+q1.peek());
  }
}
