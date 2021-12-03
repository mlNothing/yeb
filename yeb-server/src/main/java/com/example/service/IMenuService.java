package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.pojo.Menu;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author mlx
 * @since 2021-11-16
 */
public interface IMenuService extends IService<Menu> {

    List<Menu> getMenuByAdminId();
}
