package com.log.check;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * JDK 8 特性
 * Created by taolang on 2017/4/12.
 */
public class LogCheck {

    public static void main(String[] args) throws IOException {
        // Java 7 例子
        // Files.readAllBytes默认以UTF-8编码读入文件，故文件的编码如果不是UTF-8，那么中文内容会出现乱字符
        //System.out.println(new String(Files.readAllBytes(Paths.get("D:\\jd.txt"))));
        // Java 8例子
        //List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\taolang\\Desktop\\新建文件夹\\2.txt"), StandardCharsets.UTF_8);
        //StringBuilder sb = new StringBuilder();
        //for(String line : lines){
        //    if(line.contains("500")) {
        //        sb.append(line);
        //    }
        //}
        //String fromFile = sb.toString();
        //System.out.println(fromFile);

        List<String> list = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get("C://Users//taolang/Desktop/新建文件夹/2.txt"))) {

            //1. filter line 3
            //2. convert all content to upper case
            //3. convert it into a List
            list = stream
                    .filter(line -> line.indexOf(" 500 ")!= -1)
                    //.map(String::toUpperCase)
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }

        list.forEach(System.out::println);

    }

}
