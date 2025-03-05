package task_3;

import java.io.File;

abstract class DataImporter {
    // Template method defining the sequence of steps
    public final void importData(String filePath) {
        try {
            if (!validateFilePath(filePath)) {
                System.out.println("Invalid file path. Please try again.");
                return;
            }
            readData(filePath);
            parseData();
            validateData();
            saveData();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // Abstract methods to be implemented by subclasses
    protected abstract void readData(String filePath);
    protected abstract void parseData();
    protected abstract void validateData();
    
    // Common method to save data
    protected void saveData() {
        System.out.println("Saving data to the database...");
        // Implementation to save data
    }

    // Validate file path
    private boolean validateFilePath(String filePath) {
        File file = new File(filePath);
        return file.exists() && file.isFile();
    }
}
