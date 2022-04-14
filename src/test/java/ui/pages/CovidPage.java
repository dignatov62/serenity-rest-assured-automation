package ui.pages;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;

public class CovidPage {

    private WebDriver driver;
    private final By qr = By.xpath("//img[@class='qr-image']");

    public CovidPage(WebDriver driver){
        this.driver = driver;
    }

    public void openQr(WebDriver driver) throws IOException, NotFoundException {
        this.driver = driver;
        String qrCodeURL=driver.findElement(qr).getAttribute("src");
        byte[] decoded = Base64.decodeBase64(qrCodeURL);
        BufferedImage bufferedImage = ImageIO.read(new ByteArrayInputStream(decoded));
        // Process the image
        LuminanceSource luminanceSource=new BufferedImageLuminanceSource(bufferedImage);
        BinaryBitmap binaryBitmap=new BinaryBitmap(new HybridBinarizer(luminanceSource));
        //To Capture details of QR code
        Result result =new MultiFormatReader().decode(binaryBitmap);
        driver.get(result.getText());
    }
}
