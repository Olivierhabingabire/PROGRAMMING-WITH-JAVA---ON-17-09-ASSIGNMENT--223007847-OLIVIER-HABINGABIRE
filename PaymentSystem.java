package com.supermarket;

import java.util.Scanner;

public class PaymentSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//ask the cashier how many different items the customer bought
		System.out.println(" how many different items the customer bought?");
		int x=sc.nextInt();

		//Declare arrays to store item details
		String[] itemName = new String[x];
		double []pricePerUnit = new double [x];
		int[] quantity = new int[x];
		double[]subtotal = new double[x];
		double totalBill = 0;

		//input item details
		for (int i = 0; i < x; i++) {
			System.out.println("\nItem " + (i + 1));
			System.out.print("Enter the item name: ");
			itemName[i] = sc.next();
			System.out.print("Enter price per unit: ");
			pricePerUnit[i] = sc.nextDouble();
			System.out.print("Enter quantity: ");
			quantity[i] = sc.nextInt();

			subtotal[i] = pricePerUnit[i] * quantity[i];
			totalBill += subtotal[i];
		}

		double discount =0;
		if (totalBill>50000){
			discount= totalBill*0.05;

		}
		double finalAmountPay= totalBill-discount;

		//receipt

		System.out.println("\n========== RECEIPT ==========");
		System.out.println("itemName\tquantity\tpricePerUnit\tsubtotal");
		for (int i = 0; i < x; i++){
			System.out.println(itemName[i] + "\t" + quantity[i] + "\t" +
					pricePerUnit[i] + "\t" + subtotal[i]);
		}
		System.out.println("------------------------------");
		System.out.println("Grand Total: " + totalBill);
		System.out.println("Discount: " + discount);
		System.out.println("Final Amount Payable: " + finalAmountPay);
		System.out.println("=============================");
		sc.close();
	} 
}

