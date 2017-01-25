class FoldLeftDemo
{

def length(list:List[Any]):Int={

			val length=list.foldRight(0)((_,sum)=>sum+1) 
			length
                                }

}
object ListLength extends App
{
  val list= List(1,2,3,4,5,"shubham")
  val obj1=new FoldLeftDemo
  println(obj1.length(list))
  
}