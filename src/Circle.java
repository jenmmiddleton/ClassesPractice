public class Circle {

    private int x, y, radius;

    private Circle (int originX, int originY) {
        x = originX;
        y = originY;
        radius = 1;
    }

    private Circle (int originX, int originY, int originRadius) {
        x = originX;
        y = originY;
        radius = originRadius;
    }

    public void setOrigin (int originX, int originY) {
        x = originX;
        y = originY;
    }

    private int getX () {
        return x;
    }

    private int getY () {
        return y;
    }
    private int getRadius () {
        return radius;
    }

    private void setX (int newX) {
        x = newX;
    }

    private void setY (int newY) {
        y = newY;
    }

    //This method is from the Lesson
    public void moveCircle(Circle circle, int deltaX, int deltaY) {
        // code to move origin of circle to x+deltaX, y+deltaY
        circle.setX(circle.getX() + deltaX);
        circle.setY(circle.getY() + deltaY);

        System.out.println("PART ONE\n" + "X: " + circle.getX() + "\nY: " + circle.getY() + "\nRadius: " + circle.getRadius());

        // code to assign a new reference to circle
        circle = new Circle(0, 0);

        System.out.println("PART TWO\n" + "X: " + circle.getX() + "\nY: " + circle.getY() + "\nRadius: " + circle.getRadius());
    }


    public void main(String[] args) {
        Circle myCircle = new Circle(15, 10, 25);

        System.out.println("PART A\n" + "X: " + myCircle.getX() + "\nY: " + myCircle.getY() + "\nRadius: " + myCircle.getRadius());

        //This line is from the Lesson
        moveCircle(myCircle, 23, 56);

        System.out.println("PART B\n" + "X: " + myCircle.getX() + "\nY: " + myCircle.getY() + "\nRadius: " + myCircle.getRadius());


        moveCircle(myCircle, 30, 50);
    }
}
