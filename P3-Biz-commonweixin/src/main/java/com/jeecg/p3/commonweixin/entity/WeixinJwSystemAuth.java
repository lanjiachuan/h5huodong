package com.jeecg.p3.commonweixin.entity;

import org.jeecgframework.p3.core.utils.persistence.Entity;

/**
 * 描述：</b>JwSystemAuth:运营系统权限表; InnoDB free: 9216 kB<br>
 * @author junfeng.zhou
 * @since：2015年12月21日 10时28分27秒 星期一 
 * @version:1.0
 */
public class WeixinJwSystemAuth implements Entity<Long> {
	private static final long serialVersionUID = 1L;
	
	/**
	 *菜单图标
	 */
	private String iconType;
	@Override
	public String toString() {
		return "JwSystemAuth [id=" + id + ", authId=" + authId + ", authName="
				+ authName + ", isLogs=" + isLogs + ", authType=" + authType
				+ ", authDesc=" + authDesc + ", authContr=" + authContr
				+ ", parentAuthId=" + parentAuthId + ", sortNo=" + sortNo
				+ ", bizLevel=" + bizLevel + ", leafInd=" + leafInd
				+ ", delStat=" + delStat + "]";
	}
	public void setIconType(String iconType) {
		this.iconType = iconType;
	}
	public String getIconType() {
		return iconType;
	}
	
}
