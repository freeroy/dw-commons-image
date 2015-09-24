package org.developerworld.commons.image.handler;

import java.awt.image.BufferedImage;
import java.io.OutputStream;

import org.developerworld.commons.image.ImageHandler;

import com.sun.jimi.core.Jimi;
import com.sun.jimi.core.JimiException;

/**
 * @version 20090422
 * @author Roy.Huang
 *
 */
public class TiffImageHandler extends DefaultImageHandler implements ImageHandler{
	
	private static String mimeType="image/jpg";
	
	public TiffImageHandler(){
		super(mimeType);
	}
	
	public TiffImageHandler(String mimeType){
		super(mimeType);
	}

	@Override
	public void saveImage(BufferedImage source,
			String destination) throws JimiException {
		Jimi.putImage(mimeType, source, destination);
	}

	@Override
	public void saveImage(BufferedImage source,
			OutputStream destination) throws JimiException{
		Jimi.putImage(mimeType, source, destination);
	}
}
