package edu.kit.informatik;

import edu.kit.informatik.file.ProjectScraper;

/**
 * The entry point for the application
 *
 * @author thomas
 * @version 1.0
 */
public final class Main {

    private static final String targetDirectory = "/Users/thomas/Documents/Projekte/PSE/pse-prototype/src";

    public static void main(String[] args) {
        ProjectScraper scraper = new ProjectScraper(targetDirectory);
        scraper.getProjectFiles(true).forEach(System.out::println);
    }
}
