package com.example.sanfen.imageloader.cache;

import android.graphics.Bitmap;
import android.util.LruCache;

import java.lang.ref.SoftReference;


/**
 * Created by sanfen on 16/5/31.
 */
public class ImageCache {

    //图片缓存
    private LruCache<String, SoftReference<Bitmap>> mBitmapList;
    private ImageCache mImageCache;
    private ImageCache(){
    }

    public ImageCache getInstance(){
        if (mImageCache == null){
            synchronized (ImageCache.class){
                if (mImageCache == null){
                    mImageCache = new ImageCache();
                }
            }
        }
        return mImageCache;
    }


    //初始化缓存
    public void init(){
        mBitmapList = new LruCache<>(10);
    }
    
}
