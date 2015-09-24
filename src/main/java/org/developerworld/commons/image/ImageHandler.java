package org.developerworld.commons.image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * @version 20090422
 * @author Roy.Huang
 *
 */
public interface ImageHandler {

	/**
	 * 锟斤拷锟斤拷图片
	 * @param source
	 * @return
	 * @throws IOException
	 */
	public BufferedImage loadImage(String source) throws IOException;

	/**
	 *  锟斤拷锟斤拷图片
	 * @param source
	 * @return
	 * @throws IOException
	 */
	public BufferedImage loadImage(File source) throws IOException;
	
	/**
	 *  锟斤拷锟斤拷图片
	 * @param source
	 * @return
	 * @throws IOException
	 */
	public BufferedImage loadImage(InputStream source) throws IOException;
	
	/**
	 *  锟斤拷锟斤拷图片
	 * @param source
	 * @return
	 * @throws IOException
	 */
	public BufferedImage loadImage(URL source) throws IOException;
	
	/**
	 * 锟斤拷锟酵计?
	 * @param source
	 * @param destination
	 * @throws Exception
	 */
	public void saveImage(BufferedImage source,String destination) throws Exception;
	
	/**
	 * 锟斤拷锟酵计?
	 * @param source
	 * @param destination
	 * @throws Exception
	 */
	public void saveImage(BufferedImage source,OutputStream destination) throws Exception;
}