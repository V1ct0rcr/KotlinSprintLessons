package org.example.lesson_1

/*arcina 3 pentru Lecția 1

În orice manual există probleme despre spațiu. Declară variabile și afișează date despre zborul în spațiu al primei persoane.

– Salvează într-o nouă variabilă year anul zborului lui Iuri Gagarin în spațiu;
– Declară și inițializează variabilele hour și minute – ora și minutul decolării, respectiv;
– Afișează anul, ora și minutul decolării, câte o variabilă pe fiecare rând;
– Apoi modifică valorile variabilelor hour și minute, astfel încât acestea să aibă acum ora și minutul aterizării;
– Afișează ora aterizării într-un singur rând, în formatul [ore:minute]. Exemplu: 10:55.

Determină în program care variabile trebuie declarate cu val și care cu var.

Date pentru problemă:
Anul zborului – 1961
Decolare – 09:07
Aterizare – 10:55

Sugestie pentru afișare: ce metodă de printare în consolă nu face trecerea la o linie nouă la final?*/

fun main()
{
    val year = 1961
    var hour = "09"
    var minute = "07"

    println("Takeoff time:")
    println(year)
    println(hour)
    println(minute)

    hour = "10"
    minute = "55"
    println("Landing time: $year, $hour:$minute")
}