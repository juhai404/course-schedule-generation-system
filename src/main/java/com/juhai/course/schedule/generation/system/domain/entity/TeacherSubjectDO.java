package com.juhai.course.schedule.generation.system.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <h2> 教师科目关联 </h2>
 *
 * @author juhai
 * date 2025/5/13
 */
@Data
@TableName("csgs_teacher_subject")
@ApiModel(value = "TeacherSubjectDO", description = "教师授课关系")
public class TeacherSubjectDO implements Serializable {

    @Serial
    private static final long serialVersionUID = 2920164383942946189L;

    @ApiModelProperty("记录ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("教师ID（关联teacher.id）")
    @TableField("teacher_id")
    private Long teacherId;

    @ApiModelProperty("科目ID（关联subject.id）")
    @TableField("subject_id")
    private Long subjectId;

    @ApiModelProperty("任教年级（7/8/9）")
    @TableField("grade")
    private Integer grade;

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
