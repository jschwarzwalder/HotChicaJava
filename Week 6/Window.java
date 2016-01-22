/**
 * Created by Jami on 9/30/2015.
 */
public class Window {
    private int width;
    private int height;

    //new Window()
    public Window(){
        width = 800;
        height = 600;
    }

    //new Window(1400, 1080);
    public Window(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getWidth(){
        return width; //return this.width
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String toString(){
        return width + " x " + height;
    }
}
