class Solution {
    public void reverseString(char[] s) {
        
       reverseByRecursion(s, 0, s.length-1 );
        
    }
    
    public void reverseByRecursion(char[] s, int l, int r){
        //base case
        if(l > r)
            return;
        //recursive call
        char temp = s[l];
        s[l] = s[r];
        s[r] = temp;
        reverseByRecursion(s, l+1, r-1);
    }
}