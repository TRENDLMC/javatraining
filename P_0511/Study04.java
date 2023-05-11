package P_0511;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

public class Study04 {
	static void init() {
		BufferedReader br=null;
	
	
	try {
		br= new BufferedReader(new FileReader("LastTime.txt"));
		String time=br.readLine();
		System.out.println("이전시간은"+time+"였습니다");
		
	}catch (IOException e) {
	System.out.println("이프로그램을 실행하는 것은 처음입니다");
	}finally {
		if(br!=null) {
			try {
				br.close();
			}catch (IOException e) {
			System.out.println("파일닫기실패");
				}
			}
		}
	
	}
	static void term() {
		FileWriter fw=null;
		try{
			fw=new FileWriter("LastTime.txt");
			GregorianCalendar c=new GregorianCalendar();
			fw.write((String.format("%04d년 %02d월 %02d일 %02d시"
					+ " %02d분 %02d초",c.get(YEAR),c.get(MONTH)+1,c.get(HOUR_OF_DAY),c.get(MINUTE),
					c.get(SECOND))));
			
		}catch (IOException e) {
		System.out.println("오류발생");
		}finally {if(fw!=null) {
			try {
				fw.close();
			}catch (IOException e) {
			System.out.println("파일닫기 실패");
			}
		}
			
		}
	}
	public static void main(String[] args) {
		init();
		term();
	}
}
