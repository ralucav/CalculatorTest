package demo.calculator.impl;

import demo.calculator.Formula;

public class FormulaImpl implements Formula {

	@Override
	public Formula value(String key) {
		// TODO Auto-generated method stub
		System.out.println(key);
		return this;
	}

	@Override
	public Formula add() {
		// TODO Auto-generated method stub
		System.out.println("+");
		return this;
	}

	@Override
	public Formula multiply() {
		// TODO Auto-generated method stub
		System.out.println("*");
		return this;
	}

	@Override
	public Formula divide() {
		// TODO Auto-generated method stub
		System.out.println("/");
		return this;
	}

	@Override
	public Formula subtract() {
		// TODO Auto-generated method stub
		System.out.println("-");
		return this;
	}

	@Override
	public Formula lParen() {
		// TODO Auto-generated method stub
		System.out.println("(");
		return this;
	}

	@Override
	public Formula rParen() {
		// TODO Auto-generated method stub
		System.out.println(")");
		return this;
	}



}
