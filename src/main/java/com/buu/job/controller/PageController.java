package com.buu.job.controller;

import com.buu.job.service.JobCatService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.UnsupportedEncodingException;

/**
 * Created by robbin on 2016/11/24.
 */
@Controller
public class PageController {
    @Autowired
    public JobCatService jobCatService;
    private Logger logger = LoggerFactory.getLogger(PageController.class);

    @RequestMapping("/page/{postchart}")
    public String page(@PathVariable String postchart){
        logger.info("/page/{postchart} postchart="+postchart);
        return postchart;
    }
    @RequestMapping("/detail/{positionid}")
    public String detail(@PathVariable String positionid, Model model){
        logger.info("/detail/{positionid} positionid="+positionid);
        model.addAttribute("jobid",positionid);
        return "detail";
    }
    @RequestMapping("/index/{job}")
    public String index(@PathVariable String job, String keyword,Model model){
        logger.info("/index/{job} job="+job+",keyword="+keyword);
        String key=keyword.replaceAll("\\?","").replaceAll("labelWords=label","");
        model.addAttribute("job",job);
        model.addAttribute("keyword",key);
        return "index";
    }

}
