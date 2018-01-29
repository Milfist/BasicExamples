import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Double n = (double) (3/6);
		System.out.println(n);
		
		BigDecimal value = new BigDecimal(n);
		value.setScale(4);
		System.out.println(value);
		int[] m = new int[3];
		
		m[2] = 1;
		m[1] = 2;
		m[0] = 3;
		
		Arrays.sort(m);
		
		m.clone()
	}

}
