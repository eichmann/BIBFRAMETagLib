package edu.uiowa.slis.BIBFRAME.SourceStatus;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SourceStatusMemberInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SourceStatusMemberInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(SourceStatusMemberInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SourceStatusMemberInverseIterator theSourceStatusMemberInverseIterator = (SourceStatusMemberInverseIterator)findAncestorWithClass(this, SourceStatusMemberInverseIterator.class);
			pageContext.getOut().print(theSourceStatusMemberInverseIterator.getMemberInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing SourceStatus for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing SourceStatus for member tag ");
		}
		return SKIP_BODY;
	}
}

