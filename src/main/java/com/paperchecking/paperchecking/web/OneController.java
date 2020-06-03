package com.paperchecking.paperchecking.web;

import com.paperchecking.paperchecking.dao.UserRepository;
import com.paperchecking.paperchecking.domain.User;


import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

import java.io.File;
import java.io.FileInputStream;




import org.apache.poi.xwpf.extractor.XWPFWordExtractor;


import java.util.List;


@RestController
public class OneController<HWPFDocument> {

    public static double Similarity = 0, MAX = 0;
    public static String max, filename, msg1, file_name;

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/save")
    public String save(User file) {
        userRepository.save(file);
        //System.out.println(file);
        return "ok";
    }

    @RequestMapping("/find")
    public String find() {
        List<User> findAll = userRepository.findAll();
        System.out.println(findAll);
        return "/";
    }

    @RequestMapping("/findByName")
    public String findByName() {
        User findByName = userRepository.findByName("2017221103013");
        System.out.println(findByName);
        System.out.println("part3:\n" + findByName.getPart3());
        return "ok";
    }

    @RequestMapping("/findById")
    public String findById() {
        Optional<User> findById = userRepository.findById("1");
        System.out.println(findById);
        //System.out.println("part3:\n"+findByName.getPart3());
        return "ok";
    }

  /*  @RequestMapping("/front1")
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile file, HttpServletRequest request)
            throws IllegalStateException, IOException {
        System.out.println("UploadController.upload()");

        // 判断上传的文件是否为空
        boolean isEmpty = file.isEmpty();
        System.out.println("\tisEmpty=" + isEmpty);
        if (isEmpty) {
            throw new RuntimeException("上传失败！上传的文件为空！");
        }

        // 检查文件大小
        long fileSize = file.getSize();
        System.out.println("\tsize=" + fileSize);
        if (fileSize > 1 * 1024 * 1024) {
            throw new RuntimeException("上传失败！上传的文件大小超出了限制！");
        }

        // 检查文件MIME类型
        String contentType = file.getContentType();
        System.out.println("\tcontentType=" + contentType);
        List<String> types = new ArrayList<String>();
        types.add("application/msword");
        if (!types.contains(contentType)) {
            throw new RuntimeException("上传失败！不允许上传此类型的文件！");
        }

        // 准备文件夹,获取项目中upload文件夹的路径
        String parentDir = request.getServletContext().getRealPath("/upload/");
        request.getSession().getServletContext().getRealPath("");
        //request.getRealPath("");
        System.out.println("\tpath=" + parentDir);
        File parent = new File(parentDir);
        if (!parent.exists()) {
            parent.mkdirs();
        }

        // 获取原始文件名
        String originalFilename = file.getOriginalFilename();
        System.out.println("\toriginalFilename=" + originalFilename);

        // 确定最终保存时使用的文件
        // String filename = UUID.randomUUID().toString();
        String suffix = "";
        int beginIndex = originalFilename.lastIndexOf(".");
        if (beginIndex != -1) {
            suffix = originalFilename.substring(beginIndex);
        }

        // 执行保存文件
        File dest = new File(parent, suffix);
        file.transferTo(dest);

        return "OK";
    }*/


    @RequestMapping("/front")
    public static String fileupload(HttpServletRequest request) throws Exception {

//        System.out.println("文件上传");
    //使用fileloads组件完成文件上传
    //上传的位置
    String path = request.getServletContext().getRealPath("/uploads/");
    //判断该路径是否存在
    File file = new File(path);
    if (!file.exists()) {
        //创建该文件夹
        file.mkdirs();
    }
    //解析request对象，获取上传文件
    DiskFileItemFactory factory = new DiskFileItemFactory();
    ServletFileUpload upload = new ServletFileUpload(factory);
    //解析request
    List<FileItem> items = upload.parseRequest(request);
    //遍历
    for (FileItem item : items) {
        if (item.isFormField()) {
            //说明普通表单项
        } else {
            //说明上传文件项
            //获取上传文件名字
            filename = item.getName();
//                String uuid = UUID.randomUUID().toString();
//                filename = uuid+ "_"+filename;
            //完成文件上传
            item.write(new File(path, filename));
            System.out.println(filename);
            //删除临时文件
//                item.delete();
        }
    }
    return "文件上传成功，正在等待运算跳转......";
}

    @RequestMapping("/check")

    public String readAndWriterTest4() throws IOException {
        //从数据库获取数据
        String[] part3 = new String[100];
        String[] name = new String[100];
        List<User> findAll = userRepository.findAll();


        for (int i = 0; i < findAll.size(); i++) {
            part3[i] = findAll.get(i).getPart3();
//                System.out.println("part3 [" + i + "] = " + part3[i]);
        }

//        String part1 = findByName.getPart1();
//        String part2 = findByName.getPart2();
//        String part3 = findByName.getPart3();
        //File file = new File("D:\\IdeaProjects\\paperChecking\\src\\main\\webapp\\uploads\\71843ff5-e16b-4ae7-820c-eb0df532f2fd_2017221005027-田义会-现代信息系统原理实验1报告-模拟通信部分.doc");
        String doc1;
//        Userservlet Userservlet = new Userservlet();
//        Userservlet.printout(HttpServletRe). =
        //        测试专用
//        String str1 = "阿拉啦啦wwww ", str2 = "阿拉啦啦watashi";
//        MAX = ChaChong.getSimilarity(str1,str2);
//
////        读取docx文件中待查重字段
//        String2 = WordReader.string_Part1;
////        读取数据库中先有的项目数量
//        n = DBAdapter.all_file_num();
////
        try {
            //获取文件路径
            String Samepart = "D:\\IdeaProjects\\paperChecking\\src\\main\\webapp\\uploads\\";
            String doc_name = Samepart + filename;
            System.out.println(doc_name);
            FileInputStream fis = new FileInputStream(doc_name);
            XWPFDocument xdoc = new XWPFDocument(fis);
            XWPFWordExtractor extractor = new XWPFWordExtractor(xdoc);
            //读取文件
            doc1 = extractor.getText();
            //System.out.println(doc1.length());
            //System.out.println(doc1.indexOf("实验结果与分析（含重要数据结果分析或核心代码流程分析）"));
            //给文件内容分段
            int len = doc1.length(), _id = 0;
            int location = doc1.indexOf("实验结果与分析（含重要数据结果分析或核心代码流程分析）")+27;
            String parts = doc1.substring(location, len);
//            System.out.println(findAll.size());
            String msg;
            for (int i = 0; i < findAll.size(); i++) {
                part3[i] = findAll.get(i).getPart3();
                name[i] = findAll.get(i).getName();
                Similarity = ChaChong.getSimilarity(parts,part3[i]);
                System.out.println("该报告与文件名为"+name[i]+"的相似度最高为："+MAX * 100 +"%");
                if(Similarity>MAX){
                    MAX = Similarity;
                    _id = i;
                    file_name = name[i];
                }else continue;

//            System.out.println("第一部分：\n"+a[0]+"\n第二部分\n"+b[0]+"\n第三部分\n"+b[1]);
//            System.out.println("part1:\n"+part1+"\npart2:\n"+part2+"\npart3:\n"+part3);
            }
            fis.close();
        } catch (Exception e) {
            // long start = System.currentTimeMillis();
            e.printStackTrace();

        }
        MAX = MAX * 100;
        DecimalFormat df = new DecimalFormat(".00");
        max = df.format(MAX);
        msg1 = "该报告" + filename + "与文件名为:" + file_name + ".docx 的相似度最高, 重复率为：" + max + "%";
        System.out.println(msg1);
        return "文件上传成功，正在等待运算跳转......";
    }
    /*public void printout(HttpServletRequest request,HttpServletResponse response) throws IOException {
        request.setAttribute("msg",msg);
        response.sendRedirect("result.jsp");

    }*/
}