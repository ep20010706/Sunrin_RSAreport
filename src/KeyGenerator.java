import java.util.Scanner;
public class KeyGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        System.out.println("ȭ�鿡 ���ڸ� �Է��ϼ���.");
        int input = s.nextInt();
        System.out.println("����� �Է��� ���ڴ� "+input);
	}

	public boolean PrimeCheck(int check){
		int i = 2;
		for (int n = 2; n < i; n++) {
			if (i % n == 0) {
				return false;
			}
		}
		return true;

	}
}
