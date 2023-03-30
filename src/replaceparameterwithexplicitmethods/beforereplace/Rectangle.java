package replaceparameterwithexplicitmethods.beforereplace;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setValue(String attr, int value) {
        if (attr.equals("height")) {
            height = value;
            return;
        }

        if (attr.equals("width")) {
            width = value;
        }
    }
}
