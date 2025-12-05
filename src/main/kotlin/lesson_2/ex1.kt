package org.example.lesson_2


/*Problema 1 pentru Lecția 2

Problemă despre media aritmetică. Într-o clasă cu studiu aprofundat al limbii engleze învață 4 persoane.
Ei au următoarele note la disciplina de profil: 3, 4, 3, 5.
Scriem o parte din software-ul școlar care va calcula media la engleză pentru această clasă.

– Scrie o expresie care calculează media notelor;
– Afișează rezultatul în consolă;
– În consolă trebuie să fie afișat un număr fracționar cu 2 zecimale.*/

fun main()
{
    val elev1: Double = 3.0
    val elev2:Int = 4
    val elev3: Int = 3
    val elev4: Int = 5

    val avg = (elev1 + elev2 + elev3 + elev4)/4

    println("%.2f".format(avg))
}