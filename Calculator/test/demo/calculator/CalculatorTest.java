package demo.calculator;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import demo.calculator.impl.CalculatorImpl;
import demo.calculator.impl.FormulaImpl;

public class CalculatorTest {

	@Test
	public void testFormulaCalculator() {
		// (A + B) * C / D - E -> ((10 + 10) * (10 / 10)) - 10 = 10
		Formula formula = new FormulaImpl().lParen().value("A").add().value("B").rParen().multiply().value("C").divide().value("D").subtract().value("E");
		Map<String, BigDecimal> context = new HashMap<>();
		context.put("A", BigDecimal.valueOf(10));
		context.put("B", BigDecimal.valueOf(10));
		context.put("C", BigDecimal.valueOf(10));
		context.put("D", BigDecimal.valueOf(10));
		context.put("E", BigDecimal.valueOf(10));
		Calculator calculator = new CalculatorImpl();
		BigDecimal result = calculator.compute(formula, context);
		assertEquals(10, result.intValue());
		assertEquals("(10+10)*10/10-10=10", calculator.print(formula, context));
	}

}
