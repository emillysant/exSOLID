public class FunctionPrint implements Printer{

    @Override
    public void printDocument() {
        System.out.println("Imprimindo documento...");
    }

    @Override
    public void scanDocument() {
        System.out.println("Escaneando documento...");
    }

    @Override
    public void faxDocument() {
        System.out.println("Enviando fax...");
    }
}
