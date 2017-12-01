package ljx.ashin.service;

import ljx.ashin.bean.TSysUser;
import ljx.ashin.dao.system.TSysUserDao;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Ashin Liang on 2017/12/1.
 */
@Service
public class TSysUserServiceImpl implements TSysUserService {

    @Resource
    private TSysUserDao tSysUserDao;
    /**
     * 添加一个系统管理员
     *
     * @param tSysUser
     * @return
     */
    public int addTSysUser(TSysUser tSysUser) {
        return tSysUserDao.insert(tSysUser);
    }

    /**
     * 查找
     *
     * @param tSysUser
     * @return
     */
    @Cacheable(value = "tSysUser")
    public TSysUser findTSysUser(TSysUser tSysUser) {
        return tSysUserDao.getById(tSysUser.getId());
    }
}
