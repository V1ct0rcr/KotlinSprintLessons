package org.example.lesson_1

/*Declară o variabilă cu numărul de secunde pe care Gagarin le-a petrecut în spațiu.

Transformă în cod numărul de secunde în minute întregi și ore întregi, păstrând restul de secunde și minute în variabile noi;

Afișează în consolă timpul petrecut în spațiu în formatul [ore:minute:secunde], de exemplu: 01:30:09;

Valorile orelor, minutelor și secundelor trebuie afișate cu două cifre.*/




fun main() {


    val totalSeconds: Int = 6480


    val hours: Int = totalSeconds / 3600
    val remainingSecondsAfterHours: Int = totalSeconds % 3600

    val minutes: Int = remainingSecondsAfterHours / 60
    val seconds: Int = remainingSecondsAfterHours % 60


    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)

    println(formattedTime)
}
