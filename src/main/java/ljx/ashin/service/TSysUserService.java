package ljx.ashin.service;

import ljx.ashin.bean.TSysUser;

/**
 * Created by Ashin Liang on 2017/12/1.
 */
public interface TSysUserService {
    /**
     * 添加一个系统管理员
     * @param tSysUser
     * @return
     */
    public int addTSysUser(TSysUser tSysUser);

    /**
     * 查找
     * @param tSysUser
     * @return
     */
    public TSysUser findTSysUser(TSysUser tSysUser);
}
