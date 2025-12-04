package org.example.lesson_1

/*Copiază soluția din sarcina 1 într-un fișier nou pentru sarcina 2.
Acum trebuie să completezi implementarea programului pentru noile cerințe. Imităm log-urile de pe server.

– Pentru început, afișează în consolă valorile tuturor variabilelor declarate anterior;
– Apoi trebuie să faci în așa fel încât programul să păstreze numărul de angajați ai acestui magazin online (2000). Alege o denumire potrivită pentru variabilă, atribuie-i valoarea și afișeaz-o;
– În continuare, să presupunem că un angajat a plecat. Comentează codul anterior care afișa numărul de angajați, atribuie noii valori acestui număr și afișeaz-o în consolă.

Se evaluează nu doar corectitudinea pașilor, ci și organizarea îngrijită a codului (ordinea declarațiilor, indentarea etc.).*/


fun main()
{
    val numberOfOrders: Int = 75

    val thankText: String = "Thank you for your order, have a nice day!"

    println(numberOfOrders)
    println(thankText)

    var employeeNumber: Int = 2000
    println("Number of employees in company: $employeeNumber")

     employeeNumber = 1999
    println("Number of employees in company after one left: $employeeNumber")


}