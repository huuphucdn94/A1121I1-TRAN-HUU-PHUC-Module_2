package ss6_Inheritance.Exercise.PointAndMoveAblePoint;

public class MoveAblePoint extends Point{
    private float xSpeak =0.0f;
    private float ySpeak =0.0f;

    public MoveAblePoint(float x, float y, float xSpeak, float ySpeak) {
        super(x, y);
        this.xSpeak = xSpeak;
        this.ySpeak = ySpeak;
    }

    public MoveAblePoint(float xSpeak, float ySpeak) {
        this.xSpeak = xSpeak;
        this.ySpeak = ySpeak;
    }
    public MoveAblePoint(){
    }

    public float getXSpeak() {
        return xSpeak;
    }

    public void setXSpeak(float xSpeak) {
        this.xSpeak = xSpeak;
    }

    public float getYSpeak() {
        return ySpeak;
    }

    public void setYSpeak(float ySpeak) {
        this.ySpeak = ySpeak;
    }
    public void setSpeak(float xSpeak, float ySpeak){
        this.xSpeak = xSpeak;
        this.ySpeak = ySpeak;
    }
    /*
    public float[]getSpeak(){
        float[]moveArr = {this.xSpeak, this.ySpeak};
        return moveArr;
    }
    */
    public float[]getSpeak(){
        float[]moveArr = new float[2];
        moveArr[0]= this.xSpeak;
        moveArr[1]= this.ySpeak;
        return moveArr;
    }

    @Override
    public String toString() {
        return super.toString() + "MoveAblePoint{" +
                "xSpeak=" + xSpeak +
                ", ySpeak=" + ySpeak +
                '}';
    }
    public MoveAblePoint move(){
        xSpeak = getX() + xSpeak;
        ySpeak = getY() + ySpeak;
        return this;
    }
}
