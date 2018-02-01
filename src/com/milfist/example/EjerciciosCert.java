package mik;

import java.util.regex.PatternSyntaxException;

public class EjerciciosCert {

	public static void main(String[] args) {
//		boolean keepGoing = true;
//		int count = 0;
//		int x = 3;
//		while (count++ < 3) {
//			int y = (1 + 2 * count) % 3;
//			switch(y) {
//				default:
//				case 0: 
//					x -= 1;
//					break;
//				case 1: 
//					x +=5;
//			}
//		}
//		System.out.println(x);
		
		
		if ("Miguel".charAt(0) > "Anguita".charAt(0)) {
			System.out.println("Yes!");
			
		}
		
		String a = "MiguelA".toLowerCase();
		
//		char p = 0;
//        char s = 0;      
//        char[] ar = a.toCharArray();
//        
//        for (int i = 0; i < ar.length -1; i++) {
//            
//            if (ar[i] > ar[i + 1]) {
//                
//                p = ar[i];
//                s = ar[i + 1];
//                
//                ar[i] = s;
//                ar[i + 1] = p;
//                
//                for(int ord = i; ord > 0; ord-- ) {
//                    
//                    if (ar[ord] < ar[ord - 1]) {
//                        p = ar[ord - 1];
//                        s = ar[ord];
//                
//                        ar[ord] = p;
//                        ar[ord - 1] = s;    
//                    }
//                    
//                }
//                
//                
//            }
//            
//        }
//
//        System.out.print(String.valueOf(ar));
		try {
		a.matches("batcatpat(nat");
		}catch (PatternSyntaxException e) {
			System.out.print("error");
		}
	}

}
