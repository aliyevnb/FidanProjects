public class removeDublicates {

    public static int[] removeDublicates(int[] nums){
        int[] tmpA = new int[nums.length];

        int j = 0;

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] != nums[i+1]) {
                tmpA[j++] = nums[i];
            }
        }

        tmpA[j++] = nums[nums.length - 1];

        for(int i = 0; i < j; i++) {
            nums[i] = tmpA[i];
        }

       /* for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(i != j){
                    if(nums[i] != nums[j]) {
                        tmpA[j] = nums[i];
                    } else {
                        tmpA[j] = 0;
                    }
                }
            }
        }

        int countNulls = 0;



        for(int i = 0; i < tmpA.length; i++){
            if(tmpA[i] == 0) {
                countNulls++;
            }
        }

        System.out.println(countNulls);

        int[] tmpB = new int[tmpA.length - countNulls];

        for(int i = 0; i < tmpB.length; i++){
            tmpB[i] = tmpA[i];
        }

        return tmpA;*/
    }
}
