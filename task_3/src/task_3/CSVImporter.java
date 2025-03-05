package task_3;

class CSVImporter extends DataImporter {
    @Override
    protected void readData(String filePath) {
        System.out.println("Reading CSV data from " + filePath);
        // Implementation for reading CSV data
    }

    @Override
    protected void parseData() {
        System.out.println("Parsing CSV data...");
        // Implementation for parsing CSV data
    }

    @Override
    protected void validateData() {
        System.out.println("Validating CSV data...");
        // Implementation for validating CSV data
    }
}

