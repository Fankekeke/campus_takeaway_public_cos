package cc.mrbird.febs.cos.service;

import cc.mrbird.febs.cos.entity.CommodityType;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.LinkedHashMap;

/**
 * @author FanK
 */
public interface ICommodityTypeService extends IService<CommodityType> {

    /**
     * 分页获取餐品类型信息
     *
     * @param page          分页对象
     * @param commodityType 餐品类型信息
     * @return 结果
     */
    IPage<LinkedHashMap<String, Object>> selectTypePage(Page<CommodityType> page, CommodityType commodityType);
}
