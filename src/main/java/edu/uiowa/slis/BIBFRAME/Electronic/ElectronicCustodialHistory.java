package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicCustodialHistory extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicCustodialHistory currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicCustodialHistory.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ElectronicCustodialHistoryIterator theElectronic = (ElectronicCustodialHistoryIterator)findAncestorWithClass(this, ElectronicCustodialHistoryIterator.class);
			pageContext.getOut().print(theElectronic.getCustodialHistory());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for custodialHistory tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for custodialHistory tag ");
		}
		return SKIP_BODY;
	}
}

