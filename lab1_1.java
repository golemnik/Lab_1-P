public class lab1_1 {
	public static void main (String args[]) {
	int g [] = new int [13];   //создали и объявили массив g размеров 13 чисел.
	for (int i = 0; i < 13; i++) {   // заполнили массив g от 5 до 17 включительно.
		g[i] = i+5;
	}
	double x [] = new double [16];
	for (int i = 0; i < x.length; i++) {
		x[i] = -2.001d + (Math.random() * 12.01d); 
		
		//мат функция random, позволяет генерировать в границах (0, 0.99...) Поэтому от числа x < -2 и до числа > 10 + x. 
		//разная точность чисел (2 и 3 знака после токи) берется специально, чтобы при получении наибольшего результата сверху (12.009..)
		// и вычитании нижней получилось число больше строгой границы 10. Для уменьшения погрешности случайности используюется разница в сотые доли числа.

		if (x[i] < -2.0d)  x[i] = -2.0d; // округление, для получения строгой границы -2.
		if (x[i] > 10.0d)  x[i] = 10.0d; // округление для строгой границы 10.
	}
	double b [][] = new double [13][16];
	double tempRes = 0; // для сохранения промежуточного результата;
	for (int i = 0; i < 13; i++) {
		for (int j = 0; j < 16; j++) {
			if (g[i] == 16) {
									 
				tempRes = Math.exp(x[i]);			 
				tempRes = Math.sin(Math.toRadians(tempRes));
				tempRes = Math.pow ((2/tempRes),3);
				b[i][j] = tempRes; tempRes = 0;	
			} else {
				if (g[i] ==7 || g[i] >= 12) {
					tempRes = Math.cos(Math.toRadians(x[i]));
					tempRes = Math.cos(tempRes);
					tempRes = Math.sin(tempRes); 
					b[i][j] = tempRes; tempRes = 0;
				} else {
					tempRes = Math.abs(x[i]);
					tempRes = Math.log(tempRes);
					tempRes = Math.cbrt(tempRes);
					tempRes = Math.sin(Math.toRadians(tempRes));
					tempRes = Math.asin(tempRes);
					b[i][j] = tempRes; tempRes = 0;
				}
			}
			System.out.printf("%(.5f|", b[i][j]); //вывод, чтобы не гонять двумерный массив 2 раза.
		}
		System.out.println("");
	}
	
	} //main ender
} //lab1 ender
