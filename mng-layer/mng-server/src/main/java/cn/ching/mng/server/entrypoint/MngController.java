package cn.ching.mng.server.entrypoint;

import cn.ching.mng.service.layer.MngService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: laxzhang
 * @email: laxzhang@outlook.com
 * @description:
 **/
@RestController
@RequestMapping("/mng")
public class MngController {

    @Autowired
    private MngService mngService;

    @RequestMapping("/index")
    public String index(@RequestParam String msg){
        return mngService.getUserNameByUserId(1L);
    }
}
