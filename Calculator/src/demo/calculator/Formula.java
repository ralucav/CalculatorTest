package demo.calculator;

import java.math.BigDecimal;
import java.util.Map;

public interface Formula {

	Formula value(String key);
	Formula add();
	Formula multiply();
	Formula divide();
	Formula subtract();
	Formula lParen();
	Formula rParen();
	BigDecimal evaluate(Map<String, BigDecimal> context);
}
