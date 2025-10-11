
public class MountainArray {

    public static void main(String[] args) {
        // int ans = peakIndexInMountainArray();

    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                //you are in descending part of array
                //this may be the ans , but look at left
                //this is why end != mid -1
                end = mid;
            } else {
                start = mid + 1;
            }

        }
        // in the end , start == end and pointing to the largest number bcoz of the two checks 
        return start;
    }
}
