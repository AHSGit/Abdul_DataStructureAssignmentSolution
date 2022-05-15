package com.greatlearning.Assignment2.Q1;

import java.util.HashSet;
import java.util.Scanner;

public class ConstructionPlanModel {	
	
	static int total_size;	
	static Scanner sc = new Scanner(System.in);
	static int floorSize[];
	static int floorSizeSorted[];
	
	HashSet<Integer> set = new HashSet <Integer>();
	
	// Method to get input from user
	void getValues() {

		System.out.println("Enter the total no of floors in the building: ");
		total_size = sc.nextInt();
		floorSize = new int[total_size];
		floorSizeSorted = new int[total_size];
		
		int j = total_size;
		for(int i = 0; j > 0 && i < total_size; i++) {  // Sorted array of the inputs
			floorSizeSorted[i] = j;
			j--;
		}
		
		// HashSet has been used to make use of the .contains() function to filter out bad inputs
		for(int i = 0; i < total_size; i++) {
			System.out.println("Enter the floor size given on Day " + (i+1) + ": ");
			 floorSize[i] = sc.nextInt();
			if(!set.contains(floorSize[i]) && (0 < floorSize[i] && floorSize[i] <= total_size))
				set.add(floorSize[i]);
			else {
				System.out.println("Please enter a valid and distinct floor size!");
				--i;
				continue;
			}	
			
		} set.clear();
	}
	

	// Method to implement the construction process
	void orderOfConstruction() {
		
		int search = floorSizeSorted[0];
		int day = 0;
		
		/* 'search' will be used to search the next highest value in the original array.
		 * 
		 *  if the search element is found, program will print it** and check if there is a non-empty set
		 *  		# if non-empty set is present, program will check for the next highest 
		 *  		search element inside the set and print it
		 *  
		 *  ## else program will add the search element to the set and move to the next 
		 *  element in the original array 
		 *  
		 * */
		
		System.out.println("\nThe order of construction is as follows:");

		for(int i = 0; i < floorSize.length; i++) {			
			day++;
			if(floorSize[i] == search) { // **
				System.out.println("\nDay : " + day);
				System.out.print(search + " ");
				search--;
				
				// # Check if the set is empty
				if(!set.isEmpty()) {
					while(search != 0) {				
						if(set.contains(search)) {
							System.out.print(search + " ");
							set.remove(search);
							search--;
						}
						
						else {
							System.out.println(); 
							break;
						}					
					}
					
				}
				
				else {
					System.out.println();
					continue;
				}
			}				
			
			else {
				
				// ## Store the element in the set
				set.add(floorSize[i]);
				System.out.println("\nDay : " + day);
			}
		}
	}
	
}
