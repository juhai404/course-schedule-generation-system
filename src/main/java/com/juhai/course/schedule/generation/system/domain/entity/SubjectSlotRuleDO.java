package com.juhai.course.schedule.generation.system.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <h2> 科目时间段规则 </h2>
 *
 * @author juhai
 * date 2025/5/13
 */
@Data
@TableName("csgs_subject_slot_rule")
@ApiModel(value = "SubjectSlotRuleDO", description = "科目排课节次规则")
public class SubjectSlotRuleDO implements Serializable {

    @Serial
    private static final long serialVersionUID = 8581484918762255856L;

    @ApiModelProperty("规则ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("科目ID（关联subject.id）")
    @TableField("subject_id")
    private Long subjectId;

    @ApiModelProperty("允许排课节次（对应time_slot.slot_seq）")
    @TableField("allowed_slot_seq")
    private Integer allowedSlotSeq;

    @ApiModelProperty("适用年级（空=全年级）")
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
