public class Car {
    private static String name;
    public String mycar;
    protected int cost;
    public static void accessprivate(String passedname){
        name=passedname;
    }

    public static String getPrivate(){
        return name;
    }
}
