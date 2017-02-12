package com.webapp.service.impl;

import com.domain.GPInfo;
import com.webapp.service.DataDownLoaderService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.List;

public class DataDownLoaderServiceImpl implements DataDownLoaderService {

    protected final Log log = LogFactory.getLog(DataDownLoaderServiceImpl.class);
    public List<GPInfo> download(String code, Date startDate, Date endDate) {
        return null;
    }

    public List<GPInfo> download(String code, Date date) {
        return null;
    }

    public List<GPInfo> download(String code) {
        return null;
    }

    private String SendUrlRequest(String url) {
        String result = "";
        BufferedReader in = null;
        try {
            URL realUrl = new URL(url);
            URLConnection connection = realUrl.openConnection();
            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            log.error("\"发送GET请求出现异常！" + e);
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }
}
