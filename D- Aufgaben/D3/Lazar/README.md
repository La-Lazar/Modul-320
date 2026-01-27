# Konsolen-Spiel Projekt (Modul-320)

## Überblick

Dieses Projekt ist ein einfaches Konsolen-basiertes Spiel, entwickelt in Java. Der Spieler steuert einen Charakter (@) auf einem Spielfeld, sammelt Items (0) und sammelt Punkte. Das Spiel läuft in der Konsole und verwendet ANSI-Escape-Codes für eine einfache Bildschirmaktualisierung.

## Spielmechanik

- **Bewegung**: Verwende die Tasten W, A, S, D, um den Spieler nach oben, links, unten oder rechts zu bewegen.
- **Ziel**: Sammle die '0'-Items auf dem Spielfeld. Jedes gesammelte Item erhöht den Punktestand um 1 und ein neues Item erscheint zufällig.
- **Beenden**: Drücke 'q' oder 'Q', um das Spiel zu beenden.
- **Spielfeld**: Ein 10x10 Raster mit '.' als leeren Feldern, '@' als Spieler und '0' als Items.

## Klassenübersicht

### Main.java
- **Zweck**: Einstiegspunkt des Programms.
- **Funktion**: Erstellt eine Instanz der `Game`-Klasse und startet das Spiel. Fängt IOException ab.

### Game.java
- **Zweck**: Hauptspiel-Logik und Spielschleife.
- **Funktion**:
  - Initialisiert `GameBoard`, `GameRenderer` und `InputHandler`.
  - Zeigt Willkommensnachricht und Anweisungen.
  - Läuft in einer Schleife: Rendert das Spielfeld, liest Eingabe, verarbeitet Bewegung.
  - Beendet bei 'q' und zeigt finale Punkte.

### GameBoard.java
- **Zweck**: Verwaltet den Zustand des Spielfelds.
- **Funktion**:
  - Erstellt ein 2D-Array für das Spielfeld.
  - Platziert den Spieler in der Mitte und 5 zufällige Items.
  - Behandelt Spielerbewegung: Prüft Grenzen, sammelt Items, platziert neue Items.
  - Verfolgt Punktestand.

### GameRenderer.java
- **Zweck**: Rendert das Spielfeld als String für die Konsole.
- **Funktion**:
  - Baut einen String aus dem Spielfeld-Array auf.
  - Fügt Punktestand und Eingabehinweise hinzu.
  - Verwendet StringBuilder für Effizienz.

### InputHandler.java
- **Zweck**: Behandelt Benutzereingaben.
- **Funktion**:
  - Liest einzelne Zeichen von System.in mit `System.in.read()`.

## Architektur

- **Model**: `GameBoard` (Daten und Logik).
- **View**: `GameRenderer` (Darstellung).
- **Controller**: `Game` und `InputHandler` (Eingabe und Steuerung).

Es verwendet keine externen Bibliotheken, nur Standard-Java.

## Erweiterungsmöglichkeiten

- Hinzufügen von Hindernissen oder Feinden.
- Mehr Items mit unterschiedlichen Werten.
- Highscore-Speicherung in einer Datei.
- GUI-Version mit Swing oder JavaFX.

## Autor
Entwickelt als Teil von Modul-320 OOP-Aufgaben.