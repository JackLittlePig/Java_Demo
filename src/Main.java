import jdk.nashorn.internal.objects.NativeUint8Array;

public class Main {

    //https://www.cnblogs.com/morethink/p/8419151.html


    public static void main(String[] args) {
//        IntStream.iterate(1, i -> i < 100, i -> i + 1).forEach(System.out::println);


        int[] nums = new int[]{2, 1, 5, 6, 3, 4};

//        bubbleSort(nums);

//        selectionSort(nums);

//        insertSort(nums);
//
//        printLog(nums);


        heapSort();
    }


    /**
     * 堆排序
     */
    private static void heapSort() {



    }


    /**
     * 直接插入排序
     *
     * @param nums
     */
    private static void insertSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = key;
        }
    }


    /**
     * 冒泡排序
     *
     * @param nums
     */
    private static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }


    /**
     * 选择排序
     *
     * @param nums
     */
    private static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
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

}