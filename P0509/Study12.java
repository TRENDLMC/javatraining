package P0509;

public class Study12 {
    private String name;
    private String masterName;


    public  Study12(String name,String masterName){
        this.name=name;
        this.masterName=masterName;
    }
    public String getName(){
        return name;
    }
    public String getMasterName(){
        return masterName;
    }
    public void introduce(){
        System.out.println("나의 이름은"+name+"입니다");
        System.out.println("주인님의 이름은"+masterName+"입니다");
    }
}
