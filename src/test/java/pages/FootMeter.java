package pages;

import elements.Button;
import org.openqa.selenium.By;

public class FootMeter {

    public static final Button btnDropDownFoot = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.Spinner[2]/android.widget.RelativeLayout/android.widget.TextView"));
    public static final Button btnListMeter = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.RelativeLayout[3]/android.widget.TextView[1]"));
    public static final Button btnNumber = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.Button[1]"));

    public static Boolean isOpenApps() {
        return btnDropDownFoot.isDisplayed();
    }
}
