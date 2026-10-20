public class Third {
    public static void main(String[] args) {
        demoIFElse(34);
        demoLadderIFElse(86);
        demoSwitch(12,6,'*');
    }

    public static void demoIFElse(int age){
       if(age>=18){
        System.out.println("you can vote");
       }
       else{
        System.out.println("you can't vote");
       }
    }
    public static void demoLadderIFElse(int marks){
        if(marks>90 && marks<=100){
            System.out.println("Grade Excellent");
        }
        else if(marks>80 && marks<=90){
            System.out.println("Grade Outstanding");
        }
        else if(marks>70 && marks<=80){
            System.out.println("Grade A");
        }
        else if(marks>60 && marks<=70){
            System.out.println("Grade B");
        }
        else if(marks>50 && marks<=60){
            System.out.println("Grade C");
        }
        else if(marks>40 && marks<=50){
            System.out.println("Grade D");
        }
        else if(marks>30 && marks<=40){
            System.out.println("Grade E");
        }
        else if(marks<30){
            System.out.println("FAIL");
        }
        else{
            System.out.println("Invalid Input");
        }
    }

    public static void demoSwitch(int a,int b,char ops){

        switch(ops){
             case '+':
             System.out.println(a+b);
             break;
             case '-':
             System.out.println(a-b);
             break;
             case '*':
             System.out.println(a*b);
             break;
             case '/':
             System.out.println(a/b);
             break;
             default:
             System.out.println("Invalid Operator");
        }
    }
}
