package cc.mrbird.febs.cos.controller;


import cc.mrbird.febs.common.utils.R;
import cc.mrbird.febs.cos.entity.CommodityInfo;
import cc.mrbird.febs.cos.entity.ShopInfo;
import cc.mrbird.febs.cos.service.ICommodityInfoService;
import cc.mrbird.febs.cos.service.IShopInfoService;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @author FanK
 */
@RestController
@RequestMapping("/cos/commodity-info")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CommodityInfoController {

    private final ICommodityInfoService commodityInfoService;

    private final IShopInfoService shopInfoService;

    /**
     * 分页获取餐品信息
     *
     * @param page          分页对象
     * @param commodityInfo 餐品信息
     * @return 结果
     */
    @GetMapping("/page")
    public R page(Page<CommodityInfo> page, CommodityInfo commodityInfo) {
        return R.ok(commodityInfoService.getCommodityByPage(page, commodityInfo));
    }

    /**
     * 获取餐品信息
     *
     * @return 结果
     */
    @GetMapping("/list")
    public R list() {
        return R.ok(commodityInfoService.list(Wrappers.<CommodityInfo>lambdaQuery().eq(CommodityInfo::getDelFlag, 0)));
    }

    /**
     * 获取餐品信息
     *
     * @param key 餐品名称
     * @return 结果
     */
    @GetMapping("/commodity/list")
    public R commodityList(@RequestParam(value = "key", required = false) String key) {
        return R.ok(commodityInfoService.list(Wrappers.<CommodityInfo>lambdaQuery().eq(CommodityInfo::getDelFlag, 0).gt(CommodityInfo::getStockNum, 0)
                .like(StrUtil.isNotEmpty(key), CommodityInfo::getName, key)));
    }

    /**
     * 获取餐品详细信息
     *
     * @param id ID
     * @return 结果
     */
    @GetMapping("/detail/{id}")
    public R detail(@PathVariable("id") Integer id) {
        return R.ok(commodityInfoService.getById(id));
    }

    /**
     * 新增餐品信息
     *
     * @param commodityInfo 餐品信息
     * @return 结果
     */
    @PostMapping
    public R save(CommodityInfo commodityInfo) {
        // 获取商铺信息
        ShopInfo shopInfo = shopInfoService.getOne(Wrappers.<ShopInfo>lambdaQuery().eq(ShopInfo::getSysUserId, commodityInfo.getShopId()));
        if (shopInfo != null) {
            commodityInfo.setShopId(shopInfo.getId());
        }
        commodityInfo.setCreateDate(DateUtil.formatDateTime(new Date()));
        commodityInfo.setCode("COMM-" + System.currentTimeMillis());
        return R.ok(commodityInfoService.save(commodityInfo));
    }

    /**
     * 修改餐品信息
     *
     * @param commodityInfo 餐品信息
     * @return 结果
     */
    @PutMapping
    public R edit(CommodityInfo commodityInfo) {
        return R.ok(commodityInfoService.updateById(commodityInfo));
    }

    /**
     * 删除餐品信息
     *
     * @param ids 主键IDS
     * @return 结果
     */
    @DeleteMapping("/{ids}")
    public R deleteByIds(@PathVariable("ids") List<Integer> ids) {
        return R.ok(commodityInfoService.removeByIds(ids));
    }
}
