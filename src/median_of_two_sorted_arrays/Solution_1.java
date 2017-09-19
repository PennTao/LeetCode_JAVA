class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i = 0, j = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        double res;
        while(i < len1 && j < len2) {
            if(nums1[i] <= nums2[j] ){
                list.add(nums1[i]);
                i++;
            } else {
                list.add(nums2[j]);
                j++;
            }
        }
        while(i < len1){
            list.add(nums1[i]);
            i++;
        }
        while(j < len2) {
            list.add(nums2[j]);
            j++;
        }
        if((len1 + len2) % 2 == 0){
            int index1 = (len1 + len2) / 2 - 1;
            int index2 = (len1 + len2) /2 ;
            return (list.get(index1) + list.get(index2)) / 2.0;
        }
        int index = (len1 + len2) / 2;
        return list.get(index);
    }
}
