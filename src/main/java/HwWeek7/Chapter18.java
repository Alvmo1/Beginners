package HwWeek7;

public class Chapter18 {
    private int pain;
    private String health;
    public Chapter18(){
        System.out.println("Im in pain");
        pain = 10;
    }

    public Chapter18(int pain){
        System.out.println("Pain is at ");
        this.pain = pain;
    }

    public Chapter18(int pain, String health){
        System.out.println("Im okay");
        this.pain = pain;
        this.health = health;
    }
}
