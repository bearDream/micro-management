package cn.ching.mng.service.worker;

import cn.ching.mandal.config.annoatation.Reference;
import cn.ching.mng.service.layer.MngService;
import cn.ching.user.service.layer.UserLayer;
import org.springframework.stereotype.Service;

/**
 * @author: laxzhang
 * @email: laxzhang@outlook.com
 * @description: 后台业务代码
 **/
@Service
public class MngServiceImpl implements MngService {

    @Reference
    private UserLayer userLayer;

    @Override
    public String getUserNameByUserId(Long userId) {
        return userLayer.getUserNameById(userId);
    }
}
