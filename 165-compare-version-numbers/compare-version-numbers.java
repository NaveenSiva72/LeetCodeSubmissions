class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int i = 0;
        while (i < v1.length && i < v2.length) {
            long a = convertToInt(v1[i]);
            long b = convertToInt(v2[i]);
            if (a < b) {
                return -1;
            } else if (a > b) {
                return 1;
            }
            i++;
        }
        if (i == v1.length && i < v2.length) {
            for (; i < v2.length; i++) {
                if (convertToInt(v2[i]) != 0) {
                    return -1;
                }
            }
        } else if (i == v2.length && i < v1.length) {
            for (; i < v1.length; i++) {
                if (convertToInt(v1[i]) != 0) {
                    return 1;
                }
            }
        }

        return 0;
    }

    public long convertToInt(String version) {
        long ans = 0;
        for (int i = 0; i < version.length(); i++) {
            ans = (ans * 10) + Integer.parseInt(version.charAt(i) + "");
        }
        return ans;
    }
}