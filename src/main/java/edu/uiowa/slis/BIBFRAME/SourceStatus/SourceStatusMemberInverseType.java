package edu.uiowa.slis.BIBFRAME.SourceStatus;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SourceStatusMemberInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SourceStatusMemberInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(SourceStatusMemberInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SourceStatusMemberInverseIterator theSourceStatusMemberInverseIterator = (SourceStatusMemberInverseIterator)findAncestorWithClass(this, SourceStatusMemberInverseIterator.class);
			pageContext.getOut().print(theSourceStatusMemberInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing SourceStatus for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing SourceStatus for member tag ");
		}
		return SKIP_BODY;
	}
}

