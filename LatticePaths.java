import java.math.*;
public class LatticePaths{
	public static void main(String[] args)throws Exception{
		int gridSize = Integer.parseInt(args[0]);
		BigInteger nom = new BigInteger("1");
		for(int i=gridSize*2;i>0;i--){
			nom = nom.multiply(new BigInteger(Integer.toString(i)));
		}
		BigInteger denom = new BigInteger("1");
		for(int i=gridSize;i>0;i--){
			denom=denom.multiply(new BigInteger(Integer.toString(i)));
		}
		denom = denom.multiply(denom);
		BigInteger answer = nom.divide(denom);
		System.out.println(answer);
	}
}