package com.example.conc;

import com.example.abst.Image;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ImageProxy implements InvocationHandler {

    private  String filename;
    private Image realImage;

    public ImageProxy(String filename) {
        this.filename=filename;

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        return method.invoke(realImage, args);

    }

    public static Image createProxy(String filename){
        return (Image) Proxy.newProxyInstance(
                ImageProxy.class.getClassLoader(),
                new Class[]{Image.class},
                new ImageProxy(filename));
    }

}

