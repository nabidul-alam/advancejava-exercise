/*
 * #%L
 * Advanced Java LIVE course-2020
 * %%
 * Copyright (C) 2020 MasterDevSkills.com
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

package com.masterdevskills.cha1.ext3;


import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * @author A N M Bazlur Rahman @bazlur_rahman
 * @since 04 August 2020
 */

//TODO all of the exercise must be done by using lambda expression
public class Exercises {

	/**
	 * TODO: given a list of integer, return a list of integer where each integer is multiplied by 2
	 *
	 * @param ints list of integer
	 * @see List#replaceAll(UnaryOperator)
	 */
	public static List<Integer> doubling(List<Integer> ints) {
		UnaryOperator<Integer> operator = val -> val*2;
		 ints.replaceAll(val -> val*2);
		 return ints;
		//throw new RuntimeException("NotYetImplemented");
	}

	/**
	 * TODO: given a list of string and a suffix, apply the suffix to all of them
	 *
	 * @param items  List of string item
	 * @param suffix suffix that needs to apply on each item
	 * @see List#replaceAll(UnaryOperator)
	 */
	public static List<String> addSuffix(List<String> items, String suffix) {
		//UnaryOperator<String> operator = item -> item.concat(suffix);
		items.replaceAll(item -> item.concat(suffix));
		return items;
		//throw new RuntimeException("NotYetImplemented");
	}

	/***
	 * TODO:  sort the given list of person using their first Name in natural order
	 *
	 * @param people list of person
	 * */
	public static List<Person> sortItemByFirstNameOrderAscending(List<Person> people) {
		Comparator<Person> comparator = ( p1,  p2) -> p1.getFirstName().compareTo(p2.getFirstName());
		people.sort(comparator);
		return people;
		//throw new RuntimeException("NotYetImplemented");
	}

	/**
	 * TODO: sort the given list of person using last name in reserved order
	 *
	 * @param people list of person
	 */
	public static List<Person> sortByLastNameOrderDescending(List<Person> people) {
		//Comparator<Person> comparator = (p1, p2) -> -1 * p1.getLastName().compareTo(p2.getLastName());
		people.sort((p1, p2) -> -1 * p1.getLastName().compareTo(p2.getLastName()));
		return people;
		//throw new RuntimeException("NotYetImplemented");
	}

	/**
	 * TODO: sort the given list of the person using the first name and then last name and then age
	 * which means, if there is the first name of two-person is same, then they would be sorted by the last name
	 * if the first name and last name are the same, then they would be sorted by age in the natural order
	 *
	 * @param people list of person
	 */
	public static List<Person> sortByFirstNameAndThenLastNameAndThenAge(List<Person> people) {
		Comparator<Person> compByFirstName = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName());
		Comparator<Person> compByLastName = (p1, p2) ->  p1.getLastName().compareTo(p2.getLastName());
		Comparator<Person> compByAge = (p1, p2) ->  Integer.compare(p1.getAge(), p2.getAge());

		Comparator<Person> comp = compByFirstName.thenComparing(compByLastName).thenComparing(compByAge);
		people.sort(comp);


		return people;
		//throw new RuntimeException("NotYetImplemented");
	}
}
