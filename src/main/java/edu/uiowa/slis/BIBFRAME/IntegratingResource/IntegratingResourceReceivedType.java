package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceReceivedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceReceivedType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceReceivedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceReceivedIterator theIntegratingResourceReceivedIterator = (IntegratingResourceReceivedIterator)findAncestorWithClass(this, IntegratingResourceReceivedIterator.class);
			pageContext.getOut().print(theIntegratingResourceReceivedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for received tag ");
		}
		return SKIP_BODY;
	}
}

