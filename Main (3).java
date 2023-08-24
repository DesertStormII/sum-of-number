public class Main
{
    public static int Devision(int num){
        if(num > 0 && num < 10){
            int a;
            a = num % 10;
            System.out.println(" Are you really it's "+ a);
            
        }
        else if(num >= 10 && num < 100){
            int a, b,equal;
            a = num % 10;
            b = num / 10;
            equal = a + b;
            System.out.println(" Sum of numbers " + num + " equal "+ equal);
        }
        else if(num >= 100 && num < 1000){
            int a, b, c, equal;
            a = num % 10;
            b = num / 10 % 10;
            c = num / 100;
            equal = a + b + c;
            System.out.println(" Sum of numbers " + num + " equal "+ equal);
        }
        else if (num >= 1000 && num < 10000){
            int a, b, c, d, equal;
            a = num % 10;
            b = num / 10 % 10;
            c = num / 100 % 10;
            d = num / 1000;
            equal = a + b + c + d;
            System.out.println(" Sum of numbers " + num + " equal "+ equal);
        }
        return 0;
    };
    public static void main(String[] args) {
        int number;
        System.out.println(Devision(1234));
    }
}