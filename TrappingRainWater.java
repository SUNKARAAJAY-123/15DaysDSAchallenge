 class TrappingRainWater {
    public int trap(int[] height) {
        int len = height.length;
        int[] left = new int[len];
        left[0] = height[0];

        // Calculate left max
        for (int i = 1; i < len; i++) {
            left[i] = Math.max(height[i], left[i - 1]);
        }

        int[] right = new int[len];
        right[len - 1] = height[len - 1];

        // Calculate right max
        for (int i = len - 2; i >= 0; i--) {
            right[i] = Math.max(height[i], right[i + 1]);
        }

        int water = 0;
        // Calculate trapped water
        for (int i = 0; i < len; i++) {
            water += Math.min(left[i], right[i]) - height[i];
        }

        return water;
    }

    public static void main(String[] args) {
        TrappingRainWater sol = new TrappingRainWater();

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1}; // Example input
        int result = sol.trap(height);

        System.out.println("Total trapped water: " + result);
    }
}
