# Password Validator

## Übersicht
Ein Java-Programm zum Validieren von Passwörtern mit konfigurierbaren Regeln. Der Benutzer kann zu Beginn wählen, welche Validierungskriterien aktiv sein sollen.

## Features
- Konfigurierbare Validierungsregeln 
- Interaktives Menü zur Auswahl der Regeln
- Detailliertes Fehler-Feedback (Immer alle Fehler werden angezeigt)
- Wiederholte Eingabeversuche bis Passwort gültig ist

## Verfügbare Regeln
- **MinLengthRule** - Mindestlänge (frei einstellbar, default: 8)
- **NumberRule** - Mindestens eine Ziffer (0-9)
- **UppercaseRule** - Mindestens einen Großbuchstaben (A-Z)

## Projektstruktur

```
├── app/
│   └── Main.java                    (Einstiegspunkt)
├── ui/
│   └── ConsoleInput.java            (Benutzer-Input, Regel-Konfiguration)
├── logic/
│   ├── PasswordValidator.java       (Validator mit Rules)
│   ├── PasswordRule.java            (Interface für Rules)
│   ├── MinLengthRule.java           (Längen-Validierung)
│   ├── NumberRule.java              (Ziffer-Validierung)
│   └── UppercaseRule.java           (Großbuchstaben-Validierung)
└── exception/
    ├── PasswordException.java       (nicht mehr verwendet)
    ├── NoNumberException.java       (nicht mehr verwendet)
    └── NoUppercaseException.java    (nicht mehr verwendet)
```

## Klassen

| Klasse | Aufgabe |
|--------|---------|
| **Main** | Startet Programm, konfiguriert Rules, zeigt Ergebnis |
| **ConsoleInput** | Interaktives Menü zur Regel-Auswahl, Passwort-Eingabe |
| **PasswordValidator** | Validiert Passwort gegen alle aktiven Rules |
| **PasswordRule** | Interface für alle Validierungsregeln |
| **MinLengthRule** | Prüft Mindestlänge |
| **NumberRule** | Prüft Ziffern-Anforderung |
| **UppercaseRule** | Prüft Großbuchstaben-Anforderung |