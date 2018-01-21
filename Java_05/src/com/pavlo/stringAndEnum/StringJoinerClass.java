package com.pavlo.stringAndEnum;

import java.util.StringJoiner;

public class StringJoinerClass {

	public static void main(String[] args) {

		StringJoiner stringJoiner = new StringJoiner("], [", "[", "]");

		stringJoiner.add("").add("alpha").add("theta").add("gamma").setEmptyValue("EMPTY");

		System.out.println(stringJoiner);

	}

}
