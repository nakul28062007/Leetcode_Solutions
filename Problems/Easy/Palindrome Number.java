class Solution{
    public boolean isPalindrome(int x){
        if(x==0){
            return true;
        }
        else if(x<0){
            return false;
        }
        else{
        boolean result = false;
        int noOfDigits =0,element;
        int copy1_x= x;
        int copy2_x = x;

        while(copy1_x>0){
            copy1_x/=10;
            noOfDigits++;
        }
        int l1[] = new int[noOfDigits];
        for(int i = 0 ; i<noOfDigits; i++){
            element = copy2_x%10;
            //System.out.println(element);
            copy2_x/=10;
            l1[i]=element;
        }
        //l1[noOfDigits-1]=copy2_x;
        for(int j = 0 ; j<noOfDigits ; j++){
            if(l1[j]==l1[(noOfDigits-j)-1]){
                result = true;
            }else{return false;}
        }
        return result;}
    }
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println("Output = "+obj.isPalindrome(1000021));
    }
}

