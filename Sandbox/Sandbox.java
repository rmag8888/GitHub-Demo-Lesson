public class Sandbox
{
    public static void main()
    {
        String str = "9D8ZB78B96B8DF919688DF8Z90Z6";
        
        
        
        
        String newString = "";
        for(int i = 0; i < str.length(); i++)
        {
            if(str.substring(i, i+1).equals("0"))
            {
                newString += "1";
            }
            else if(str.substring(i, i+1).equals("1"))
            {
                newString += "0";
            }
            else
            {
                newString += " ";
            }
            
        }
        System.out.println(newString);
    }
}
