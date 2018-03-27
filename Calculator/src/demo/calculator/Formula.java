package demo.calculator;

public interface Formula {

	Formula value(String key);
	Formula add();
	Formula multiply();
	Formula divide();
	Formula subtract();
	Formula lParen();
	Formula rParen();
	
}
