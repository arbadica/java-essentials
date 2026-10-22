public class Fourth {
    
    public static void main(String[] args) {
        demoforLoop(10);
        demowhileLoop(10);
        demodowhileLoop(10);
    }

    public static void demoforLoop(int n){
        System.out.println("For Loop");
        for(int i=1;i<=n;i++){
          System.out.println(i+" ");
        }
    }
    public static void demowhileLoop(int n){
        System.out.println("While Loop");
        int i=1;
        while(i<=n){
           System.out.println(i+" "); 
           i++;
        }
    }

    public static void demodowhileLoop(int n){
      
        System.out.println("Do While Loop");
        int i=1;

        do{
      System.out.println(i+" ");
       i++;
        }while(i<=n);
    }
}
