package com.kowalski7.mybook.Factory;

import com.kowalski7.mybook.Service.BMPImageLoader;
import com.kowalski7.mybook.Entity.ImageContent;
import com.kowalski7.mybook.Service.JPGImageLoader;

public class ImageLoaderFactory {
    public static ImageContent create(String url) throws Exception {
        if(url.toLowerCase().endsWith(".jpg")) {
            JPGImageLoader jpgLoader = new JPGImageLoader();
            return jpgLoader.load(url);
        } else if (url.toLowerCase().endsWith(".bmp")) {
            BMPImageLoader bmpLoader = new BMPImageLoader();
            return bmpLoader.load(url);
        } else {
            throw new Exception("Unknown image format!");
        }
    }
}
