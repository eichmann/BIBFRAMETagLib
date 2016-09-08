package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceIssuedWithType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceIssuedWithType currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceIssuedWithType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstanceIssuedWithIterator theInstanceIssuedWithIterator = (InstanceIssuedWithIterator)findAncestorWithClass(this, InstanceIssuedWithIterator.class);
			pageContext.getOut().print(theInstanceIssuedWithIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for issuedWith tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for issuedWith tag ");
		}
		return SKIP_BODY;
	}
}

