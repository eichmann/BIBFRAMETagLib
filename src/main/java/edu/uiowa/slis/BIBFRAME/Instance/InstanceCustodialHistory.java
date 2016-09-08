package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceCustodialHistory extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceCustodialHistory currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceCustodialHistory.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			InstanceCustodialHistoryIterator theInstance = (InstanceCustodialHistoryIterator)findAncestorWithClass(this, InstanceCustodialHistoryIterator.class);
			pageContext.getOut().print(theInstance.getCustodialHistory());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for custodialHistory tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for custodialHistory tag ");
		}
		return SKIP_BODY;
	}
}

