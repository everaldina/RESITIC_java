class Point {
    private:
        float x, y;

    public:
        Point(float x, float y) {
            this->x = x;
            this->y = y;
        }

        float getX() {
            return x;
        }

        float getY() {
            return y;
        }

        void setX(float newX) {
            x = newX;
        }

        void setY(float newY) {
            y = newY;
        }
};
