public class pattern5 
{
    public static void main(String[] args) {
        int n=7;
        for(int a=1;a<=n;a++){

                for(int b=1;b<a;b++){
                System.out.print(" ");
            }
            for(int b=a;b<=n;b++){
                System.out.print(" "+b);
            }

            System.out.println(" ");
        }



        //=============>>>>.

        for (int i = n - 1; i >= 1; i--) {
            
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
    }

    
}
