package com.yonyou.app.service.impl;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Service;

import com.yonyou.service.ITaskBillService;

import nc.itf.app.task.IAppTaskService.IAppTaskServicePortTypeProxy;

/**
 * 
 * @开发者 ^_^ 张佳宾 *_*<br>
 *
 * @时间 2018年7月11日
 *
 *     联投项目需求
 */
@Service
public class TaskBillServiceImpl implements ITaskBillService {

	private static final String PK_GROUP = "0001M6100000000005S2";

	private IAppTaskServicePortTypeProxy proxy = new IAppTaskServicePortTypeProxy();

	/**
	 *
	 * @param userId
	 * @param taskId
	 * @return
	 * @throws Exception
	 * @see com.yonyou.service.ITaskBillService#queryJsonBill(java.lang.String,
	 *      java.lang.String)
	 */
	@Override
	public String queryJsonBill(String userId, String taskId) throws Exception {
		String jsonBill = proxy.queryBillJson(userId, taskId);
		return jsonBill;
	}

	/**
	 *
	 * @param userId
	 * @param taskId
	 * @param note
	 * @return
	 * @throws Exception
	 * @see com.yonyou.service.ITaskBillService#doAgree(java.lang.String,
	 *      java.lang.String, java.lang.String)
	 */
	@Override
	public String doAgree(String userId, String taskId, String note) throws Exception {
		String doAgree = proxy.doAgree(PK_GROUP, userId, taskId, note, "");
		return doAgree;
	}

	/**
	 *
	 * @param userId
	 * @param taskId
	 * @param note
	 * @return
	 * @throws Exception
	 * @see com.yonyou.service.ITaskBillService#doDisAgree(java.lang.String,
	 *      java.lang.String, java.lang.String)
	 */
	@Override
	public String doDisAgree(String userId, String taskId, String note) throws Exception {
		String doAgree = proxy.doDisAgree(PK_GROUP, userId, taskId, note, "");
		return doAgree;
	}

	/**
	 *
	 * @param userId
	 * @param taskId
	 * @param note
	 * @return
	 * @throws Exception
	 * @see com.yonyou.service.ITaskBillService#doReject(java.lang.String,
	 *      java.lang.String, java.lang.String)
	 */
	@Override
	public String doReject(String userId, String taskId, String note) throws Exception {
		String doAgree = proxy.doReject(PK_GROUP, userId, taskId, note, "");
		return doAgree;
	}

	/**
	 *
	 * @param userId
	 * @param fileid
	 * @param request
	 * @param response
	 * @throws Exception
	 * @see com.yonyou.service.ITaskBillService#getMessageAttachment(java.lang.String,
	 *      java.lang.String, javax.servlet.http.HttpServletRequest,
	 *      javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public void getMessageAttachment(String userId, String fileId, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String messageAttachment = proxy.getMessageAttachment(PK_GROUP, userId, fileId, "", "");
		byte[] bytes = messageAttachment.getBytes();
		byte[] decode = Base64.decodeBase64(bytes);

//		File file = new File("F:\\javaboy.jpg");
//		OutputStream os = new FileOutputStream(file);
//		os.write(decode);
//		os.flush();
//		os.close();

		 response.setContentType("image/jpg");
		 ServletOutputStream outputStream = response.getOutputStream();
		 outputStream.write(decode);
		 outputStream.flush();
		 outputStream.close();
	}

	/**
	 *
	 * @param userId
	 * @return
	 * @throws Exception
	 * @see com.yonyou.service.ITaskBillService#getPsndetail(java.lang.String)
	 */
	@Override
	public String getPsnDetail(String userId) throws Exception {
		return null;
	}

	/**
	 *
	 * @param userId
	 * @param taskId
	 * @return
	 * @throws Exception
	 * @see com.yonyou.service.ITaskBillService#getTaskActions(java.lang.String, java.lang.String)
	 */
	@Override
	public String getTaskActions(String taskId) throws Exception {
		String taskButtonList = proxy.getTaskButtonList(PK_GROUP, taskId);
		return taskButtonList;
	}

}
