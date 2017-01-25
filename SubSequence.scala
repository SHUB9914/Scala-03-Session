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