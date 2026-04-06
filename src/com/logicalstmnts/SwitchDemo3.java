package com.logicalstmnts;
//nested switch
import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter category");
		String catg=s.next();
		switch(catg) {
			case "fruits"->{
				System.out.println("entr item & price");
				String item=s.next();
				
				switch(item) {
				case "aple"->System.out.println("1kg aple 250/-");
				case "orng"->System.out.println("1kg orng 120/-");
				case "grp"->System.out.println("1kg grp 140/-");
				case "bana"->System.out.println("12 banaa 80/-");
				case "promg"->System.out.println("1kg promg 350/-");
				default->System.out.println("entered item not available");
				}
			}
			case "veggies"->{
				System.out.println("entr item & price");
				String item=s.next();
				
				switch(item) {
				case "crt"->System.out.println("1kg carrot 50/-");
				case "barbati"->System.out.println("1kg barbati 30/-");
				case "potato"->System.out.println("1kg potato 30/-");
				case "ladiesfngr"->System.out.println("1/2 kg ladiesfngr 20/-");
				case "beetroot"->System.out.println(" 1/2 kg 40/-");
				default->System.out.println("entered item not available");
				}
				
			}
			default->System.out.println("entered catg not available");
		}

	}

}
