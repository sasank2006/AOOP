package task_3;

class XMLImporter extends DataImporter {
    @Override
    protected void readData(String filePath) {
        System.out.println("Reading XML data from " + filePath);
        // Implementation for reading XML data
    }

    @Override
    protected void parseData() {
        System.out.println("Parsing XML data...");
        // Implementation for parsing XML data
    }

    @Override
    protected void validateData() {
        System.out.println("Validating XML data...");
        // Implementation for validating XML data
    }
}
