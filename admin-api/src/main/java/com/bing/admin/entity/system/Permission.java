package com.bing.admin.entity.system;

import com.bing.admin.common.domain.BaseDomain;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @desc:
 * @author: WB38113
 * @date: 2020/7/21 17:49
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class Permission extends BaseDomain {
    /**父节点ID*/
    private Long parentId;
    /**菜单类型*/
    private Integer displayType;
    /**中文名称*/
    private String cname;
    /**英文名称*/
    private String ename;
    /**菜单地址*/
    private String url;
}
