package com.juhai.course.schedule.generation.system.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <h2> 班级课表 </h2>
 *
 * @author juhai
 * date 2025/5/13
 */
@Data
@TableName("csgs_class_schedule")
@ApiModel(value = "ClassScheduleDO", description = "排课记录")
public class ClassScheduleDO implements Serializable {

    @Serial
    private static final long serialVersionUID = -3063439181904468934L;

    @ApiModelProperty("排课记录ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("学期ID（关联semester.id）")
    @TableField("semester_id")
    private Long semesterId;

    @ApiModelProperty("班级ID（关联class.id）")
    @TableField("class_id")
    private Long classId;

    @ApiModelProperty("时间段ID（关联time_slot.id）")
    @TableField("time_slot_id")
    private Long timeSlotId;

    @ApiModelProperty("科目ID（关联subject.id）")
    @TableField("subject_id")
    private Long subjectId;

    @ApiModelProperty("教师ID（关联teacher.id）")
    @TableField("teacher_id")
    private Long teacherId;

    @ApiModelProperty("创建时间")
    @TableField(value = "gmt_create")
    private LocalDateTime gmtCreate;

    @ApiModelProperty("创建人")
    @TableField(value = "create_nick", fill = FieldFill.INSERT)
    private String createNick;

    @ApiModelProperty("更新时间")
    @TableField(value = "gmt_modified")
    private LocalDateTime gmtModified;

    @ApiModelProperty("修改人")
    @TableField(value = "modified_nick", fill = FieldFill.INSERT_UPDATE)
    private String modifiedNick;
}
