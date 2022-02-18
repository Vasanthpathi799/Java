class WrapperDemo{
    public static void main(String[] args) {
        int i=20;
        Integer it=Integer.valueOf(i);//int to Object
        System.out.println(it);
        int j=it.intValue();//Object to int
        System.out.println(j);
        String s=Integer.toString(j);//int to String
        System.out.println(s.charAt(0));
        int x=Integer.parseInt(s);//String to int
        System.out.println(x);

    }
}