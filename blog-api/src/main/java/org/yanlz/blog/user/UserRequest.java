package org.yanlz.blog.user;

/**
 * Created by yanliangzhao on 15/12/29.
 */
public class UserRequest {


    private String nick_name;
    private String protraitUrl;
    private String telephone;

    public String getProtraitUrl() {
        return protraitUrl;
    }

    public void setProtraitUrl(String protraitUrl) {
        this.protraitUrl = protraitUrl;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
