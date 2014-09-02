package Algorithm.sort.swap;

import Algorithm.sort.Sort;
import Algorithm.sort.SortUtil;

/**
 * Created by never on 2014/9/1.
 *
 * 核心思想： 选择一个基准元素(通常是第一个或是最后一个），通过一趟排序将整个元素序列划分为左右两个子序列，左子序列所有元素都比基准元素小，右则
 * 比基准大，然后再分别对子序列进行如上排序。
 *
 * 时间复杂度： 平均nlog2n； 最差（有序序列，切选取第一个为基准）n(n-1)/2;
 *
 * 空间复杂度：递归的，需要一个栈存放每层递归调用的指针和参数，最理想调用层数log2（n+1），最坏是n-1次递归调用。
 *
 * 不稳定的，适合n较大时。
 */
public class QuickSort implements Sort {
    @Override
    public void sort(int[] array) {
        quicksort(array, 0 , array.length-1);
    }

    public void quicksort(int[] array, int low, int high) {
        if (low < high) {
            int partition = partition(array, low, high);
            quicksort(array, low, partition - 1);
            quicksort(array, partition + 1, high);
        }
    }

    public int partition(int[] array, int low, int high) {
        int pivot = array[low];

        while (low < high) {
            while (low < high && array[high] > pivot) {
                high--;
            }

            SortUtil.swap(array, low, high);

            while (low < high && array[low] < pivot) {
                low++;
            }

            SortUtil.swap(array, low, high);
        }

        return low;
    }
}
