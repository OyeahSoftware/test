package com.qianmi.ceb;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 模拟缴费单查询
 * Created by dj on 2014/6/9.
 */
public class QueryBillInfoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.setContentType("text/html;charset=UTF-8");
        System.out.println("我是doPost()方法！用来处理post请求");
        PrintWriter out = resp.getWriter();


//        <?xml version="1.0" encoding="ISO-8859-1"?>
//        <out>
//        <head>
//        <Version>1.0.1</Version>
//        <InstId>100000000000001</InstId>
//        <AnsTranCode>BJCEBQBIRes</AnsTranCode>
//        <TrmSeqNum>2010051000013010</TrmSeqNum>
//        </head>
//        <tout>
//        <billKey>123456</billKey>
//        <companyId>654321</companyId>
//        <item1/>
//        <item2/>
//        <item3/>
//        <item4/>
//        <item5/>
//        <item6/>
//        <item7/>
//        <totalNum/>
//        <Data>
//        <contractNo>123456</contractNo>
//        <customerName>张三</customerName>
//        <balance/>
//        <payAmount>2314</payAmount>
//        <beginDate/>
//        <endDate/>
//        <filed1/>
//        <filed2/>
//        <filed3/>
//        <filed4/>
//        <filed5/>
//        </Data>
//        </tout>
//        </out>
        out.println("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><out><head><Version>1.0.1</Version><InstId>100000000000001</InstId><AnsTranCode>BJCEBQBIRes</AnsTranCode><TrmSeqNum>2010051000013010</TrmSeqNum></head><tout><billKey>123456</billKey><companyId>654321</companyId><item1></item1><item2></item2><item3></item3><item4></item4><item5></item5><item6></item6><item7></item7><totalNum></totalNum><Data><contractNo>123456</contractNo><customerName>张三</customerName><balance></balance><payAmount>2314</payAmount><beginDate></beginDate><endDate></endDate><filed1></filed1><filed2></filed2><filed3></filed3><filed4></filed4><filed5></filed5></Data></tout></out>");

    }
}
