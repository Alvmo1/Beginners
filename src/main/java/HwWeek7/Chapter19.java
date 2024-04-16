package HwWeek7;

public class Chapter19 {
    public final static double TIME = 12.0;
    public String name;
    public static String info;
    public int id;
    public static int count = 0;
    public Chapter19(){
        id = count;
        count++;
    }

    public void showSports(){
        System.out.println(id + " " +  info + ":" + name);
    }

    public static void showPlayers(){
        System.out.println(info);

    }
}
