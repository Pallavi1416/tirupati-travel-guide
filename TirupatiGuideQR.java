package qrcode;
	import java.io.File;
	import com.google.zxing.qrcode.QRCodeWriter;
	import com.google.zxing.BarcodeFormat;
	import com.google.zxing.common.BitMatrix;
	import com.google.zxing.client.j2se.MatrixToImageWriter;

	public class TirupatiGuideQR {
	    public static void main(String[] args) {
	        try {
	            // 🔹 Your GitHub Pages link (replace "main" with GitHub Pages link once you enable Pages)
	            String url = "https://github.com/Pallavi1416/tirupati-travel-guide.git";

	            // QR Code size
	            int width = 400;
	            int height = 400;

	            // Generate QR Code
	            QRCodeWriter qrCodeWriter = new QRCodeWriter();
	            BitMatrix bitMatrix = qrCodeWriter.encode(url, BarcodeFormat.QR_CODE, width, height);

	            // Save as PNG file
	            File outputFile = new File("TirupatiGuideQR.png");
	            MatrixToImageWriter.writeToPath(bitMatrix, "PNG", outputFile.toPath());

	            System.out.println("✅ QR Code generated successfully!");
	            System.out.println("📂 File saved at: " + outputFile.getAbsolutePath());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	
}
