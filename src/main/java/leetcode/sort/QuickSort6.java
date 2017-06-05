package leetcode.sort;

/**
 * Created by Joshua on 6/3/17.
 */
public class QuickSort6 {

    public static void sort(int[] ary, int left, int right) {
        if (left >= right) {
            return;
        }

        int cursor = left;
        int pivot = right;

        while (cursor != pivot) {
            if (cursor < pivot && ary[cursor] > ary[pivot]) {
                swap(ary, cursor, pivot);
                int tmp = cursor;
                cursor = pivot;
                pivot = tmp;
            }

            if (cursor > pivot && ary[cursor] < ary[pivot]) {
                swap(ary, cursor, pivot);
                int tmp = cursor;
                cursor = pivot;
                pivot = tmp;
            }

            if (cursor < pivot) {
                cursor ++;
            }
            if (cursor > pivot) {
                cursor --;
            }

        }
        sort(ary, left, pivot-1);
        sort(ary, pivot+1, right);
    }

    private static void swap(int[] ary, int left, int right) {
        int tmp = ary[left];
        ary[left] = ary[right];
        ary[right] = tmp;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{3, 0, 1, 8, 7, 2, 5, 4, 9, 6};
        sort(nums, 0, nums.length - 1);
        System.out.println(" ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}
