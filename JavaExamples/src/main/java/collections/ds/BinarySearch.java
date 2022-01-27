package collections.ds;

public class BinarySearch {

    public static int search(int a[], int start, int end, int data) {
        int mid = start + (end - start) / 2;
        if (a[mid] == data) return mid;
        else if (a[mid] < data) { return search(a, mid+1, end, data); }
        else if (a[mid] > data) { return search(a, start, mid-1, data); }

        return -1;
    }

    public static void main(String a[]) {
        int s[] = {1,2,3,4,5,6,8};
        System.out.println(search(s, 0, s.length, 8));
    }

}
