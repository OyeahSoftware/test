package com.qianmi.ceb;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 模拟申请密钥
 * Created by dj on 2014/6/9.
 */
public class ApplyKeyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        System.out.println("我是doPost()/doGet()方法！用来处理get/post请求");
        PrintWriter out = resp.getWriter();
        //resp.setContentType("text/html;charset=UTF-8");
//        response 报文内容：
//        <?xml version="1.0" encoding="ISO-8859-1"?>
//        <out>
//        <head>
//        <Version>1.0.1</Version>
//        <InstId>100000000000001</InstId>
//        <AnsTranCode>BJCEBRWKRes</AnsTranCode>
//        <TrmSeqNum>2011051300074921</TrmSeqNum>
//        </head>
//        <tout>
//        <partnerCode>746</partnerCode>
//        <returnCode>00</returnCode>
//        <errorDescription/>
//        <keyName>ZPK</keyName>
//        <keyValue>05BE38FE04E6C42A</keyValue>
//        <verifyValue>8618C4D2632796AA</verifyValue>
//        <keyName1>ZAK</keyName1>
//        <keyValue1>5339766038244AAC</keyValue1>
//        <verifyValue1>C4C15BDA9E7B31D9</verifyValue1>
//        </tout>
//        </out>
        out.println("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><out><head><Version>1.0.1</Version><InstId>100000000000001</InstId><AnsTranCode>BJCEBRWKRes</AnsTranCode><TrmSeqNum>2011051300074921</TrmSeqNum></head><tout><partnerCode>746</partnerCode><returnCode>00</returnCode><errorDescription></errorDescription><keyName>ZPK</keyName><keyValue>05BE38FE04E6C42A</keyValue><verifyValue>8618C4D2632796AA</verifyValue><keyName1>ZAK</keyName1><keyValue1>5339766038244AAC</keyValue1><verifyValue1>C4C15BDA9E7B31D9</verifyValue1></tout></out>");
    }
}
