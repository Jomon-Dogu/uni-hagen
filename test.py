import random

def wetter_vorhersage():
    wetter_sprüche = [
        "Es regnet Katzen und Hunde... aber ohne Regenschirm!",
        "Heute gibt es perfektes Wetter für Couch-Potatoes!",
        "Die Sonne scheint... aber nur im Herzen.",
        "Das Wetter draußen ist so grau, dass selbst die Wolken eingeschlafen sind.",
        "Es ist so kalt, dass die Kühlschränke nach draußen ziehen.",
        "Warnung: Windig! Bring deinen eigenen Anker mit.",
        "Es regnet so stark, dass sogar die Enten einen Regenschirm brauchen.",
        "Das Wetter ist so schlecht, dass die Sonne Urlaub genommen hat."
    ]
    print("Wettervorhersage:", random.choice(wetter_sprüche))

wetter_vorhersage()
