//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 4));
    }
    public static String convert(String s, int numRows)
    {
        if(numRows == 1) return s;
        String output = "";
        int krok = 2 * numRows - 2;
        for(int i = 0; i < numRows; i++)
        {
            for(int j = i; j < s.length(); j += krok)
            {
                output += s.charAt(j);
                if(i >= 1 && i <= numRows-2 && j+(krok-2*i) < s.length())
                {
                    output += s.charAt(j+krok-2*i);
                }
            }
        }
        return output;
    }
}