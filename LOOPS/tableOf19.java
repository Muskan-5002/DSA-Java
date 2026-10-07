package LOOPS;

public class tableOf19 {
    public static void main(String[] args) {
        
        //(171 rounds)
        // for(int i=19;i<=190;i++){
        //     if(i%19==0)
        //     System.out.println(i);
        // }
        
        
        //10 rounds only (so this is effective)
        for(int i=19;i<=190;i+=19){
            System.out.println(i);
        }
    }
}
