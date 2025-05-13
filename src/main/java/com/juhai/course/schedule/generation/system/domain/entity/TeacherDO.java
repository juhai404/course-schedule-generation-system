package com.juhai.course.schedule.generation.system.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <h2> 教师实体 </h2>
 *
 * @author juhai
 * date 2025/5/13
 */
@Data
@TableName("csgs_teacher")
@ApiModel(value = "TeacherDO", description = "教师信息")
public class TeacherDO implements Serializable {

    @Serial
    private static final long serialVersionUID = -9139139341283732055L;

    @ApiModelProperty("教师ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("教师姓名")
    @TableField("name")
    private String name;

    @ApiModelProperty("教师工号")
    @TableField("employee_id")
    private String employeeId;

    @ApiModelProperty("性别（0-女 1-男）")
    @TableField("gender")
    private Integer gender;

    @ApiModelProperty("育儿状态（0-否 1-是）")
    @TableField("is_parenting")
    private Integer isParenting;

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
