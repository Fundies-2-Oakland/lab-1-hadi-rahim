public class Vector3D {
    double x;

    public double getX() {
        return x;
    }

    double y;

    public double getY() {
        return y;
    }

    double z;

    public double getZ() {
        return z;
    }

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", x, y, z);
    }

    public double getMagnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector3D normalize() {
        double magnitude = getMagnitude();
        if (magnitude == 0.0) {
            throw new IllegalStateException("Cannot normalize.");
        }
        return new Vector3D(x / magnitude, y / magnitude, z);
    }
    

}


