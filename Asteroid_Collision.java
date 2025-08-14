class Asteroid_Collision {
    public int[] asteroidCollision(int[] asteroids) {
        int top = -1; 
        
        for (int asteroid : asteroids) {
            boolean destroyed = false;
            while (top >= 0 && asteroids[top] > 0 && asteroid < 0) {
                if (Math.abs(asteroid) > asteroids[top]) {
                    top--;
                    continue;
                } else if (Math.abs(asteroid) == asteroids[top]) {
                    top--;
                }
                destroyed = true;
                break;
            }
            if (!destroyed) {
                asteroids[++top] = asteroid;
            }
        }
        
        int[] result = new int[top + 1];
        System.arraycopy(asteroids, 0, result, 0, top + 1);
        return result;
    }

    public static void main(String[] args) {
        Asteroid_Collision sol = new Asteroid_Collision();
        int[] asteroids = {5, 10, -5};
        int[] result = sol.asteroidCollision(asteroids);
        for (int val : result) {
            System.out.print(val + " ");
        }
        // Output: 5 10
    }
}
