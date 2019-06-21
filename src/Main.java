import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int base;
        int convert;
        int base10 = 0;
        int base8 = 0;
        String baseStr;

        System.out.println("Base Conversions!");
        System.out.println("What base are you using?");
        base = in.nextInt();

        if(base == 2)
        {
            System.out.println("Enter a number to convert to base 10");
            convert = in.nextInt();
            baseStr = Integer.toString(convert);

            for(int i = 0; i< baseStr.length(); i++)
            {
                if(baseStr.substring(i,i+1).equals("1"))
                {
                    int temp = 1;
                    for(int j = 1; j<baseStr.length()-i;j++)
                    {
                        temp = 2*temp;
                    }
                    base10 = base10+temp;
                }
            }
            System.out.println(base10);
        }
        else if(base == 8)
        {
            System.out.println("Enter a number to convert to base 10");
            convert = in.nextInt();
            baseStr = Integer.toString(convert);

            for(int i = 0; i< baseStr.length(); i++)
            {
                int bb = Integer.parseInt(baseStr.substring(i,i+1));
                int temp = 1;
                for(int j = 1; j<baseStr.length()-i;j++)
                {
                    temp = 8*temp;
                }
                temp = temp*bb;
                base10 = base10+temp;
            }
            System.out.println(base10);
        }
        else
        {
            System.out.println("Invalid Base!!");
        }

    }
}
