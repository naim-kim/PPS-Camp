import java.util.*;

public class a014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        if (input.length == 1 && input[0].equals("")) {
            System.out.println("[]");
            return;
        }

        int[] nums = new int[input.length];
        for (int i = 0; i < input.length; i++)
            nums[i] = Integer.parseInt(input[i]);

        List<String> res = new ArrayList<>();
        int start = nums[0];

        for (int i = 1; i <= nums.length; i++) {
            if (i == nums.length || nums[i] != nums[i - 1] + 1) {
                if (start == nums[i - 1])
                    res.add(String.valueOf(start));
                else
                    res.add(start + "->" + nums[i - 1]);
                if (i < nums.length)
                    start = nums[i];
            }
        }

        System.out.println(res);
    }
}