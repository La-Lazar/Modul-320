# Password Validator

## Übersicht
Ein Java-Programm zum Validieren von Passwörtern. Es prüft, ob ein Passwort den Anforderungen genügt.

## Anforderungen
- Mindestens 8 Zeichen lang
- Mindestens eine Ziffer (0-9)
- Mindestens einen Großbuchstaben (A-Z)

## Projektstruktur

```
├── app/               → Main.java (Einstiegspunkt)
├── ui/                → ConsoleInput.java (Benutzer-Input)
├── service/           → PasswordService.java (Schnittstelle)
├── logic/             → PasswordValidator.java (Validierung)
└── exception/         → Exceptions (Fehlerbehandlung)
```

## Klassen

| Klasse | Aufgabe |
|--------|---------|
| **Main** | Startet das Programm, nimmt Input, zeigt Ergebnis |
| **ConsoleInput** | Liest das Passwort vom Benutzer ein |
| **PasswordService** | Verbindet UI mit Validierungslogik |
| **PasswordValidator** | Prüft die Passwort-Anforderungen |
| **PasswordException** | Basis-Exception |
| **NoNumberException** | Keine Ziffer enthalten |
| **NoUppercaseException** | Kein Grossbuchstabe enthalten |

## Beispiel

**Eingabe:** `Passwort1`
**Ausgabe:** `✅ Passwort ist gültig!`

**Eingabe:** `passwort1`
**Ausgabe:** `❌ Fehler: Passwort muss mindestens einen Grossbuchstaben enthalten.`
