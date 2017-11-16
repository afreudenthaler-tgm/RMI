/**
 * 
 */
package client;

import java.io.Serializable;
import java.math.BigDecimal;

import compute.Task;

/**
 * @author armin
 *
 */
public class Fibo implements Task<BigDecimal>, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 227L;
	
	private final int number;
	
	public Fibo(int number){
		this.number = number;
	}
	
	
	public BigDecimal fibonacci(int n)  {
	    if(n == 0)
		      return BigDecimal.ZERO;
	    if(n == 1)
		      return BigDecimal.ONE;
		  
	   return fibonacci(n - 1).add(fibonacci(n - 2));
	}

	@Override
	public BigDecimal execute() {
		// TODO Auto-generated method stub
		return fibonacci(number);
	}
}
