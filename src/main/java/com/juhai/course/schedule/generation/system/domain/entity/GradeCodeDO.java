package com.juhai.course.schedule.generation.system.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <h2> 年级代码 </h2>
 *
 * @author juhai
 * date 2025/5/13
 */
@Data
@TableName("csgs_grade_code")
@ApiModel(value = "GradeCodeDO", description = "年级代码")
public class GradeCodeDO implements Serializable {

    @Serial
    private static final long serialVersionUID = 3365424314560948956L;

    @ApiModelProperty("数字代码")
    @TableId(value = "grade_num", type = IdType.INPUT)
    private Integer gradeNum;

    @ApiModelProperty("年级名称")
    @TableField("grade_name")
    private String gradeName;

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
