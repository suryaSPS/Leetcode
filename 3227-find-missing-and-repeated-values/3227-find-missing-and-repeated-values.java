class Solution {

    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long sum = 0, sqrSum = 0;
        long n = grid.length;
        long total = n * n;

        for (int row = 0; row < n; ++row) {
            for (int col = 0; col < n; ++col) {
                sum += grid[row][col];
                sqrSum += (long) grid[row][col] * grid[row][col];
            }
        }


        long sumDiff = sum - (total * (total + 1)) / 2;
        long sqrDiff = sqrSum - (total * (total + 1) * (2 * total + 1)) / 6;

        // Using math: If x is repeated and y is missing
        // sumDiff = x - y
        // sqrDiff = x² - y²
        int repeat = (int) (sqrDiff / sumDiff + sumDiff) / 2;
        int missing = (int) (sqrDiff / sumDiff - sumDiff) / 2;

        return new int[] { repeat, missing };
    }
}