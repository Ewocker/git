//---------------------------------------------------
// Name:	Lin, Yu-An
// CruzID:	ylin62
// Class:	CMPS12B
// Description:
//	Extrema.java find the maximun or minimun
//	of a set of int array.
// Special Instructions:
//	None
//----------------------------------------------------
public class Extrema{
	public static void main(String[] args){
		int[] B = { -1, 2, 6, 3, 9, 2, -3, -2, 11, 5, 7 };
		System.out.println( "max = " + maxArray(B, 0, B.length-1) );
		System.out.println( "min = " + minArray(B, 0, B.length-1) );
	}
	
	static int maxArray( int[] A, int p, int r){
		int q = (p+r)/2;
		if(r == p){ return A[p]; }
		int a = maxArray( A, p, q );
		int b = maxArray( A, q+1, r);
		if(a > b){ return a;} else {return b;} 
	}
	
	static int minArray(int[] A, int p, int r){
		int q = (p+r)/2;
		if(r == p){ return A[p]; }
		int a = minArray( A, p, q );
		int b = minArray( A, q+1, r);
		if(a > b){return b;} else {return a;} 
	}

}

