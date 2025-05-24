class Solution {
    public String frequencySort(String s) {

        if (s.length() <= 1) {
            return s;
        }
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        List<Character>[] arr1 = new ArrayList[s.length() + 1];
        StringBuilder ans = new StringBuilder();
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                if (arr1[count] == null) {
                    arr1[count] = new ArrayList<>();
                    addToArr(count, arr1[count], arr[i - 1]);

                } else {
                    addToArr(count, arr1[count], arr[i - 1]);
                }
                count = 1;
            } else {
                count++;
            }
        }

        if (arr1[count] == null) {
            arr1[count] = new ArrayList<>();
            addToArr(count, arr1[count], arr[arr.length - 1]);

        } else {
            addToArr(count, arr1[count], arr[arr.length - 1]);
        }

        for (int i = arr1.length - 1; i >= 0; i--) {
            if (arr1[i] == null) {
                continue;
            }
            for (Character a : arr1[i]) {
                ans.append(a);
            }
        }
        return ans.toString();

    }

    public void addToArr(int count, List<Character> arr, char val) {
        for (int i = 1; i <= count; i++) {
            arr.add(val);
        }
        return;
    }
}