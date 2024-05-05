package reports;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;

public class utiltyreports {

    public static String capture(WebDriver driver,String screenshotname) throws IOException {
        screenshotname = screenshotname + ".png";
        String path = "C://Users//asus//IdeaProjects//orangeHRM_PROJECT//screenshots//";
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source,new File(path + screenshotname));
        return path + screenshotname;
    }
    }

