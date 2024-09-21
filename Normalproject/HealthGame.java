package Normalproject;

public class HealthGame {
    public static void main(String[] args)
    {
        int initialHealth = 12;
        int deltas[] = {-4 , -12 , 6 , 2};
        int lastHealth = solution(initialHealth,deltas);
        System.out.println("The current Health Of Your Character is " + lastHealth);
    }
    public static int solution(int initialHealth , int deltas[])
    {
        int currentHealth = initialHealth;
        for(int i = 0 ; i < deltas.length ; i++)
        {
            currentHealth  = currentHealth + deltas[i];
            if(currentHealth > 100)
            {
                currentHealth = 100;
            }
            if (currentHealth < 0) 
            {
                currentHealth = 0;
            }
        }
        return currentHealth;
    }
}
