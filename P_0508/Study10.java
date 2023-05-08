package P_0508;

import java.util.Scanner;

public class Study10 {
	public static void main(String[] args) {
		
	
	Scanner sca=new Scanner(System.in);
	Study08 hp=new Study08();
	Study09 cp=new Study09();
	String [] hands= {"가위","바위","보"};
	
	int retry;
	
	do {
		int comp=cp.nextHand();
		int user=hp.nextHand();
		
		System.out.println("나는"+hands[comp]+"이고,당신은"+hands[user]+"입니다");
		
		int judge=(user-comp+3)%3;
		
		switch(judge) {
		case 0:System.out.println("비겻습니다"); break;
		case 1:System.out.println("당신이 졌습니다"); break;
		case 2:System.out.println("당신이 이겼습니다"); break;
		}
		
		do {
			System.out.print("다시한번?(0)아니오(1)네");
			retry=sca.nextInt();
		}while(retry !=0&&retry!=1);
		
	}while(retry ==1);
	}
}

