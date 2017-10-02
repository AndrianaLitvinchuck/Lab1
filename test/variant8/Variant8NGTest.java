/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variant8;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import variant8.Variant8.IntNumbers;
import variant8.Variant8.Date;

public class Variant8NGTest {
    
   @Test(enabled = false)
	public void loginOld() {

		assertEquals(new Variant8().booleanTask(5, 7), false);

	}

	@Test(dataProvider = "inputProvider")
	public void inputTest(float p1, float p2, float p3) {
		assertEquals(new Variant8().beginTask(p1, p2), p3);
	}

	@DataProvider
	public Object[][] inputProvider() {
		return new Object[][] { { 2, 40, 21 }, { 6, 38, 22 } };
	}


	////////////////////////////////////////////////

	@Test(dataProvider = "integerProvider")
	public void inputTest(int p1, int p3) {
		assertEquals(new Variant8().integerNumbersTask(p1), p3);
	}

	@DataProvider
	public Object[][] integerProvider() {
		return new Object[][] { { 95, 59 }, { 12, 21 }, { 39, 93 } };
	}

	////////////////////////////////////////////////

	@Test(dataProvider = "ifProvider")
	public void ifTest(int p1, int p2, IntNumbers p3) {
		assertEquals(new Variant8().ifTask(p1, p2), p3);
	}

	@DataProvider
	public Object[][] ifProvider() {
		IntNumbers a = new IntNumbers();
		a.setA(5);
		a.setB(3);
		return new Object[][] { { 5, 3, a } };
	}

	//////////////////////////////////////////////////

	@Test(dataProvider = "booleanProvider")
	public void booleanTest(int p1, int p2, boolean p3) {
		assertEquals(new Variant8().booleanTask(p1, p2), p3);
	}

	@DataProvider
	public Object[][] booleanProvider() {
		return new Object[][] { { 3, 5, true }, { 2, 5, false }, { 4, 8, false } };
	}

	//////////////////////////////////////////////////

	@Test(dataProvider = "switchProvider")
	public void switchTest(int p1, int p2, Date p3) {
		assertEquals(new Variant8().switchTask(p1, p2), p3);
	}

	@DataProvider
	public Object[][] switchProvider() {
		Date d = new Date();
		d.setDay(28);
		d.setMonth(2);
		return new Object[][] { { 1, 3, d }, {1,1, new Date(31, 12)} };
	}

	///////////////////////////////////////////////////

	@Test(dataProvider = "forProvider")
	public void forTest(int p1, int p2, double p3) {
		assertEquals(new Variant8().forTask(p1, p2), p3);
	}

	@DataProvider
	public Object[][] forProvider() {
		return new Object[][] { { 3, 5, 60 }, { 1, 3, 6 }, { 1, 2, 2 } };
	}

	///////////////////////////////////////////////////

	@Test(dataProvider = "whileProvider")
	public void whileTest(int p1, int p2) {
		assertEquals(new Variant8().whileTask(p1), p2);
	}

	@DataProvider
	public Object[][] whileProvider() {
		return new Object[][] { { 25, 5 }, { 10, 3 } };
	}

	//////////////////////////////////////////
	@Test(dataProvider = "arrayProvider")
	public void arrayTest(double[] array,  double p2) {
		assertEquals(new Variant8().arrayTask(array), p2, 0.01);
	}

	@DataProvider
	public Object[][] arrayProvider() {
		return new Object[][] { { new double[] { 1, 3, 9 },  3 }, { new double[] { 2, 4, 8, 16, 32 },  2 } };
	}

	

	//////////////////////////////////////////
	
	@Test(dataProvider = "matrixProvider")
	public void twoDimensionArrayTest(int[][] input,  int N, int[][] output) {
		assertEquals(new Variant8().twoDimensionArrayTask(input,  N), output);
	}

	@DataProvider
	public Object[][] matrixProvider() {
		int[][] input1 = {{3, 6, -9, -9},
				{-98, -9, -2, 1},
                                {-2, 1, -6, 1},
				{-8, 1, -5, 3}};

		int[][] output1 = {{3, 6, -9, -9},
				{-98, -9, 1, -2},
				{-2, 1, 1, -6},
				{-8, 1, 3, -5}};

		int[][] input2 = {{3, 6, -9, -9},
				{2, 1, -6, 1},
				{98, -9, -2, 1},
				{8, 1, -5, 3}};

		int[][] output2 = {{3, 6, -9, -9},
				{2, 1, 1, -6},
				 {98, -9, 1, -2},
				{8, 1, 3, -5}};
		
		return new Object[][] { { input1,  4, output1 }, { input2,  4, output2 } };
		
	}

   
    
}
