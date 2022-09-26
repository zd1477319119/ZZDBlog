package com.zzd.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzd.domain.ResponseResult;
import com.zzd.domain.entity.Article;

/**
 * @Author zzd
 * @Description TODO
 * @Date 2022/9/25 10:05
 * @Version 1.0
 */
public interface ArticleService extends IService<Article> {
    ResponseResult hotArtickeList();
}
