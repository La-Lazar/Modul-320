# UML Diagramm 

``` mermaid
classDiagram

    class Main {
        +main(args : String[]) void
        +PrintFahrzeuge(fahrzeuge : List<Fahrzeug>) void
    }

    class Fahrzeug {
        -FahrzeugName : String
        -Reparaturkosten : Integer
        -IstRepariert : boolean

        +Fahrzeug(fahrzeugName : String, reparaturkosten : Integer, istRepariert : boolean)
        +SetIstRepariert(reparaturkosten : Integer) void
        +SetReparaturkosten(reparaturkosten : Integer) void
        +SetFahrzeugname(fahrzeugname : String) void

        +getFahrzeugName() : String
        +getReparaturkosten() : Integer
        +isIstRepariert() : boolean
    }

    class Garage {
        -garageName : String
        -fahrzeuge : List<Fahrzeug>

        +Garage(garageName : String)
        +addFahrzeug(f : Fahrzeug) void
        +removeFahrzeug(f : Fahrzeug) void
        +getFahrzeuge() : List<Fahrzeug>
        +getGarageName() : String
    }

    Garage "1" --> "0..*" Fahrzeug : enthält >
    
````