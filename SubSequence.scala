/**
* Implement a method hasSubsequence for checking whether a List contains another List as a subsequence. 
* For instance, List(1,2,3,4) would have List(1,2), List(2,3), and List(4) as subsequences. The signature of the method should be:
* def hasSubsequence[A](list:List[A],sub:List[A]):Boolean
*/

class ListSubSequence
{
  
 def hasSubSequence(list:List[Int],sub:List[Int]):Boolean={
    list.containsSlice(sub)
}
}

object SubSequence extends App {
  
  val list = List(1,2,3,4,5,6)
  val sub = List(1,2)
  val obj = new ListSubSequence
  println(obj.hasSubSequence(list,sub))
 }
