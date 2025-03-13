import java.util.ArrayList;
import java.util.List;

public class CandiesList {
    public static void main(String[] args) {
        int[]  candies = {2,3,5,1,3}; //OUTPUT [true,true,true,false,true]
        removingStar(candies);
    }
    public static List<Boolean> removingStar(int[] candies )
    {
        int start = 0;
        int extraCandies =  3;
        List<Boolean> list = new ArrayList<>();
        while(start < candies.length)
        {
            if(candies[start] + extraCandies >= candies.length)
            {
                list.add(true);
            }
            else {
                list.add(false);
            }
            start++;
        }
        return list;
    }
}
