public class Printer {

    private int sheets;

    public Printer(int sheets) {
        this.sheets = sheets;
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
}
