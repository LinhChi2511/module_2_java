package ss13_SearchingAlgorithms.thuc_hanh_1;

public class BinarySearch {
    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if (list[mid] == key) {
                return mid;
            } else if (list[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] list = {2,4,6,7,11,45,50,53,55,66,69,70,72};
        System.out.println(binarySearch(list,2));
        System.out.println(binarySearch(list,50));
        System.out.println(binarySearch(list,77));
        System.out.println(binarySearch(list,41));
    }
}
