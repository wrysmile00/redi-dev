package com.redimybase.manager.flowable.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

import com.redimybase.framework.mybatis.id.IdEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 流程定义表
 * </p>
 *
 * @author vim
 * @since 2018-10-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_flow_definition")
public class FlowDefinitionEntity extends IdEntity<String> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    /**
     * 定义名称
     */
    @TableField("name")
    private String name;

    /**
     * 定义key
     */
    @TableField("key")
    private String key;

    /**
     * 所属种类
     */
    @TableField("category_id")
    private String categoryId;

    /**
     * 状态(0:未部署,1:已部署,2:测试中)
     */
    @TableField("status")
    private Integer status;

    /**
     * 定义描述
     */
    @TableField("description")
    private String description;

    /**
     * 工作流流程定义key
     */
    @TableField("flow_definition_key")
    private String flowDefinitionKey;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;

    /**
     * 创建人
     */
    @TableField("creator")
    private String creator;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}