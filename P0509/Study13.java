package P0509;

public class Study13 extends  Study12 {

    public Study13(String name,String masterName){
        super( name, masterName);
    }

    @Override
    public void introduce() {
        System.out.println("나는로봇! 이름은"+getName()+".");
        System.out.println("주인님의 이름은"+getMasterName()+",");
    }

    public void  work(int sw){
        switch (sw){
            case 0:
                System.out.println("청소를합니다"); break;
            case 1:
                System.out.println("세탁을 합니다."); break;
            case 2:
                System.out.println("밥을 합니다");break;
        }
    }
}
