package EY_2308;

class Shape222 {
	
	public int area() {
		return 1;
	}



class Square222 {
		public int area() {
			return 2;
		}
	}

class Main {

	public void main(String[] args) {
		
		Shape222 shape = new Shape222();
		Square222 square = new Square222();
	//	shape=square;
		System.out.println(shape.area());
	}
		

	}

}
