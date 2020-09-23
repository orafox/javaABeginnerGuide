package com.ch12;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class AutoBox {
    public static void main(String[] args) {

        Integer iOb =100; //autobox an int
        int i = iOb; //auto unbox


        System.out.println(i + " " + iOb);
    }


}
