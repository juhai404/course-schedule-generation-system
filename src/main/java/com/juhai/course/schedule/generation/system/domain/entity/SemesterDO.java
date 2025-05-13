package com.juhai.course.schedule.generation.system.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <h2> 学期信息 </h2>
 *
 * @author juhai
 * date 2025/5/13
 */
@Data
@TableName("csgs_semester")
@ApiModel(value = "SemesterDO", description = "学期信息")
public class SemesterDO implements Serializable {

    @Serial
    private static final long serialVersionUID = -4710217692877088154L;

    @ApiModelProperty("学期ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("学期名称（格式：年份+学期，如20231）")
    @TableField("name")
    private String name;

    @ApiModelProperty("起始年份")
    @TableField("start_year")
    private Integer startYear;

    @ApiModelProperty("学期序号（1-第一学期 2-第二学期）")
    @TableField("term_num")
    private Integer termNum;

    @ApiModelProperty("学期开始日期")
    @TableField("start_date")
    private LocalDate startDate;

    @ApiModelProperty("学期结束日期")
    @TableField("end_date")
    private LocalDate endDate;

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
