def f(arr:List[Int]):List[Int] = {
    arr.foldLeft(List[Int]())((acc,v) => v::acc)
}
