package cc.mrbird.febs.cos.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 餐品管理
 *
 * @author FanK
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CommodityInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 餐品编号
     */
    private String code;

    /**
     * 餐品名称
     */
    private String name;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 库存数量
     */
    private Integer stockNum;

    /**
     * 餐品型号
     */
    private String model;

    /**
     * 餐品描述
     */
    private String content;

    /**
     * 创建时间
     */
    private String createDate;

    /**
     * 图册
     */
    private String images;

    /**
     * 删除标识
     */
    private String delFlag;

    /**
     * 所属商家
     */
    private Integer shopId;

    /**
     * 餐品类型
     */
    private Integer type;

    /**
     * 餐品状态（0.下架 1.上架）
     */
    private String onPut;
}
