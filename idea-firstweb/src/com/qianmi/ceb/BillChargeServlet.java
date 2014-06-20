package com.qianmi.ceb;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 模拟销帐
 * Created by dj on 2014/6/9.
 */
public class BillChargeServlet extends HttpServlet {

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
//        <AnsTranCode>BJCEBBCRes</AnsTranCode>
//        <TrmSeqNum>2011051300074942</TrmSeqNum>
//        </head>
//        <tout>
//        <billKey>123456</billKey>
//        <companyId>654321</companyId>
//        <billNo>0079200000036834</billNo>
//        <payDate>20110513</payDate>
//        <payAmount>5555</payAmount>
//        <bankBillNo>237202</bankBillNo>
//        <receiptNo/>
//        <acctDate>20110512</acctDate>
//        </tout>
//        </out>

        out.println("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><out><head><Version>1.0.1</Version><InstId>100000000000001</InstId><AnsTranCode>BJCEBBCRes</AnsTranCode><TrmSeqNum>2011051300074942</TrmSeqNum></head><tout><billKey>123456</billKey><companyId>654321</companyId><billNo>0079200000036834</billNo><payDate>20110513</payDate><payAmount>5555</payAmount><bankBillNo>237202</bankBillNo><receiptNo></receiptNo><acctDate>20110512</acctDate></tout></out>");

    }
}
