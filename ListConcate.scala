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