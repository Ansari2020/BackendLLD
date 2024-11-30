package DSA;

public class TrappedRainWater {
    public static void main(String[] args) {
        int arr[]={2, 1, 5, 3, 1, 0, 4};

        int left[]=new int[arr.length];
        left[0]=arr[0];
        int right[]=new int[arr.length];
        right[arr.length-1]=arr[arr.length-1];

        int ans=0;
        for(int i=1;i<arr.length;i++){
            left[i]=Math.max(left[i-1],arr[i]);

        }
        for(int i=arr.length-2;i>=0;i--){
            right[i]=Math.max(right[i+1],arr[i]);
        }

        int water=0;
        for(int i=1;i<arr.length-1;i++){
            water=Math.min(left[i-1],right[i+1])-arr[i];
            if(water>0){
                ans+=water;
            }
        }
        System.out.println(ans);



    }
}
