package P_0511;

import java.nio.ReadOnlyBufferException;
import java.util.Scanner;

public class Study03 {
	static void check(int sw)throws Exception{
		switch(sw) {
		case 1:throw new Exception("검사 예외발생");
		case 2:throw new RuntimeException("비검사예외발생!");
		}
	}
	static void test(int sw)throws Exception{
		check(sw);
	}
	
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		System.out.print("sw:");
		int sw=sca.nextInt();
		try {
			test(sw);
		}catch (RuntimeException e) {
		System.out.println(e.getMessage());
		}catch (Exception e) {
		System.out.println(e.getMessage());
		}
	}
	

}
