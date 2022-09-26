package com.zzd.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzd.constants.SystemConstants;
import com.zzd.domain.ResponseResult;
import com.zzd.domain.entity.Article;
import com.zzd.domain.vo.HotArticVo;
import com.zzd.mapper.ArticleMapper;
import com.zzd.service.ArticleService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zzd
 * @Description TODO
 * @Date 2022/9/25 10:07
 * @Version 1.0
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

    @Override
    public ResponseResult hotArtickeList() {
        // 查询热门文章，封装成 ResponseResult 返回
        LambdaQueryWrapper<Article> queryWrapper = new LambdaQueryWrapper<>();
        // 必须是正式文章
        queryWrapper.eq(Article::getStatus, SystemConstants.ARTICLE_STATUS_NORMAL);
        // 按照浏览量进行排序
        queryWrapper.orderByDesc(Article::getViewCount);
        // 最多只查询10条
        Page<Article> page = new Page(1, 10);
        page(page, queryWrapper);

        List<Article> articles = page.getRecords();
        // bean 拷贝
        List<HotArticVo> articVos = new ArrayList<>();
        for (Article article : articles) {
            HotArticVo vo = new HotArticVo();
            BeanUtils.copyProperties(article, vo);
            articVos.add(vo);
        }
        return ResponseResult.okResult(articles);
    }
}
