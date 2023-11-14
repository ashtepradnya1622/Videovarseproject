package object;

import org.openqa.selenium.support.PageFactory;
import util.Genericutil;

public class Editevent extends Genericutil {
    public Editevent() {
            super();
            PageFactory.initElements(driver(), this);
        }
    }

