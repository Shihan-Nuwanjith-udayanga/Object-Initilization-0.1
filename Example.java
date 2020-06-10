class Box{
	int length;
	int width;
	int height;
	
	Box(){
		length=1;
		width=1;
		height=1;
		System.out.println("Box()");
	}
	public void printVolume(){
		int volume=length*width*height;
		System.out.println("Volume of the box : "+volume);
	}
	public void setSize(int length, int width, int height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
}
class Example{
	public static void main(String args[]){
		Box b1=new Box();
		b1.printVolume();
		
		Box b2=new Box();
		b2.printVolume();
	}
}
