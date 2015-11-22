package com.meera.liferay.ipc.events;
import com.liferay.util.bridges.mvc.MVCPortlet;
public class IPCEventListenerPortletAction extends MVCPortlet {	
@javax.portlet.ProcessEvent(qname = "{http://www.liferaysavvy.com}userEmailAddress")
public void handleProcesseuserEmailAddressEvent(javax.portlet.EventRequest request, javax.portlet.EventResponse response) 
            throws javax.portlet.PortletException, java.io.IOException {
    javax.portlet.Event event = request.getEvent();
    String userEmailAddress = (String)event.getValue();
    response.setRenderParameter("userEmailAddress",userEmailAddress);
   
}
}