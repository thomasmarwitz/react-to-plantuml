package edu.kit.informatik.file;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.util.Collection;

/**
 * Recursively searchs a target dir for files with given extensions.
 *
 * @author Thomas Marwitz
 * @version 1.0
 */
public class ProjectScraper {

    private final File targetDir;
    private final String[] extensions;
    private final String srcProjectPath;

    /**
     * Instantiates a new Project scraper.
     *
     * @param srcProjectPath the src project path
     */
    public ProjectScraper(String srcProjectPath) {
        this(srcProjectPath, new String[] {"js", "jsx", "ts", "tsx"}); // default react files
    }

    public ProjectScraper(String srcProjectPath, String[] extensions) {
        this.srcProjectPath = srcProjectPath;
        targetDir = new File(srcProjectPath);
        this.extensions = extensions;
    }

    /**
     * Perform a recursive search an list all components in directory.
     */
    public void getProjectFiles() {
        Collection<File> result = FileUtils.listFiles(targetDir, extensions, true);
        result.forEach(System.out::println);
    }

    /**
     * Gets src project path.
     *
     * @return the src project path
     */
    public String getSrcProjectPath() {
        return srcProjectPath;
    }
}
