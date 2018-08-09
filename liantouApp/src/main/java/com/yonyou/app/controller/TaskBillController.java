package com.yonyou.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yonyou.app.service.ITaskBillService;

/**
 * 
 * @开发者 ^_^ 张佳宾 *_*<br>
 *
 * @时间 2018年7月11日
 *
 *     联投项目需求
 */
@RestController
@RequestMapping("/taskbill")
public class TaskBillController {

	@Autowired
	private ITaskBillService taskBillService;

	@RequestMapping("/jsonbill")
	public String queryJsonBill(String userId, String taskId) {
		try {
			return taskBillService.queryJsonBill(userId, taskId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@RequestMapping("/getApproveDetail")
	public String getApproveDetail(String userId,String taskId) {
		try {
			return taskBillService.getApproveDetail(userId, taskId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@RequestMapping("/getTaskActions")
	public String getTaskActions(String taskId) {
		try {
			return taskBillService.getTaskActions(taskId);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@RequestMapping("/doAgree")
	public String doAgree(String userId, String taskId, String note) {
		try {
			note = new String(note.getBytes("ISO8859-1"), "UTF-8");// 解決get提交审批批语乱码
			return taskBillService.doAgree(userId, taskId, note);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@RequestMapping("/doDisAgree")
	public String doDisAgree(String userId, String taskId, String note) {
		try {
			note = new String(note.getBytes("ISO8859-1"), "UTF-8");// 解決get提交审批批语乱码
			return taskBillService.doDisAgree(userId, taskId, note);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@RequestMapping("/doReject")
	public String doReject(String userId, String taskId, String note) {
		try {
			note = new String(note.getBytes("ISO8859-1"), "UTF-8");// 解決get提交审批批语乱码
			return taskBillService.doReject(userId, taskId, note);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@RequestMapping(value = "/getMessageAttachment")
	public void getMessageAttachment(String userId, String fileId, HttpServletRequest request,
			HttpServletResponse response) {
		try {
			fileId = new String(fileId.getBytes("ISO8859-1"), "UTF-8");// 解決get提交审批批语乱码
			fileId = fileId.replaceAll(",", "&#%");
			taskBillService.getMessageAttachment(userId, fileId, request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
