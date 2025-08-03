class MaxSubArray{
    static int maxSubArray(int[] arr) {
        int maxSo=arr[0];
        int minSo=arr[0];
        for(int i=1;i<arr.length;i++){
            minSo=Math.max(arr[i],minSo+arr[i]);
            maxSo=Math.max(maxSo,minSo);
        }
        return maxSo;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        System.out.println(maxSubArray(arr));
            }
}