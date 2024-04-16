package HwWeek7;

public class Chapter23 implements Chapter23b{
    private String name;
    public void speak(){
        System.out.println("Bark bark!");
    }

    @Override
    public void breed() {
        Chapter23b.super.breed();
    }
}
