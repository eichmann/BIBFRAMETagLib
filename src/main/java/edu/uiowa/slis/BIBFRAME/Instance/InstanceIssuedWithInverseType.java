package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceIssuedWithInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceIssuedWithInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceIssuedWithInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstanceIssuedWithInverseIterator theInstanceIssuedWithInverseIterator = (InstanceIssuedWithInverseIterator)findAncestorWithClass(this, InstanceIssuedWithInverseIterator.class);
			pageContext.getOut().print(theInstanceIssuedWithInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for issuedWith tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for issuedWith tag ");
		}
		return SKIP_BODY;
	}
}
