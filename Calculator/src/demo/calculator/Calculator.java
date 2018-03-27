package demo.calculator;

import java.math.BigDecimal;
import java.util.Map;

public interface Calculator {
	
	BigDecimal compute(Formula formula, Map<String, BigDecimal> context);
	String print(Formula formula, Map<String, BigDecimal> context);
	
}
