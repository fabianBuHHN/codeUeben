Aufgabe 1
    
    Teil1
    Weil der Try-Block eine ArithmeticException wirft, wird der Catch-Block ausgeführt,
    der in diesem Fall nur "Follow the white rabbit..." ausgibt.
    Der finally-Block wird in jedem Fall ausgeführt bzw. unabhängig davon ob eine Exception
    geworfen wird oder nicht, also lautet die zweite Ausgabe "Knock Knock, Neo."

    Teil 2
    Der catch-Block ist nicht in Ordnung.
    Die Exception sollte genauer benannt werden, damit klar wird, ob eine 
    Runtime-Exception oder eine IO-Exception aufgetreten ist. 
    der catch-Block sollte eine Funktion haben, damit auf den Fehler reagiert wird
    und die Exception sollte einen sprechenden Namen haben (anstelle des Namens "e".

    Teil 3
    "throws" übergibt die Fehlerbehandlung an die nachgelagerte Klasse und
    muss, als Signalwort, neben der Methodensignatur stehen.
    "throw" ist eine Möglichkeit eine eigene Exception zu nutzen und entsprechend mit einem 
    Fehler umzugehen.
    Also besteht der Unterschied zwischen beiden Signalwörtern darin, dass 
    "throws" eine Exception einfach nur weiterleitet, während "throw" direkt auf die
    Exception reagiert und damit umgeht.