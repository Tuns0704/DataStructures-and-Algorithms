import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Message {
	ArrayList<String> A = new ArrayList<String>(); //Array list A
	Scanner sc = new Scanner(System.in);
	String S; //Tin nhắn muốn gửi
	String D= ""; //Biến đích
	int i=0;
	String c=""; //Mỗi kí tự trong chuỗi

	Queue<String> Q = new LinkedList<String>(); //Queue Q
	int bufferSize=10; //Size A = Size Q =10

	//Nhập message
	void input() {
		S=sc.nextLine();
	}

	//Kiểm tra độ dài chuỗi S có hợp lệ không
	boolean lenCheck() {
		if (S.length()==0) {
			System.out.print("The message is empty");
			return false;
		}
		if (S.length()>255) {
			System.out.print("The message is too long (>255 char)");
			return false;
		}
		return true;
	}
	//Thêm từng kí tự vào A
	void addToA() {
		while (A.size()<bufferSize && i<S.length()) {
			c = S.substring(i,i+1);
			A.add(c);
			i++;
		}
	}
	// Hàm này để chuyển 10 kí tự từ A sang Q
	void arrToQ() {
		while (A.size()!=0) {
			c = A.get(0); // Lấy kí tự
			Q.add(c); // Thêm vô Q
			A.remove(0); //Xóa kí tự đó ở A
		}
	}
	//Hàm này để chuyển từ Q sang đích D
	void queueToD() {
		while (!Q.isEmpty()) {
			D+= Q.poll();
		}
	}

	int Send(String s) {
		int count=0;
		if (lenCheck()) {
			System.out.printf("Length of the messege: "+ s.length()+ " letters\n");
			try {
				while (i<s.length())
				{
					addToA();
					for (String item: A) {
						System.out.print(item);
					}
					System.out.print("\n");
					arrToQ();
					for (String item: Q) {
						System.out.print(item);
					}
					System.out.print("\n");
					queueToD();
					count++;
				}
			}
			catch(Exception e ) {
				System.out.print(e.getMessage());
			}
		}
		return count;
	}
}