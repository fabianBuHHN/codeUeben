Aufgabe 1
1) Zuerst wird der Name des Musters genannt, danach wird der Inhalt des Musters beschrieben.
Die Inhaltsbeschreibung beginnt damit, dass beschrieben wird welches Problem gelöst wird und in welchen Bereichen
bzw. wofür das jeweilige Mustern genutzt werden könnte - das hilft um zu entscheiden, wann welches Muster sinnvoll 
eingesetzt werden kann
Als nächstes wird beschrieben welche Komponenten(Methoden, Klassen usw.), an der Lösung des beschriebenen Problems 
beteiligt sind und wie
diese Komponenten interagieren. Auch wird hier die Struktur beschrieben, die für das jeweilige Muster 
vorgeschlagen ist.
Abschließend werden die Vor - und Nachteile, die Seiteneffekte usw. diskutiert.
Diese Diskussion hilft zu entscheiden, welches Muster für welchen Einsatz geeignet ist.
Bspw. hat eine Firmen interne Datenbank hat weniger Zugriffe als eine öffentliche Datenbank, infolge 
muss man zwangsläufig andere Seiteneffekte bedenken - bei einer internen Datenbank könnte der 
Schreibzugriff wichtiger sein als der Lesezugriff einer öffentlichen Datenbank. Solche Seiteneffekte
sollten bedacht werden.
2) Unter einem Anti-Pattern versteht man Entwurfsmuster die man, wenn dann, in Ausnahmefällen
verwenden sollte 
   1. Anti-Pattern: Zwiebel/Onion Neue Funktionalität wird über alte gelegt, der Code wird
   eventuell schlecht refactored. 
   2. Anti-Pattern: Copy And Paste Programming - Code der aus anderen Stellen des Projekts
   oder aus anderen Projekten kopiert wurde. Fehler werden hier schnell mitkopiert und Code kann ineffizient sein.
   3. Anti-Pattern: Magische Werte / magic values, sind hartcodierte Werte die nur verstanden werden können,
   wenn der Code verstanden wurde - infolge sind magic values nur schwer zu ändern und der Code ist nur schwer zu 
   erweitern, solange die magic values nicht verstanden wurden.
3) Singleton ist ein Entwurfsmuster das sicherstellt, das nur eine Instanz eines Objekts existiert z.B. eine
bei einer Instanz eines Servers.
   1) Vorteile: Das Singleton kann leichter verändert werden, wenn mehr als eine Instanz gebraucht wird als 
   hart codierte Variablen(siehe auch Anti-Pattern: Magische Werte). Das Singleton ermöglicht eine Zugriffskontrolle 
   auf Instanzen.
   2) Nachteile: Das Singleton wird viel zu oft und unreflektiert genutzt. Wenn viele Singleton genutzt werden 
   entsteht schnell ein äquivalent zu globalen Variablen.
4) Im gegebenen Code wurde das "DecoratorPattern" genutzt
 