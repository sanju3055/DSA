class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        List<int[]> cells = new ArrayList<>();
        
        // Step 1: Generate all coordinates
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                cells.add(new int[]{i, j});
            }
        }
        
        // Step 2: Sort by Manhattan distance
        Collections.sort(cells, (a, b) -> {
            int distA = Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter);
            int distB = Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter);
            return distA - distB;
        });
        
        // Step 3: Convert list to array
        int[][] result = new int[cells.size()][2];
        for(int i = 0; i < cells.size(); i++){
            result[i] = cells.get(i);
        }
        return result;
    }
}