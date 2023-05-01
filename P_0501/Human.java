package P_0501;

public class Human {
	private String name;
	 private int height;
	 private int weight;
	 //필드를 프라이빗으로 설정 그후 겟 명령어를 입력해서 값을 입력받음
	 
		public Human(String name) {
			
			this.name = name;
		}

	 	public Human(String name, int height) {
		super();
		this.name = name;
		this.height = height;
		}

	
		public Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		}
		public String getName() {
			return name;
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
}

