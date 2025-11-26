class Solution {
    public int minPlatform(int arr[], int dep[]) 
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0, j=0, plat=0, res=0, n=arr.length;
        while(i<n && j<n)
        {
            if(arr[i]<=dep[j])
            {
                plat++;
                i++;
            }
            else
            {
                plat--;
                j++;
            }
            res=(int)Math.max(plat,res);
        }
        return res;
        //  code here
        
    }
}
