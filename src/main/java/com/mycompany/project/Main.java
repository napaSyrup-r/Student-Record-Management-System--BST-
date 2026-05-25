package com.mycompany.project;
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//int choice;
		StdBSTOperations rec = new StdBSTOperations();
		
                System.out.println("\n\n***** Wellcome to Student Record Management System!! *****");
                System.out.println();
                System.out.println("Enter the number of student records to be created: ");
                int numberOfRecords = input.nextInt();
            
            for (int i = 1; i <= numberOfRecords; i++) {
                System.out.println("Enter information for " + i + " no. student: ");
                rec.insertBST();
                System.out.println();
            }
		
		System.out.println("\nGenerated roll numbers: ");
		rec.printRoll(rec.start);
		System.out.println();

		
		boolean flag = true;
		while(flag) {
                    
			System.out.print("\nOptions to be chosen(1 or 2): ");
			System.out.println("\n1.Search a student record\n2.Exit");
                        System.out.print("\nChoose a Option: ");

			int choice = input.nextInt();
			
			switch (choice){
			case 1: {
				System.out.println();
				Node tempRoll = null;
				System.out.print("Enter a roll to be searched from the generated roll numbers: ");
				int searchRoll = input.nextInt(); 
                                
				tempRoll = rec.searchBST(rec.start, searchRoll);
				
				if(tempRoll != null) {
					System.out.print("\nName: " + tempRoll.name);
					System.out.print("\nRoll: " + tempRoll.roll);
					System.out.print("\nCGPA: " + tempRoll.cg);
					System.out.print("\nDepartment: " + tempRoll.dept);

				}else {
					System.out.println("\n*No Record Found! Unregistered roll number were entered.*");
				}
				System.out.println();
				break;
			}
                        case 2: {
				flag = false;
				break;				
			}
			default:
				System.out.println("Wrong option choosen!!!");
			}
			
		}
	}
}
