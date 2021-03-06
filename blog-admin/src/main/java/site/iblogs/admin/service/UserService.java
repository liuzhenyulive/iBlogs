package site.iblogs.admin.service;

import site.iblogs.admin.dto.AdminUserDetails;
import site.iblogs.admin.dto.request.PasswordParam;
import site.iblogs.admin.dto.request.ProfileParam;
import site.iblogs.admin.dto.request.RegisterParam;
import site.iblogs.admin.dto.response.UserInfoResponse;

public interface UserService {

    AdminUserDetails getUserByUserName(String username);

    /**
     * 注册功能
     */
    RegisterParam register(RegisterParam umsAdminParam);

    /**
     * 登录功能
     *
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username, String password);

    ProfileParam updateProfile(ProfileParam param);

    PasswordParam updatePassword(PasswordParam param);

    UserInfoResponse info();

    void logout();
}
