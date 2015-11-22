package com.meera.liferay.ipc.events;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletSession;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class IPCEventProducerPortletAction extends MVCPortlet {
 
	public void getData(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException, SystemException {
		   String userEmailAddress = ParamUtil.getString(actionRequest,"userEmailAddress");
		   javax.xml.namespace.QName qName = new javax.xml.namespace.QName("http://www.liferaysavvy.com", "userEmailAddress", "event");
		   actionResponse.setEvent(qName,userEmailAddress);
	}
}
