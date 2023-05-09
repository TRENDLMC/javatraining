package P0509;

public class Study15 {
    static void intro(Study12 study12){
        study12.introduce();
    }

    public static void main(String[] args) {
        Study12[] a={
                new Study12("kurt","아이"),
                new Study13("R2D2","루크"),
                new Study14("0XS5","Aplle",Study05.YELLOW),
                new Study12("마이클","영남")
        };

        for (Study12 study12:a) {
            intro(study12);
            if(study12 instanceof Study14){{
                System.out.print("스킨은:");
                ((Study14)study12).printSkin();
                System.out.println("입니다");
            }
                System.out.println();
            }
        }
    }
}
