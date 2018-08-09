package com.yonyou.app.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @开发者 ^_^ 张佳宾 *_*<br>
 *
 * @时间 2018年7月11日
 *
 *     联投项目需求
 */
public interface ITaskBillService {

	/**
	 *
	 * @param userId
	 * @param taskId
	 * @return
	 */
	public String queryJsonBill(String userId, String taskId) throws Exception;

	/**
	 * 
	 *
	 * @param userId
	 * @param taskId
	 * @param note
	 * @return
	 * @throws Exception
	 */
	public String doAgree(String userId, String taskId, String note) throws Exception;

	/**
	 *
	 * @param userId
	 * @param taskId
	 * @param note
	 * @return
	 */
	public String doDisAgree(String userId, String taskId, String note) throws Exception;

	/**
	 *
	 * @param userId
	 * @param taskId
	 * @param note
	 * @return
	 */
	public String doReject(String userId, String taskId, String note) throws Exception;

	/**
	 *
	 * @param userId
	 * @param fileid
	 * @param request
	 * @param response
	 */
	public void getMessageAttachment(String userId, String fileId, HttpServletRequest request,
			HttpServletResponse response) throws Exception;

	/**
	 *
	 * @param userId
	 * @return 
	 */
	public String getPsnDetail(String userId) throws Exception;

	/**
	 *
	 * @param taskId
	 * @return
	 * @throws Exception
	 */
	public String getTaskActions(String taskId) throws Exception;


}
