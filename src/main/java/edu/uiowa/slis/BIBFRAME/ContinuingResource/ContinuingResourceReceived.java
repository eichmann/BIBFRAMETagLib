package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceReceived extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceReceived currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceReceived.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceReceivedIterator theContinuingResourceReceivedIterator = (ContinuingResourceReceivedIterator)findAncestorWithClass(this, ContinuingResourceReceivedIterator.class);
			pageContext.getOut().print(theContinuingResourceReceivedIterator.getReceived());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for received tag ");
		}
		return SKIP_BODY;
	}
}

