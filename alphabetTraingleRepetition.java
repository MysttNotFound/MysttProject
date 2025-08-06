public class alphabetTraingleRepetition {
    public static void main(String[] args){
        int n=4;
        for(int i=0; i<=n; i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
         
        
        for(char ch = 'A'; ch<'A'+ i ; ch++){
            System.out.print(ch);
        }
        
         for(char ch = (char)('A' + i); ch >= 'A'; ch--){
                System.out.print(ch);
        }
        System.out.println();

    }
    
}
}