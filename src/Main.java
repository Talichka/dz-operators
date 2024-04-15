public class Main {
    public static void main(String[] args) {
        int a = 35;
        int b = 10;
        int c = 25;
        int d = 20;

        int sum1 = a+b;
        int sum2 = c+d;

               if (sum1 >= sum2) {

            System.out.println(sum1 >= sum2);
            }
        sum1 += 1;
        sum2 -= 2;
if (sum1 > sum2) {System.out.println(sum1 > sum2);}
        //System.out.println(sum1 %2 == 0 || sum2 % 2 ==0 ? true : false);
        boolean result = (sum1 % 2 == 0) || (sum2 % 2 == 0);
        System.out.println(result);
        System.out.println(result && false);


//if (sum1 %2 == 0 || sum2 % 2 ==0)
//{System.out.println("true2");}
//else
//{System.out.println("false");}
    }
}