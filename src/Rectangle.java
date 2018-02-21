
public class Rectangle {
int length;
int width;

public Rectangle(int length2, int width2){
	length = length2;
	width = width2;
}
public int getArea(){
	int area = (length * width);
	return area;
}
public int getPerimeter(){
	int perimeter = 2 * (length + width);
	return perimeter;
}

}
