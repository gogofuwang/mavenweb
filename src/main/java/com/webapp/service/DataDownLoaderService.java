package com.webapp.service;

import com.domain.GPInfo;

import java.util.Date;
import java.util.List;

public interface DataDownLoaderService {
        List<GPInfo> download(String code , Date startDate , Date endDate);
        List<GPInfo> download(String code , Date date);
        List<GPInfo> download(String code);
}
