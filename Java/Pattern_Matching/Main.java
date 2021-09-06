// Pattern Matching

class Main
{
    public static void find(String text,String pattern) {
        
        int n=text.length();
        int m=pattern.length();
        int i=0;

        while(i<=n-m)
        {
            for(int j=0;j<m;j++)
            {
                if(text.charAt(i+j)!=pattern.charAt(j))
                {
                    break;
                }

                if(j==m-1)
                {
                    System.out.println("The pattern occurs at " + i);
                }
            }
            i++;
        }
        
        
    }

    public static void main(String[] args) {

        String text = "ABCABAABCABAC";
        String pattern = "CAB";
        find(text,pattern); 
    }
}