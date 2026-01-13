# Sequenzdiagramm — Use Case: `Starter` zeichnet das Bild (V2)

Use-Case: Der Benutzer (über `Starter.main`) initialisiert das Bild und ruft `draw()` auf. Das Diagramm zeigt die Objekterzeugung und die Reihenfolge der Methodenaufrufe (inkl. Zeichen-/Erase-Delegation an `Canvas`).

```mermaid
sequenceDiagram
    autonumber
    participant Starter
    participant Picture
    participant Wall
    participant Window
    participant Roof
    participant Sun
    participant Cloud
    participant Canvas

    Starter->>Picture: new Picture()
    Starter->>Picture: draw()
    activate Picture

    %% Wand (Square) erstellen und konfigurieren
    Picture->>Wall: new Square()
    Picture->>Wall: moveHorizontal(-140)
    Picture->>Wall: moveVertical(20)
    Picture->>Wall: changeSize(120)
    Picture->>Wall: makeVisible()
    Wall->>Canvas: draw(this, color, Rectangle)

    %% Fenster (Square) ähnlich
    Picture->>Window: new Square()
    Picture->>Window: changeColor(blue)
    Picture->>Window: moveHorizontal(-120)
    Picture->>Window: moveVertical(40)
    Picture->>Window: changeSize(40)
    Picture->>Window: makeVisible()
    Window->>Canvas: draw(this, color, Rectangle)

    %% Dach (Triangle)
    Picture->>Roof: new Triangle()
    Picture->>Roof: changeSize(60, 180)
    Picture->>Roof: moveHorizontal(20)
    Picture->>Roof: moveVertical(-60)
    Picture->>Roof: makeVisible()
    Roof->>Canvas: draw(this, color, Polygon)

    %% Sonne zuerst zeichnen
    Picture->>Sun: new Circle()
    Picture->>Sun: changeColor(yellow)
    Picture->>Sun: moveHorizontal(100)
    Picture->>Sun: moveVertical(-40)
    Picture->>Sun: changeSize(80)
    Picture->>Sun: makeVisible()
    Sun->>Canvas: draw(this, color, Ellipse)

    %% Wolke erzeugen und animieren
    Picture->>Cloud: new Cloud()
    Picture->>Cloud: changeColor(gray)
    Picture->>Cloud: makeVisible()
    Cloud->>Canvas: draw(this, color, RoundRectangle)

    loop Cloud animation: 400 steps
        Cloud->>Cloud: moveHorizontal(1)
        Cloud->>Canvas: erase(this)
        Cloud->>Canvas: draw(this, color, RoundRectangle)
        Canvas->>Canvas: wait(5ms)
    end

    deactivate Picture
```
