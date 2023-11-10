package util;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
public class Upload {
    public static void file(String filepath){
        // Create a StringSelection object with the file path
        StringSelection stringSelection = new StringSelection(filepath);

        // Set the clipboard contents to the file path
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        // Use the Robot class to handle keyboard events (Ctrl+V and Enter) to paste the file path and confirm the file selection
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        robot.delay(1000); // Delay to give time for the file dialog to open

        // Simulate pressing Ctrl+V (paste)
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Press Enter to confirm the file selection
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        // Wait for a few seconds (adjust as needed) to allow the upload to complete
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
