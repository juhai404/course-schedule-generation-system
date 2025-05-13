package com.juhai.course.schedule.generation.system.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <h2> 年级课程 </h2>
 *
 * @author juhai
 * date 2025/5/13
 */
@Data
@TableName("csgs_grade_course")
@ApiModel(value = "GradeCourseDO", description = "年级课程")
public class GradeCourseDO implements Serializable {

    @Serial
    private static final long serialVersionUID = 4952511587242194711L;

    @ApiModelProperty("年级代码（7/8/9）")
    @TableId(value = "grade", type = IdType.INPUT)
    private Integer grade;

    @ApiModelProperty("科目ID（关联subject.id）")
    @TableId(value = "subject_id", type = IdType.INPUT)
    private Long subjectId;

    @ApiModelProperty("周课时数")
    @TableField("weekly_lessons")
    private Integer weeklyLessons;

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