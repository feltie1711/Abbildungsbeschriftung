# Abbildungsbeschriftung

## Ausführung

Innerhalb eclipse muss die main-Methode der Klasse ``Input.Java`` ausgeführt werden.
(Da dieses Tool erstmal provisorisch ist, existiert noch keine eigenständig lauffähige Version.)

## Besonderheiten

Bei Ausführung des Programms wird nach einem Dateipfad gefragt.
Nach der Eingabe werden die Daten der Datei eingelesen und nicht überschrieben, sofern vorhanden.
Falls die Datei nicht existiert, wird eine neue erstellt.

Nach Eingabe eines Dateipfades wird nach dem Fach gefragt. Dieses muss pro Ausführung nur einmal angegeben werden

Mit ``exit`` wird das Programm beendet und in die Datei geschrieben.

Ansonsten werden wiederholend Folgende vier Punkte abgefragt:
 - Seite: Die Seitenzahl, z.B.: ``123``
 - Abbildungs-Nummer: Dies ist der Name der Abbildung, z.B.: ``3.5``; Bei Eingabe eines Leerzeichens und einer beliebigen Zeichenkette dahinter, wird die Abbildung als überflüssig markiert. z.B. ``3.5 N``
 - Titel: Dies ist der Name der Abbildung (Im Skript hinter der Nummer) z.B.:``Darstellung von xyz``
 - Hoch-/Querformat: Hier wird einfach die Eingabe übernommen wie z.B.:``Hochformat``. Falls kein Wert eingegeben wird, ist der Standardwert ``Hoch-/Querformat``
