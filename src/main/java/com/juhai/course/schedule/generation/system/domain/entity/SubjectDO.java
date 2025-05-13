package com.juhai.course.schedule.generation.system.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <h2> 科目信息 </h2>
 *
 * @author juhai
 * date 2025/5/13
 */
@Data
@TableName("csgs_subject")
@ApiModel(value = "SubjectDO", description = "科目信息")
public class SubjectDO implements Serializable {

    @Serial
    private static final long serialVersionUID = -7534437293709781623L;

    @ApiModelProperty("科目ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("学科名称（如：数学）")
    @TableField("name")
    private String name;

    @ApiModelProperty("科目编码（如MATH001）")
    @TableField("code")
    private String code;

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
