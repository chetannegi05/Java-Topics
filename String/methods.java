package String;

public class methods {
    public static void main(String args[])
    {
        String joinString1=String.join("-","welcome","to","javatpoint");  
        System.out.println(joinString1);
        String a = "Chetan is awake";
        System.out.println(a.contains("is"));
        String c = "Negi";
        c= c.concat("chetan");
        System.out.println(c);
        String f  = "Faltu";
        System.out.println(f.substring(0, 2));
        System.out.println(f.substring(2));
    }
}
