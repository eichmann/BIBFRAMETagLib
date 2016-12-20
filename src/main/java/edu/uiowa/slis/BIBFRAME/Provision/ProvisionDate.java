package edu.uiowa.slis.BIBFRAME.Provision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProvisionDate extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ProvisionDate currentInstance = null;
	private static final Log log = LogFactory.getLog(ProvisionDate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ProvisionDateIterator theProvision = (ProvisionDateIterator)findAncestorWithClass(this, ProvisionDateIterator.class);
			pageContext.getOut().print(theProvision.getDate());
		} catch (Exception e) {
			log.error("Can't find enclosing Provision for date tag ", e);
			throw new JspTagException("Error: Can't find enclosing Provision for date tag ");
		}
		return SKIP_BODY;
	}
}

