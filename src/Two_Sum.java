import java.util.Arrays;

public class Two_Sum {
        public static int[] twoSum(int[] nums, int target) {
            for(int i =0;i<nums.length;i++){
                for(int j =i+1 ;j<nums.length;j++){
                    if(nums[i] + nums[j]==target){
                        return new int[] {i,j};
                    }
                }
            }
            return null;

        }
    public static void main(String[] args) {
            int [] arr1={1,2,3,3,5};
            int target = 5;
            System.out.println(Arrays.toString(twoSum(arr1, target)));

        }
    }


