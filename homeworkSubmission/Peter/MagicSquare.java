public class MagicSquare
{
    private int[][] data;
    private int rowSum;

    public MagicSquare(int[][] d)
    {
        data = new int[d.length][d[0].length];
        
        for (int r = 0; r < d.length; r++)
        {
            for (int c = 0; c < d[0].length; c++)
            {
                data[r][c] = d[r][c];
            }
        }
        rowSum = rowSum(data[0]);
    }
    
    
    public boolean isUnique()
    {
        return true;
    }

    
    public boolean isMagic()
    {
        if (isUnique() && rowSumsEqual() && columnSumsEqual() && diagonalSumsEqual())
        {
            return true;
        }
        
        return false;
    }

    
    public boolean rowSumsEqual()
    {
        for (int r = 0; r < data.length; r++)
        {
            if (rowSum(data[r]) != rowSum)
            {
                return false;
            }
        }
        return true;
    }

    private int rowSum(int[] row)
    {
        int sum = 0;
        for (int i = 0; i < row.length; i++)
        {
            sum += row[i];
        }
        return sum;
    }

    
    public boolean columnSumsEqual()
    {
        for (int c = 0; c < data[0].length; c++)
        {
            if (colSum(c) != rowSum)
            {
                return false;
            }
        }
        return true;
    }

    private int colSum(int colNum)
    {
        int sum = 0;
        for (int r = 0; r < data.length; r++)
        {
            sum += data[r][colNum];
        }
        return sum;
    }

    
    public boolean diagonalSumsEqual()
    {
        int diag1 = 0;
        int diag2 = 0;
        for (int i = 0; i < data.length; i++)
        {
            diag1 = diag1 + data[i][i];
            diag2 = diag2 + data[i][data.length - 1 - i];
        }
        
        if (diag1 == rowSum && diag2 == rowSum)
        {
            return true;
        }
        return false;
    }

    
    public String toString()
    {
        String output = "";
        
        for (int i = 0; i < data.length; i++)
        {
            for (int j = 0; j < data[0].length; j++)
            {
                output = output + data[i][j] + " ";
            }
            output = output + "\n";
        }
        
        if (isMagic())
        {
            output = output + "Magic Square";
        }
        
        else
        {
            output = output + "Not A Magic Square"; 
        }
        
        return output;
    }
}
