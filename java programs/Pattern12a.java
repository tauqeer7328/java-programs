public class Pattern12a {
    public static void main(String[] args){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j>i && j<2*n)
                System.out.print(" *");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
