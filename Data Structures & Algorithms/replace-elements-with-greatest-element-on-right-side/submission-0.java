class Solution {
    public int[] replaceElements(int[] arr) {
        int highestElement = arr[arr.length - 1];
        
        for (int i=arr.length-2; i>=0; i--) {
            int currentElement = arr[i];
            arr[i] = highestElement;
            highestElement = Math.max(highestElement, currentElement);
        }

        arr[arr.length - 1] = -1;

        return arr;
    }
}