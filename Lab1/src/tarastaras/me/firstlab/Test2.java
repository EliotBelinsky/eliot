package tarastaras.me.firstlab;

public class Test2 {

	public static void main(String[] args) {
        /*
           C2 = 1 -- "-"
           C3 = 1 -- "C = 1"
           C5 = 1 -- "/"
           C7 = 0 -- "byte"
        */
        double S = 0;
        final int C = 1;
        int a = -8;
        int b = -9;
        int n = -3;
        int m = -3;
        // byte i = (byte)a
        // byte j = (byte)b
        for (byte i = (byte)a; i <= n; i++) {
        	if(i==0) {
        		System.out.println("Eror");
        	}
            for (byte j = (byte)b; j <= m; j++) {
            	if(j==0) {
            		System.out.println("Eror");
            	}
                S += ((double)(i/j)/(double)(i-C));
            }
        }
        System.out.println(S);
    }

}
