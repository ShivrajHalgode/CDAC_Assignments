class UninitializedValues
{	
byte a;
short b;
int c;
long d;
float e;
double f;
char g;
boolean h;
	public static void main(String args[]){
		
	UninitializedValues v = new UninitializedValues();
		System.out.println("Byte:"+ v.a);
		System.out.println("Short:"+ v.b);
		System.out.println("Int:"+ v.c);
		System.out.println("Long:"+ v.d);
		System.out.println("Float:"+ v.e);
		System.out.println("Double:"+ v.f);
		System.out.println("Char:"+ v.g);
		System.out.println("Boolean:"+ v.h);		
	
		
}
}