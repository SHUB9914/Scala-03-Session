class ListDemo
{
  
 def spliList[A](list:List[A],f:A=>Boolean):(List[A],List[A])={
    val list1=for(item<-list if f(item)) yield item   // list that contains elements which are greater than 4
    val list2=for(item<-list if !f(item)) yield item  // list that contains elements which are not greater than 4
    (list1,list2)
  }
}


object ListSplits extends App {
  
  val list = List(1,2,3,4,5,6,7)
  val obj = new ListDemo
  println(obj.spliList(list,(x:Int)=>x>4))
  }