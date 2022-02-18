import java.lang.Math;
public class Point {
    // write your code here
    private int x,y;
    public Point(){
        
    }
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
        
    }
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public double distance(){
        return Math.sqrt(Math.pow(x-0,2)+Math.pow(y-0, 2));
    }
    public double distance(int x1,int y1){
        return Math.sqrt(Math.pow(x-x1,2)+Math.pow(y-y1, 2));
    }
    
    public double distance(Point p){
        return Math.sqrt(Math.pow(x-p.x,2)+Math.pow(y-p.y,2));
    }

    public static void main(String[] args) {
        Point first=new Point(6,5);
        Point second=new Point(3,1);
        System.out.println(first.distance());
        System.out.println(first.distance(second));
        System.out.println(first.distance(2,2));
        Point p=new Point();
        System.out.println(p.distance());
    }

}