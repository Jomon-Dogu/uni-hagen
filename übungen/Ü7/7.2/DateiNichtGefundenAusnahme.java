class DateiNichtGefundenAusnahme extends Exception {
    private String dateiname; // Attribut, um den Dateinamen zu speichern

    // Konstruktor
    public DateiNichtGefundenAusnahme(String dateiname) {
        super("Datei wurde nicht gefunden."+ dateiname); // Fehlermeldung an die Basisklasse übergeben
        this.dateiname = dateiname; // Dateiname speichern
    }

    // Methode, um den Dateinamen zurückzugeben
    public String liefereDateinamen() {
        return dateiname;
    }
}