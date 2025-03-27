import java.util.Scanner;
     public class SimpleCalculator{
            public static void main(String[] args){
            Scanner scanner=new scanner(System.in);
            System.out.print("Enter first number:");
            double num1=Scanner.next.Double();
            System.out.print("Enter second number:");
            double num2=Scanner.next.Double();
            System.out.print("choose operation(+,-,*,/):");
            char operation=Scanner.next().charAt(0);
            double result=0;
            switch(operator){
                case "+":
                   result=num1+num2;
                     break;
                case "-":
                    result=num1-num2;
                      break;
                case "*":
                   result=num1*num2;
                      break;
                case "/":
                   if(num2!=0){
                      result=num1/num2;
                   } else {
                   System.out.println("invalid operator");
                     return;
                   }
                   System.out.println("the result is:"+result);
	}
}