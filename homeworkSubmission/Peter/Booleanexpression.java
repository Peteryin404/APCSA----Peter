public class main
{
    //cigar party
    public cigarParty(int cigars, boolean isWeekend)
    {
        if (isWeekend)
        {
            return cigars >= 60;
        }
        else
        {
            return cigars >= 40 && cigars <= 60;
        }
    }
    
    //Fasion date
    public int dateFashion(int you, int date) 
    {
        if (you <= 2 || date <= 2)
        {
            return 0; 
        } 
        else if (you >= 8 || date >= 8) 
        {
            return 2; 
        } 
        else 
        {
            return 1;
        }
    }
    
    
    //squirrelPlay
    public boolean squirrelPlay(int temp, boolean isSummer)
    {
        int upper = isSummer 100 ? : 90;
        return temp >= 60 && temp <= upper;
    }
    
    
    
    //catch speed
    public int caughtSpeeding(int speed, boolean isBirthday) 
    {
        int allowance = isBirthday ? 5 : 0;
        if (speed <= 60 + allowance)
        {
            return 0; 
        }
        else if (speed <= 80 + allowance) 
        {
            return 1;
        }
        else 
        {
        return 2; 
        }
    }
    
    
    //Makebricks
    public boolean makeBricks(int small, int big, int goal)
    {
        int maxBig = goal / 5; 
        if (maxBig > big) 
        {
            maxBig = big; 
        }
        int remainder = goal - (maxBig * 5); 
        return remainder <= small;
    }
}
