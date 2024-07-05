public interface Printer extends PrintDocument, ScanDocument, FaxDocument {


    void printDocument();
    void scanDocument();
    void faxDocument();

}
