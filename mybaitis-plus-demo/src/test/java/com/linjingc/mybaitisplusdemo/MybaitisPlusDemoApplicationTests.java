package com.linjingc.mybaitisplusdemo;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

//@RunWith(value = SpringRunner.class)
@RunWith(Parameterized.class)
@SpringBootTest
public class MybaitisPlusDemoApplicationTests {
	private int a;
	private int b;

	public MybaitisPlusDemoApplicationTests(int a, int b) {
		this.a = a;
		this.b = b;
	}


	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][]{
				{2, 1},
				{5, 5},
				{10, 1}
		};
		return Arrays.asList(data);
	}
	@Test
	public void test() {
		System.out.println("inputNumber: " + a + "; isEven: " + b);
		// Step 5: use variables in test code
		assertEquals(a,b);
	}

	@Test
	public void contextLoads() {
		System.out.println("输出测试");
	}

	@BeforeClass
	public static void StartBefore() {
		System.out.println("开始测试");
	}

	@AfterClass
	public static void StartAfter() {
		System.out.println("结束测试");
	}

}
