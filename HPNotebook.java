interface TouchScreenLaptop{
    void scroll();
    void click();
}

abstract class HP implements TouchScreenLaptop{
    public void scroll(){
        System.out.println("HP Scroll method");
    }
}
abstract class Dell implements TouchScreenLaptop{
    public void scroll(){
        System.out.println("Dell Scroll method");
    }
}
abstract class HPNotebook implements TouchScreenLaptop {
    public void click(){
        System.out.println("HP Click method");
    }
}
abstract class DellNotebook implements TouchScreenLaptop
{
    public void click(){
        System.out.println("Dell Click method");
    }

}




