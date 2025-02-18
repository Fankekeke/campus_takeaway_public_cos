package cc.mrbird.febs.cos.service;

import cc.mrbird.febs.cos.entity.CommodityInfo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author FanK
 */
public interface ICommodityInfoService extends IService<CommodityInfo> {

    /**
     * 分页查询餐品信息
     *
     * @param page          分页对象
     * @param commodityInfo 餐品信息
     * @return 结果
     */
    IPage<LinkedHashMap<String, Object>> getCommodityByPage(Page<CommodityInfo> page, CommodityInfo commodityInfo);

    /**
     * 小程序热销产品
     *
     * @return 结果
     */
    List<LinkedHashMap<String, Object>> getCommodityHot();

    /**
     * 餐品详情
     *
     * @param commodityId 餐品ID
     * @return 结果
     */
    LinkedHashMap<String, Object> goodsDetail(Integer commodityId);

    /**
     * 查询店铺及餐品信息
     *
     * @return 结果
     */
    List<LinkedHashMap<String, Object>> selShopDetailList();

    /**
     * 获取商铺及餐品详细信息
     *
     * @param shopId 商铺ID
     * @return 结果
     */
    LinkedHashMap<String, Object> getShopDetail(Integer shopId);

    /**
     * 店铺餐品排序方式
     *
     * @param shopId 商铺ID
     * @param type   类型
     * @return 结果
     */
    List<LinkedHashMap<String, Object>> shopCommoditySort(Integer shopId, Integer type);

    /**
     * 模糊查询店内餐品
     *
     * @param shopId 商铺ID
     * @param key    餐品
     * @return 结果
     */
    List<LinkedHashMap<String, Object>> commodityLikeByShop(Integer shopId, String key);

    /**
     * 查找餐品或店铺
     *
     * @param key 餐品
     * @return 结果
     */
    LinkedHashMap<String, Object> getGoodsFuzzy(String key);

    /**
     * 根据用户获取餐品信息
     *
     * @param userId 用户ID
     * @return 结果
     */
    List<LinkedHashMap<String, Object>> getGoodsByUserId(Integer userId);
}
