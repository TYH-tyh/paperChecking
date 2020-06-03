package com.paperchecking.paperchecking.web;

import com.paperchecking.paperchecking.dao.UserRepository;
import com.paperchecking.paperchecking.domain.User;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.Max;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

@Controller
public class indexController {
    private static String filename;
    private static String msg1 = null;
    @Autowired
    UserRepository userRepository;
    @GetMapping("/index")
    public String index(String id,String name,String part1,String part2,String part3){
        System.out.println("ID:"+id);
        System.out.println("姓名:"+name);
        System.out.println("第一部分内容:"+part1);
        System.out.println("第二部分内容:"+part2);
        System.out.println("第三部分内容:"+part3);
        return "index";
    }


    @GetMapping("/front")
    public String front(String id,String name,String part1,String part2,String part3) {
        return "front";
    }

    @GetMapping("/result")
    public String result(HttpServletRequest request){
        String str1, x, doc_name;

        x = OneController.max;
        doc_name = OneController.filename;
        str1 = OneController.file_name;

        request.setAttribute("result1", doc_name);
        request.setAttribute("result2", str1);
        request.setAttribute("result3", x);

        return "result";
    }


}


