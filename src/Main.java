public class Main {

    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        for(int i=0;i<num-1;i++){
            for(int j=num-i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<(i*2)+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("Stuti");
        for(int i=num-1;i>=0;i--){
            for(int j=num-i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<(i*2)+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
