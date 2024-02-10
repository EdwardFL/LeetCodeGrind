package FindTheHighestAltitude;

public class Solution {

    // gain = [-5, 1, 5, 0, -7]
    // starts on altitude 0
    // altitudes [0, altitudes[i] + gain[i], altitudes[i+1] + gain[i+1]
    // [0, 0 + (-5), -5 + 1, -4 + 5, 1 + 0, 1 + (-7)

    public static int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int currentAltitude = 0;

        for (int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i];
            if (maxAltitude < currentAltitude) {
                maxAltitude = currentAltitude;
            }
        }
        return maxAltitude;
    }

    public static void main(String[] args) {
        int[] array = {-5, 1, 5, 0, -7};
        System.out.println(largestAltitude(array));
    }
}
