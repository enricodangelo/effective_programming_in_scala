var emptyL = List.empty[Int]

var a = 1
1

var tuple1 = (1, "two")

var list1 = List[Int](1, 2)

var list2 = 0 +: list1

var list3 = list2 :+ 3

var evenList = List(1, 2, 3, 4).find(x => x % 2 == 0)

println(evenList)

val names = List("Alice", "Bob", "Carol", "David")
names.filter(name => name.size > 4)
println(names)

"Bob".size

val domains: String => String = email => email.dropWhile(c => c != '@').drop(1)

domains("enricodangelo@protonmail.com")

val emails = List("enrico@protonmail.com", "enrico@gmail.com", "mario@protonmail.com", "mario@gmail.com")

val grouped = emails.groupBy(domains)

println(grouped)