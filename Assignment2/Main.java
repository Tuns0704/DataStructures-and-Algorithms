public class Main {
  public static void main(String[] args) {
		Message M = new Message();
		System.out.print("Enter Messege: ");
		M.input();
		double start = System.currentTimeMillis();		//get the system time at starting point
		int count = M.Send(M.S);
		double finish = System.currentTimeMillis();		//get the system time at finishing point
		double time = (finish - start)/M.bufferSize;
		double space = M.bufferSize * 2;
		if(count >0)						//if number of buffer > 0
		{
			System.out.print("\nThe messege is sent successfully: \n");
			System.out.print(M.D);
			System.out.print("\n\nThe number of buffer usage: " + count + " times");
			System.out.printf("\nTime : %.1f ms", time);
			System.out.printf("\nSpace: %.1f ms", space);
		}
	}
}
