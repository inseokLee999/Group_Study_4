package exam01;

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5,10,20,30, 100};
//        새로운 배열을 만들어서 reverse 값 대입
//        int[] answer=new int[nums.length];
//        System.out.println(Arrays.toString(answer));//answer[]가 잘 생성되었는지 확인
//        for(int i=0;i<nums.length;i++){
//            answer[i]=nums[(nums.length)-i-1];
//        }
        //기존 배열의 값들을 reverse
        for(int i=0;i<(nums.length)/2;i++){
            int temp=nums[i];
            nums[i]=nums[nums.length-i-1];
            nums[nums.length-i-1]=temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
