package String;

public class ShortestPath {
    private static float path(String s)
    {
        int y=0 , x=0;
        for(int i = 0 ; i < s.length() ; i++)
        {
            char check = s.charAt(i);
            if(check == 'N')
            {
                y++;
            } else if (check == 'S') {
                y--;
            } else if (check == 'W') {
                x--;
            }
            else
            {
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)(Math.sqrt(x2+y2));
    }
    public static void main(String[] args) {
        String s = "NS";
        System.out.println(path(s));
    }
}
