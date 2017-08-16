package com.mmall.service;

import com.mmall.common.ServerResponse;

/**
 * Created by Administrator on 2017/8/15 0015.
 */
public interface ICategoryService {
    ServerResponse addCategory(String categoryName, Integer parentId);

    ServerResponse updateCategoryName(Integer categoryId, String categoryName);
}
