package HwWeek7;

public class Chapter27 {

    public static final int id = 4;
    private String startingPc;

    public String getPc(){
        String Pc = "Got my PC!!";
        return Pc;
    }
    private int hardWare(){
        return 10;
    }

    public String getStatingPc() {
        return startingPc;
    }

    public void setStatingPc(String statingPc) {
        this.startingPc = statingPc;
    }
}
