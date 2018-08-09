package com.yonyou.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pub.utils.ExceptionUtil;
import com.yonyou.service.ITaskBillService;

/**
 * 
 * @开发者 ^_^ 张佳宾 *_*<br>
 *
 * @时间 2018年7月11日
 *
 *     联投项目需求
 */
@Controller
@RequestMapping("/taskbill")
public class TaskBillController {

	@Autowired
	private ITaskBillService taskBillService;

	@RequestMapping("/jsonbill")
	@ResponseBody
	public String queryJsonBill(String userId, String taskId) {
		try {
			return taskBillService.queryJsonBill(userId, taskId);
		} catch (Exception e) {
			ExceptionUtil.error("查询代办明细", e);
		}
		return null;
	}
	
	@RequestMapping("/getTaskActions")
	@ResponseBody
	public String getTaskActions(String taskId){
		try {
			return taskBillService.getTaskActions(taskId);
		} catch (Exception e) {
			ExceptionUtil.error("获取界面按钮出错", e);
			return null;
		}
	}

	@RequestMapping("/doAgree")
	@ResponseBody
	public String doAgree(String userId, String taskId, String note) {
		try {
			note = new String(note.getBytes("ISO8859-1"), "UTF-8");// 解決get提交审批批语乱码
			return taskBillService.doAgree(userId, taskId, note);
		} catch (Exception e) {
			ExceptionUtil.error("审批同意出错", e);
		}
		return null;
	}

	@RequestMapping("/doDisAgree")
	@ResponseBody
	public String doDisAgree(String userId, String taskId, String note) {
		try {
			note = new String(note.getBytes("ISO8859-1"), "UTF-8");// 解決get提交审批批语乱码
			return taskBillService.doDisAgree(userId, taskId, note);
		} catch (Exception e) {
			ExceptionUtil.error("审批不同意出错", e);
		}
		return null;
	}

	@RequestMapping("/doReject")
	@ResponseBody
	public String doReject(String userId, String taskId, String note) {
		try {
			note = new String(note.getBytes("ISO8859-1"), "UTF-8");// 解決get提交审批批语乱码
			return taskBillService.doReject(userId, taskId, note);
		} catch (Exception e) {
			ExceptionUtil.error("审批驳回出错", e);
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
			ExceptionUtil.error("获取审批明细出错", e);
		}
	}

	@RequestMapping("/getPsnDetail")
	@ResponseBody
	public String getPsnDetail(String userId) {
		try {
			return taskBillService.getPsnDetail(userId);
		} catch (Exception e) {
			ExceptionUtil.error("获取人员明细出错", e);
		}
		return null;
	}
}
