class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        
        // If starting pixel already has the target color, nothing to do
        if (originalColor == color) return image;
        
        // Call DFS helper
        dfs(image, sr, sc, originalColor, color);
        return image;
    }
    
    private void dfs(int[][] image, int r, int c, int originalColor, int newColor) {
        // Check boundaries
        if (r < 0 || c < 0 || r >= image.length || c >= image[0].length) return;
        
        // If current pixel is not the original color, stop
        if (image[r][c] != originalColor) return;
        
        // Fill with new color
        image[r][c] = newColor;
        
        // Recurse in 4 directions
        dfs(image, r + 1, c, originalColor, newColor); // down
        dfs(image, r - 1, c, originalColor, newColor); // up
        dfs(image, r, c + 1, originalColor, newColor); // right
        dfs(image, r, c - 1, originalColor, newColor); // left
    }
}
