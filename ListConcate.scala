/**
* Write a function that concatenates a list of lists into a single list. Its runtime should be linear in the total length of all lists. The signature of the method should be:
* def concateList[A](l1:List[A],l2:List[A]):List[A]
* (Note: You can use Pattern matching over lists to implement the method. But, do not use any provided methods as solutions)
*/

class Concatination
{
  
def concateList(list1:List[Int],list2:List[Int]):List[Int]={
  
list2 match {
  
  		case List()=> list1
  		case head::tail=> concateList((list1:+head),tail)       // using tail recursion for adding elements of second list 
	    }
}
}
object ListConcate extends App
{
  
  val list1 = List(1,2,3,4)
  val list2 = List(5,6,7,8)
  val obj1 = new Concatination
  println(obj1.concateList(list1,list2))

}
