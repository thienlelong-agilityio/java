public class Triangle {
	private int width;
	private int height;

	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getArea() {
		return width*height/2;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}