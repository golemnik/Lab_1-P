public class Lab {
	static int g [];   //создали и объявили массив g размеров 13 чисел. 
	static double x []; //создали и объявили массив x размеров 16 дробных чисел.
	static double b [][]; //создали и объявили двумерный массив размером 13х16.
	
	public static double mathCalculationsTypeOne (double x) { //первый вариант математического подсчета.
		double calculationResult = 0;
		calculationResult = Math.exp(x);			 
		calculationResult = Math.sin(Math.toRadians(calculationResult));
		calculationResult = 2/calculationResult;
		calculationResult = Math.pow (calculationResult,3);
		return calculationResult;
	}
	public static double mathCalculationsTypeTwo (double x) {
		double calculationResult = 0;
		calculationResult = Math.cos(Math.toRadians(x));
		calculationResult = Math.cos(calculationResult );
		calculationResult = Math.sin(calculationResult ); 
		return calculationResult;
	}
	public static double mathCalculationsTypeThree (double x) {
		double calculationResult = 0;
		calculationResult = Math.abs(x);
		calculationResult = Math.log(calculationResult );
		calculationResult = Math.cbrt(calculationResult );
		calculationResult = Math.sin(Math.toRadians(calculationResult ));
		calculationResult = Math.asin(calculationResult );
		return calculationResult;
	}
	
	public static void gArrayFill () {
		g = new int [13];   //создали и объявили массив g размеров 13 чисел. 
		for (int i = 0; i < 13; i++) {   // заполнили массив g от 5 до 17 включительно.
			g[i] = i+5;
		}
	}	

	public static void xArrayFill () {
		x = new double [16]; //создали и объявили массив x размеров 16 дробных чисел.
		for (int i = 0; i < x.length; i++) {
			x[i] = -2.001d + (Math.random() * 12.01d); 

			//мат функция random, позволяет генерировать в границах (0, 0.99...) Поэтому от числа x < -2 и до числа > 10 + x. 
			//разная точность чисел (2 и 3 знака после токи) берется специально, чтобы при получении наибольшего результата сверху (12.009..)
			// и вычитании нижней получилось число больше строгой границы 10. Для уменьшения погрешности случайности используюется разница в сотые доли числа.

			if (x[i] < -2.0d)  x[i] = -2.0d; // округление, для получения строгой границы -2.
			if (x[i] > 10.0d)  x[i] = 10.0d; // округление для строгой границы 10.
		}
	}
	
	static void showArr (double arr [][]) {
		for (int i = 0; i < arr.length; i++ ) {
			for (int j = 0; j < arr[i].length; j++ ) {
				System.out.format("%8.5f |", arr[i][j]);
			}
			System.out.println("");
		}
	}
	
	public static void taskExecution () {
		gArrayFill();
		xArrayFill();
		b = new double [13][16]; //создали и объявили двумерный массив размером 13х16.
		for (int i = 0; i < 13; i++) {
			for (int j = 0; j < 16; j++) {
				if (g[i] == 16) {
					b[i][j] = mathCalculationsTypeOne (x[j]);
				} else {
					if (g[i] ==7 || g[i] ==17 || ( g[i] >= 12 && g[i] <= 15)) {
						b[i][j] = mathCalculationsTypeTwo (x[j]);
					} else {
						b[i][j] = mathCalculationsTypeThree (x[j]);
					}
				}
			}
		}
		showArr(b);
	}

	public static void main (String args[]) {
		taskExecution();
	} //main ender
	

} //lab1 ender
