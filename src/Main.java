public class Main {

    public static void main(String[] args) {
//        IntStream.iterate(1, i -> i < 100, i -> i + 1).forEach(System.out::println);


        int[] nums = new int[]{2, 1, 5, 6, 3, 4};
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j);
                }
            }
        }


        printLog(nums);
    }

    private static void printLog(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i]);
            if (i != nums.length - 1) {
                sb.append(",");
            }
        }

        System.out.println(sb);
    }

    private static void swap(int[] nums, int j) {
        int temp = nums[j];
        nums[j] = nums[j + 1];
        nums[j + 1] = temp;
    }

}