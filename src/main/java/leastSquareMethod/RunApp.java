package leastSquareMethod;

import leastSquareMethod.solution.Solution;

public class RunApp {
	public static void main(String[] args) {
		System.out.println("Yuklenme");
		Solution solution = new Solution();
		System.out.println("b emsalinin hesablanmis qiymeti = " + solution.bFind());
		System.out.println("a emsalinin hesablanmis qiymeti = " + solution.aFind());
		System.out.println("Melumatlarin diske yazilmasi");
		solution.writeResult();
		System.out.println("Hesablamanin sonu");
	}
}