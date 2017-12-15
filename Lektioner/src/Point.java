
public class Point {
	private int x, y;
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
		
	public String toString(){
		String result = "("+this.x+","+this.y+")";
		return result;
	}
	
	
	public boolean equals(Point point){
		if(point.x == this.x && point.y==this.y)
			return true;
		else return false;
	}
	
	public void move(int dx, int dy){
		this.x += dx;
		this.y += dy;
	}
}
