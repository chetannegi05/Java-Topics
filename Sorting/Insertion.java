public class Insertion
{
    public static void main(String args[])
    {
        int arry[] = {4,2,5,1,6};
        insert(arry);
    }
    public static void insert(int arry[])
    {
        for(int i = 0 ; i < arry.length-1 ; i++)
        {
            int j = i-1;
            int curr = arry[i];
            while (j>=0) {
                if (curr < arry[j]) {
                    arry[j+1] = arry[j];
                }
                else
                {
                    break;
                }
                j--;
                arry[j+1] = curr;
            }
        }
        for(int i  = 0 ; i < arry.length ; i++)
        {
            System.out.println(arry[i]);
        }
    }
}