package exam01;

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5,10,20,30};

        int[] answer=new int[nums.length];
        System.out.println(Arrays.toString(answer));//answer[]가 잘 생성되었는지 확인
        for(int i=0;i<nums.length;i++){
            answer[i]=nums[(nums.length)-i-1];
        }
        System.out.println(Arrays.toString(answer));
    }
}
