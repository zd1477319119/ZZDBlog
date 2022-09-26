package com.zzd.controller;

import com.zzd.domain.ResponseResult;
import com.zzd.domain.entity.Article;
import com.zzd.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @Author zzd
 * @Description TODO
 * @Date 2022/9/25 10:12
 * @Version 1.0
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

//    @GetMapping("/list")
//    public List<Article> test() {
//        return articleService.list();
//    }

    @GetMapping("/hotArticleList")
    public ResponseResult hotArticleList() {
        // 查询热门文章 封装成 ResponseResult 返回
        ResponseResult responseResult = articleService.hotArtickeList();

//        Map<String, Integer> map = new HashMap<>();
//        map.put("zzd", 25);
//        map.put("hy", 18);
//        map.put("lkj", 48);
//        Set<Map.Entry<String, Integer>> entries = map.entrySet();
//        entries.stream()
//                .filter(entry -> entry.getValue()<40)
//                .forEach(entry -> System.out.println(entry.getValue()));
        return responseResult;
    }
}
