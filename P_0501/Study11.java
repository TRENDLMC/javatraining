package P_0501;

public class Study11 {
	private static int counter=0;
	private String name;
	 private int height;
	 private int weight;
	 private int id;
	 //필드를 프라이빗으로 설정 그후 겟 명령어를 입력해서 값을 입력받음
	 
		
		public String getName() {
			return name;
		 	}
	 	
		public Study11(String name, int height, int weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		id= ++counter;
	}

		public int getHeight() {
		return height;
		}

		public int getWeight() {
		return weight;
		}

		void gainWeight(int w){
			weight+=w;
		}
		//weight의값을변경해주는 메소드
		void reduceWeight(int w){
			weight-=w;
		}
		
		public int getId() {return id;}
		public void putData() {
			System.out.println("이름:"+name);
			System.out.println("신장:"+height+"cm");
			System.out.println("체중:"+weight+"kg");
		}

}
