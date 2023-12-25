public class Pattern {
    public static void main(String[] args) {
        int n=7;
        String s="";
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                s+=" ";
            }
            for( int k=0; k<(n-i) *2-1;k++){
                s+="*";
            }
            s+="\n";
        }
        System.out.println(s);
    }

}
