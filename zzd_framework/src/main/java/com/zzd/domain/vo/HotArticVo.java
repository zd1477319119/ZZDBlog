package com.zzd.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author zzd
 * @Description TODO
 * @Date 2022/9/25 13:07
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HotArticVo {

    private Long id;
    //标题
    private String title;
    //访问量
    private Long viewCount;
}
