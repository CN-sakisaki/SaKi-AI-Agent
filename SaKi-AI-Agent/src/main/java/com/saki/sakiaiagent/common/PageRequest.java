package com.saki.sakiaiagent.common;

import lombok.Data;

/**
 * 分页请求包装类
 * @author sakisaki
 * @date 2025/6/27 17:26
 */
@Data
public class PageRequest {

    /**
     * 当前页号
     */
    private int current = 1;

    /**
     * 页面大小
     */
    private int pageSize = 10;

    /**
     * 排序字段
     */
    private String sortField;

    /**
     * 排序顺序（默认降序）
     */
    private String sortOrder = "descend";
}

