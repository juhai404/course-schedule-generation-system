package com.juhai.course.schedule.generation.system.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <h2> 班级 </h2>
 *
 * @author juhai
 * date 2025/5/13
 */
@Data
@TableName("csgs_class")
@ApiModel(value = "ClassDO", description = "班级")
public class ClassDO implements Serializable {

    @Serial
    private static final long serialVersionUID = 4017848449610975720L;

    @ApiModelProperty("班级ID")
    @TableId(type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("年级（7-初一 8-初二 9-初三）")
    @TableField("grade")
    private Integer grade;

    @ApiModelProperty("班级序号（1-12）")
    @TableField("class_num")
    private Integer classNum;

    @ApiModelProperty("创建时间")
    @TableField("gmt_create")
    private LocalDateTime gmtCreate;

    @ApiModelProperty("创建人")
    @TableField(value = "create_nick", fill = FieldFill.INSERT)
    private String createNick;

    @ApiModelProperty("更新时间")
    @TableField("gmt_modified")
    private LocalDateTime gmtModified;

    @ApiModelProperty("修改人")
    @TableField(value = "modified_nick", fill = FieldFill.INSERT_UPDATE)
    private String modifiedNick;
}