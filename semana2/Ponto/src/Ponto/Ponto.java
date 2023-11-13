package Ponto;

public class Ponto {
    private float x, y;

    public Ponto(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Ponto() {
        this(0, 0);
    }
    public Ponto(Ponto p) {
        this(p.x, p.y);
    }

    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }

    public float distanciaOrigen(){
        return (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}
