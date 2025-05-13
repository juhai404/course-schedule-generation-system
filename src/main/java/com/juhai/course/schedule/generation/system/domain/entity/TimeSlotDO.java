package com.juhai.course.schedule.generation.system.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * <h2> 时间节次 </h2>
 *
 * @author juhai
 * date 2025/5/13
 */
@Data
@TableName("csgs_time_slot")
@ApiModel(value = "TimeSlotDO", description = "时间节次")
public class TimeSlotDO implements Serializable {

    @Serial
    private static final long serialVersionUID = 4663920672396279096L;

    @ApiModelProperty("节次序号")
    @TableId(value = "slot_seq", type = IdType.INPUT)
    private Integer slotSeq;

    @ApiModelProperty("开始时间")
    @TableField("start_time")
    private LocalTime startTime;

    @ApiModelProperty("结束时间")
    @TableField("end_time")
    private LocalTime endTime;

    @ApiModelProperty("节次类型（早/中/晚）")
    @TableField("slot_type")
    private String slotType;

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
