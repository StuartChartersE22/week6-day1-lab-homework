public class Printer {

    private int sheets;
    private int toner;

    public Printer(int sheets, int toner) {
        this.sheets = sheets;
        this.toner = toner;
    }

    public int getSheets() {
        return this.sheets;
    }

    public void photocopy(int pages, int copies) {
        int numberOfSheetsUsed = pages * copies;
        if(numberOfSheetsUsed < this.sheets){
            this.sheets -= numberOfSheetsUsed;
        }
    }

    public void refillSheets(int sheets) {
        this.sheets += sheets;
    }

    public int getToner() {
        return toner;
    }
}
