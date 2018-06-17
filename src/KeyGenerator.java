import java.util.Scanner;
public class KeyGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        System.out.println("화면에 숫자를 입력하세요.");
        int input = s.nextInt();
        System.out.println("당신이 입력한 숫자는 "+input);
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
