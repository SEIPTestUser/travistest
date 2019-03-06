package demopackage;

import ij.IJ;
import ij.ImagePlus;
import ij.process.ImageConverter;

/***
 * This is a simple demonstration class
 * @author agkortzis
 * @since March 2019
 */
public class DemoClass {
	
	/**
	 * Loads the image (from the given cli argument
	 * and transforms the image to grayscale.
	 * Then, it shows both images.
	 * @param args
	 */
	public static void main(String[] args) {
		String path = args[0];
		ImagePlus original = IJ.openImage(path);
		original.show();
		ImagePlus imp = IJ.openImage(path);
		ImageConverter ic = new ImageConverter(imp);
		ic.convertToGray8();
		imp.updateAndDraw();
		imp.show();
	}

}
