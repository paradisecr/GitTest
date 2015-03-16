package ab;

import java.util.HashMap;
import java.util.Map;

public class Main {
//	public static Map<Integer, Integer>  trueMap = new HashMap<Integer, Integer>();
//	public static Map<Integer, Integer>  trueMap = new HashMap<Integer, Integer>();
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		System.out.println(function(800,1500));
	}
	
public static boolean function(int a, int b){
	if(isWin(a, b)) return true;
	
	for(int i = 1; canA(a,b,i); i++){
		if(!function(a-i, b-i)){
			return true;
		}
	}
	for(int i = 1; canBa(a ,b,i); i++){
		if(!function(a-i, b)){
			return true;
		}
	}
	for(int i = 1; canBb(a ,b,i); i++){
		if(!function(a, b - i)){
			return true;
		}
	}
	return false;
	//return !((canA(a, b)&&function(--a,--b)) || (canBa(a, b)&&function(0, b)) || (canBb(a, b)&&function(a, 0)));
}

public static boolean isWin(int a,int b){
	if(a == b ) return true;
	if(a==0 || b==0) return true;
	return false;
}

/**
 * a--
 * b--
 * @param a
 * @param b
 * @return
 */
public static boolean canA(int a,int b,int t){
	if(a==0 || b==0) return false;
	if(t>a || t>b) return false;
	return true;
}

/**
 * clear a
 * @param a
 * @param b
 * @return
 */
public static boolean canBa(int a,int b,int t){
	if(t>a) return false;
	return true;
}
/**
 * clear b
 * @param a
 * @param b
 * @return
 */
public static boolean canBb(int a,int b,int t){
	if(t>b) return false;
	return true;
}
}
