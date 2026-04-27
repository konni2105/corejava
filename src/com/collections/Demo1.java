
/*
FrameWorks=> Instead of developers developing from root/strach,
            using jar files or lib classes to complete the task.
            
Arrays=>to structuring the data in or anized way
Variable=> its a container to store single value


why collections..?
      structuring the data in a organized way
      
what is collections(class)=>
		collections is a  "class" from java.util package
	container to store group of obj's into a single entity that should be collection related obj

what is collection=>
        			collection is a "interface"
collections framework(chapter)=> 
       maintain collectn of obj's to keep inside a single entity
      
	
      
Q) but alredy we have arrays na then why collections?
   
    arr:    fixed in size (not reccomend when we dont know xact size)
	    	only allow homogeneous elee
	    	allow both obj & primitive datatypes
	    	memory point arr not recommmend
	    	performance point recommend(due to primitive data types)
   
    colltn(interface): Growable in nature(reccomend when we dont know the xact size)
			            both homo & hetro ele
			            allow only obj+wrapper obj datatypes
			            memory point arr recommmend
			    	    performance point not recommend(due to  lack of primitive datatypes)
	
	 ------------------------------------------------------------------------		                 
collection INTERFACES:
  1) Iterable
  2)collection  :
      methods--> add,addall,contains,containsAll,clear,equals,hashCode,identityHashCode,isEmpty,iterator()->boolean hasNext() &object next(),remove()
  3)list             : ArrayList,LinkedList,Stack&Vector,CopyOnWriteSrrayList
  
  4)set              : HashSet,LinkedHashSet
  5)sortedset        : TreeSet
  6)navigableset     : TreeSet
  
  7)queue            : priorityQueue or linkedList
  8)deque            : linkedlist
  --------------------------------------------------------------
  9)map              :HashMap,LinkedHashMap,IdentityHashMap,ConcurrentHashMap,WeakedHashmap
  10)sortedmap       :Treemap
  11)navigablemap     :Treemap
  
  cursors:
  12)enumeration
  13)Iterator
  14)listIterator
  
  functional Interfaces: SAM
  15)comarable -->java.lang
  16)comparator -->java.util
  
  marker interfaces:no methods
  17)clonable
  18)serialisable
  19)randomaccess
  
  		             
		            
         			       
*/
package com.collections;


import java.util.ArrayList;
import java.util.Collection;

public class Demo1 {

	public static void main(String[] args) {
	Collection c=new ArrayList();//upcasting
	//hetrogeneous ele we can give 
	//insertion order preserved,
	//use generics <>
	
	c.add(100);
	c.add('a');
	c.add("abhi");
	c.add(10.0);
	c.add(87.09787875);
	
	System.out.println(c);//[100, a, abhi, 10.0, 87.09787875]

	}

}
