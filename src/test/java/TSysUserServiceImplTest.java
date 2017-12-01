import ljx.ashin.bean.TSysUser;
import ljx.ashin.service.TSysUserService;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by Ashin Liang on 2017/12/1.
 */
public class TSysUserServiceImplTest extends BaseTest {

    @Resource
    private TSysUserService tSysUserService;

    @Test
    public void getTSysUserTest(){
        TSysUser tSysUser = new TSysUser();
        tSysUser.setId(3);

        TSysUser tSysUser1 = tSysUserService.findTSysUser(tSysUser);
        System.out.println(tSysUser1);
    }
    @Test
    public void addTSysUserTest(){
        TSysUser tSysUser = new TSysUser();
        tSysUser.setName("真功夫");
        tSysUser.setPhoneNum("13923423232");
        tSysUser.setPwd("jferp32");
        int result = tSysUserService.addTSysUser(tSysUser);
        System.out.println(result);
    }
}
