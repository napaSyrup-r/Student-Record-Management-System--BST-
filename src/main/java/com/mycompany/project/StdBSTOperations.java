package com.mycompany.project;
import java.util.Scanner;

public class StdBSTOperations{
        Scanner input = new Scanner(System.in);
	Node start = null;
	
	public Node getNode() {
		Node newNode = new Node();
		System.out.print("Enter Name: ");
		newNode.name = input.next();
		
		System.out.println("Enter Roll: Random roll generated");
		newNode.roll = (int) (Math.random()*100);
		
		System.out.print("Enter CGPA: ");
		newNode.cg = input.nextDouble();
                
		System.out.print("Enter Department: ");
		newNode.dept = input.next();
		
		newNode.left = null;
		newNode.right = null;
		
		return newNode;
	}
	
	public void insertBST() {
		Node newNode = getNode();
		if(start == null) {
			start = newNode;
		}else {
			Node temp = start;
			while(true) {
				if(newNode.roll < temp.roll) {
					if(temp.left == null) {
						temp.left = newNode;
						break;
					}else {
						temp = temp.left;
					}
				}else if(newNode.roll > temp.roll) {
					if(temp.right == null) {
						temp.right = newNode;
						break;
					}else {
						temp = temp.right;
					}
				}else if(temp.roll == newNode.roll) {
					System.out.println("Cannot enter info (duplicate roll)");
					break;
				}
			}
		}
	}
	
	public Node searchBST(Node tempRoll, int searchRoll) {
            if (tempRoll == null) {
                return null;
            }
            else if (tempRoll.roll == searchRoll) {
                return tempRoll;
            }
            else if (searchRoll < tempRoll.roll) {
                return searchBST(tempRoll.left, searchRoll);
            }
            else {
                return searchBST(tempRoll.right, searchRoll);
            }
        }
	
	public void printRoll(Node tempRoll) {
		if(tempRoll != null) {
			System.out.print(tempRoll.roll+" ");
			printRoll(tempRoll.left);
			printRoll (tempRoll.right);
		}
	}
    
}
