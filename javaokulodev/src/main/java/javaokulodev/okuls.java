package javaokulodev;

import java.util.Scanner;

public class okuls {

	public static void main(String[] args) {
		
		int n, brky = 0, brkym = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Eleman Sayisini Giriniz");
        n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Sayilari Giriniz:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            if(a[i] % 2 == 0)
            {
            	brky = brky + a[i];
            }
            else
            {
            	brkym = brkym + a[i];
            }
        }
        System.out.println("Cift sayilerin toplami:"+brky);
        System.out.println("Tek sayilerin toplami :"+brkym);
		
		

	}

}
