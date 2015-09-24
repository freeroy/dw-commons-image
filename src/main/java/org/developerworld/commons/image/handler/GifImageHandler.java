package org.developerworld.commons.image.handler;

import java.awt.image.BufferedImage;
import java.io.OutputStream;

import org.developerworld.commons.image.ImageHandler;
import org.developerworld.commons.image.gif.AnimatedGifEncoder;

/**
 * @version 20090422
 * @author Roy.Huang
 *
 */
public class GifImageHandler extends DefaultImageHandler implements ImageHandler{
	
	private static String mimeType="image/gif";
	
	public GifImageHandler(){
		super(mimeType);
	}

	@Override
	public void saveImage(BufferedImage source,
			String destination) {
		AnimatedGifEncoder agf = new AnimatedGifEncoder();
		agf.start(destination);
		agf.addFrame(source);
		agf.finish();
	}

	@Override
	public void saveImage(BufferedImage source,
			OutputStream destination){
		AnimatedGifEncoder agf = new AnimatedGifEncoder();
		agf.start(destination);
		agf.addFrame(source);
		agf.finish();
	}

}
